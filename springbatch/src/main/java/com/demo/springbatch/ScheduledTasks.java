package com.demo.springbatch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.vera.sdk.Context;
import com.vera.sdk.Sdk;
import com.vera.sdk.Securer;
import com.vera.sdk.Securer.SecureInputStreamResult;

//https://netjs.blogspot.com/2017/04/reading-all-files-in-folder-java-program.html
//https://javarevisited.blogspot.com/2011/12/create-file-directory-java-example.html
//http://journals.ecs.soton.ac.uk/java/tutorial/java/io/filestreams.html

@Component
public class ScheduledTasks {
	
	static Securer securer = null;
	static {
		try {
			Sdk.initialize();
			securer = createSecurer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static Securer createSecurer() throws FileNotFoundException {
		
		String currentDir = System.getProperty("user.dir");
		Context context = new Context(new File(currentDir, "conf.json"));
		return new Securer(context);
		
	}

	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	String outputBasePath = "/Users/455813/Documents/StudyMaterial/Vera/FileTree/OutputFolder";

	String basePath = "/Users/455813/Documents/StudyMaterial/Vera/FileTree";

	static List<String> secretKeyListFolder = new ArrayList<>();
	{
		secretKeyListFolder.add("Subfolder1");
		secretKeyListFolder.add("Subfolder2");
	}

//  @Scheduled(fixedRate = 500000)
	@Scheduled(cron = "0 0/1 * 1/1 * ?")
	public void reportCurrentTime() throws Exception {
		log.info("The time is now {}", dateFormat.format(new Date()));

		ScheduledTasks listFiles = new ScheduledTasks();

		for (String folderName : secretKeyListFolder) {

			File folder = new File(basePath + "/" + folderName);
			System.out.println("Folder Path::: " + folder.getAbsolutePath());
			listFiles.listAllFiles(folder, folderName);
		}

	}

	public void listAllFiles(File folder, String folderName) throws IOException {
		System.out.println("In listAllfiles(File) method");
		File[] fileNames = folder.listFiles();
		List<Object[]> objectList = new ArrayList<>();
		String outputFolderPath = "";
		for (File file : fileNames) {
			if (file.isDirectory()) {
				listAllFiles(file, folderName);
			} else {
				try {
					System.out.println("File name is  ::: " + file.getName());
					// secure a file and upload the file to a folder
					File outputFolder = new File(outputBasePath + "/Output" + folderName);
					if (!outputFolder.isDirectory()) {
						outputFolder.mkdir();
					}
					
					outputFolderPath = outputFolder.getAbsolutePath();
					//readContent(file, outputFolder.getAbsolutePath() + "/" + file.getName());
					String docId = secureFile(file, outputFolder.getAbsolutePath() + "/" + file.getName());
					
					  Object[] obj = new Object[] { file.getName(), docId };
					  objectList.add(obj);
				} catch (Exception exception) {
					exception.printStackTrace();
				}

			}
		}
		
		//
		constructCSVIterator(objectList, outputFolderPath);
		
	}

	public void readContent(File file, String filePath) throws IOException {
		System.out.println("read file " + file.getCanonicalPath());
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			// Read lines from the file, returns null when end of stream
			// is reached
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream(filePath);
			int c;
			
			 while ((c = fis.read()) != -1) {
	               fos.write(c);
	         }
			 fis.close();
	         fos.close();
		}
	}
	
	public String secureFile(File file, String filePath) throws IOException {
		System.out.println("read file " + file.getCanonicalPath());
			
		FileInputStream inputStream = new FileInputStream(file);
		String hashcode = generateUUID();
		SecureInputStreamResult secureInputStreamResult = 
				securer.secureInputStream(inputStream, file.getName(), hashcode);
		
		InputStream  secureInputStream = secureInputStreamResult.getSecureStream();
		
		// Read lines from the file, returns null when end of stream
		// is reached
		FileOutputStream fos = new FileOutputStream(filePath);
		int c;
		
		 while ((c = secureInputStream.read()) != -1) {
               fos.write(c);
         }
		 secureInputStream.close();
         fos.close();
         
         return secureInputStreamResult.getDocId();
	}
	
	private String generateUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	private static void constructCSVIterator(List<Object[]> mainList, String outputFolderPath) throws IOException  {
		StringBuilder builder = new StringBuilder();
		constructCSV(builder, mainList);
		
		FileOutputStream fileOutputStream = new FileOutputStream(outputFolderPath+"/"+"outputFileName.csv");
		fileOutputStream.write(builder.toString().getBytes());
		
		fileOutputStream.close();
	}
	 
	private static  void constructCSV(StringBuilder builder, List<Object[] > entry)
			throws IOException {

		for (Object[] object : entry) {

			
			if (object != null) {
				
					builder.append("\"" + object[0].toString() + "\",").append("\"" + object[1].toString() + "\",");
			} else {
				builder.append("\"\",");
			}
			builder.append("\n");
		}

	}
}