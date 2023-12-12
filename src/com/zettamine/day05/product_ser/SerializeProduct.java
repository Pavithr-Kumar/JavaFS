package com.zettamine.day05.product_ser;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("how many products to be saved: ");
		int n =scan.nextInt();
		Product[] prodArr = new Product[n] ;
		int id;
		String name;
		for(int i=0;i<prodArr.length;i++) {
			System.out.println("enter product id & product name of Product-"+(i+1)+":");
			id=scan.nextInt();
			name =scan.next();
			prodArr[i]=new Product(id,name);
		}
		scan.close();
		
		try(FileOutputStream fos = new FileOutputStream("C:\\Cjava\\java\\stocks.ser"); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			for (Product product : prodArr) {
				oos.writeObject(product);
			}
			System.out.println("All products are serialized..");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		

	}

}
