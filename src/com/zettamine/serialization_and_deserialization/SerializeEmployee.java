package com.zettamine.serialization_and_deserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Set;

public class SerializeEmployee {


	public static void serialize(Map<Employee,Set<Certification>> empMap) {
		
		try(FileOutputStream fos = new FileOutputStream("C:\\Users\\Pavithra Kumar\\Desktop\\CustomerData\\Employee.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			
				oos.writeObject(empMap);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Serialization completed");
		
	

	}
	
	
	

}
