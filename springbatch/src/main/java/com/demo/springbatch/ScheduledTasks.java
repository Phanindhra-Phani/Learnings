package com.demo.springbatch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//https://netjs.blogspot.com/2017/04/reading-all-files-in-folder-java-program.html
//https://javarevisited.blogspot.com/2011/12/create-file-directory-java-example.html

@Component
public class ScheduledTasks {

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
	public void reportCurrentTime() {
		log.info("The time is now {}", dateFormat.format(new Date()));

		ScheduledTasks listFiles = new ScheduledTasks();

		for (String folderName : secretKeyListFolder) {

			File folder = new File(basePath + "/" + folderName);
			System.out.println("Folder Path::: " + folder.getAbsolutePath());
			listFiles.listAllFiles(folder, folderName);
		}

	}

	public void listAllFiles(File folder, String folderName) {
		System.out.println("In listAllfiles(File) method");
		File[] fileNames = folder.listFiles();
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

					readContent(file, outputFolder.getAbsolutePath() + "/" + file.getName());
//					File f = new File(outputFolder.getAbsolutePath() + "/" + file.getName());
				} catch (Exception exception) {
					exception.printStackTrace();
				}

			}
		}
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
}