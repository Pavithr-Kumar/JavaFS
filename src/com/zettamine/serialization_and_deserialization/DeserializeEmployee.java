package com.zettamine.serialization_and_deserialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;
import java.util.Set;

public class DeserializeEmployee {

	public static Map<Employee,Set<Certification>> deserialize() {
		Map<Employee,Set<Certification>> empMap=null;
		
		try(FileInputStream fis = new FileInputStream("C:\\Users\\Pavithra Kumar\\Desktop\\CustomerData\\Employee.ser");
			ObjectInputStream oos = new ObjectInputStream(fis);) 
		{   
			empMap =  (Map<Employee,Set<Certification>>) oos.readObject();
			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			System.out.println("Desrialization completed");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		
		
		return empMap;
	}
}
