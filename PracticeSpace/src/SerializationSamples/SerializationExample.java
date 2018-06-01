package SerializationSamples;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import pojos.Employee;


public class SerializationExample {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setCityName("Hanamkonda");
		emp.setName("Sravan Kumar");
		emp.setCountry("India");
		
		try{
			FileOutputStream fileOutputStream = new FileOutputStream("/Users/455813/Desktop/employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
			out.writeObject(emp);
			out.close();
			fileOutputStream.close();
			System.out.println("Serializing Employee Object");
		}catch(IOException fnf){
			fnf.printStackTrace();
		}
	}

}
