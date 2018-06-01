package SerializationSamples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import pojos.Employee;

public class DeserializationExample {
	
	public static void main(String[] args) {
		Employee emp = null;
		
		try{
			
			FileInputStream fileInputStream = new FileInputStream("/Users/455813/Desktop/employee.txt");
			ObjectInputStream objectInput = new ObjectInputStream(fileInputStream);
			emp = (Employee) objectInput.readObject();
			objectInput.close();
			fileInputStream.close();
		
			System.out.println("CEO NAME:"+emp.getCEOName() + "  Country Name:   "+emp.getCountry()+"    "+emp.getDum());
			
		}catch(IOException io){
			io.printStackTrace();
		}catch(ClassNotFoundException cnf){
			cnf.printStackTrace();
		}
		
		System.out.println("Emp Name: "+emp.getName() + " *Emp City*  "+emp.getCityName());
	}

}
