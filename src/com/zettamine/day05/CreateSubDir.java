package com.zettamine.day05;

import java.io.File;
import java.io.IOException;

//Write a java program to create a sub-directory with the name "java" in "C:/CJava" directory 
//and create file with name "java.txt" in the newly created directory

public class CreateSubDir {

	public static void main(String[] args) {
		File f = new File("C:\\Cjava");
		if(!f.exists()) 
		f.mkdir();
		System.out.println("directory created successfully | "+f.getAbsolutePath());
		 f= new File("C:\\Cjava\\java");
		f.mkdirs();
		System.out.println("java sub directory Created Successfully | "+f.getAbsolutePath());
		try {
			f = new File("C:\\Cjava\\java\\java.txt");
			if(!f.exists())
			f.createNewFile();
			System.out.println("java.txt file created successfully | "+f.getAbsolutePath());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
