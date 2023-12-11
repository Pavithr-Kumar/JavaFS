package com.zettamine.day03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueWords {

	public static void main(String[] args) {
		Set<String> strSet= new HashSet<>();
		Scanner scan = new Scanner(System.in);
		String str = "Hello Everybody, welcome to collection in JAVA. Collection, "
				   + "is like a container and powerful conecpt in Java!";
//		System.out.println("Enter Student's Article");
//		str = scan.nextLine();
		String[] arr=str.split("[,!.\\s]+");
		for (String string : arr) {
			strSet.add(string.toLowerCase());
		}
		System.out.println("Number of words "+arr.length);
		System.out.println("Number of unique words "+strSet.size());
		System.out.println(Arrays.toString(arr));
		
	}

}
