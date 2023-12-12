package com.zettamine.day05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDosCommand {

	public static void main(String... args) {
		// copy sourceFile destinationFile --> DOS copy command
		// copy c:\data\file1.doc D:\backup\file2.doc -->variable arguments

		File f1 = new File(args[1]);
		if (!f1.exists()) {
			System.out.println("Source file does not exist");
			return;
		}
		File f2 = new File(args[2]);
		if (!f2.exists()) {
			System.out.println("Destination file does not exist");
			return;
		}

		try (FileReader fr = new FileReader(args[1]); FileWriter fw = new FileWriter(args[2]);) {
        
			while(true) {
				int x = fr.read();
				fw.write(x);
				if(x==-1)
					break;
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Copied Successfully");

	}

}
