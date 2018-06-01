package exceptionalhandling.java;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundProgram {
	
	public void fileAccess(){
		try{
			FileReader fr = new FileReader("Sravan");
//		}catch(Exception e){
//			System.out.println(e.getMessage());
//		}
		}
		catch(FileNotFoundException fn){
			System.out.println(fn.getMessage());
		}finally{
			System.out.println("Comes here for sure");
		}
	}
	
	public static void main(String[] args) {
		
		FileNotFoundProgram fileNotFoundProgram = new FileNotFoundProgram();
		fileNotFoundProgram.fileAccess();
		
	}

}
