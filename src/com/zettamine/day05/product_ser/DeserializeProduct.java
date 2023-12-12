package com.zettamine.day05.product_ser;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class DeserializeProduct {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("enter product ID:");
		int id = scan.nextInt();
		Product p;
	  try(FileInputStream fis = new FileInputStream("C:\\Cjava\\java\\stocks.ser");ObjectInputStream ois = new ObjectInputStream(fis); ) {
		  while(true){
			  p =(Product) ois.readObject();
			  if(p.getpId() == id) {
				  System.out.println("Product with id "+p.getpId()+" is "+p.getpName());
				  break;
			  }
		  }
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (EOFException e) {
		System.out.println("No products with Pid:"+id);
	}  catch (IOException e1) {
		e1.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}

	}

}
