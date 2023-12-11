package com.zettamine.day01;

import java.util.Scanner;

public class DisplayCharacters {
    
	public static void main(String[] args) {
		//Program to convert int to its corresponding character based on ASCII value of that int
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[4];
		System.out.println("Enter 4 Numbers:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		for (int x : arr) {
			System.out.println(x+"-"+(char)x);
		}
        scan.close();
	}

}
