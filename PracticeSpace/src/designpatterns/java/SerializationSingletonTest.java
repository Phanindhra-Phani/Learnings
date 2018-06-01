package designpatterns.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationSingletonTest {

	public void testSingleton() {

		SerializationSingleton instanceOne = SerializationSingleton
				.getInstance();

		try {

			FileOutputStream fileOp = new FileOutputStream(
					"/Users/455813/Desktop/serial.txt");
			ObjectOutputStream objOp = new ObjectOutputStream(fileOp);
			objOp.writeObject(instanceOne);

			objOp.close();
			fileOp.close();
			
			instanceOne.setX(200);
			
			FileInputStream fileInputStream = new FileInputStream("/Users/455813/Desktop/serial.txt");
			ObjectInputStream objIp = new ObjectInputStream(fileInputStream);
			
			SerializationSingleton instanceTwo = (SerializationSingleton) objIp.readObject();
			
			objIp.close();
			fileInputStream.close();
			
			System.out.println(instanceOne.getX());
			System.out.println(instanceTwo.getX());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} catch(ClassNotFoundException cf){
			cf.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		
		SerializationSingletonTest serializationSingletonTest = new SerializationSingletonTest();
		serializationSingletonTest.testSingleton();
		
	}

}
