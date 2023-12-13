package com.zettamine.day06.new_words;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NumberOfNewWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Set<String> strSet = new TreeSet<String>();
		System.out.println("Enter Student's Article:");
		System.out.println();
		String str =scan.nextLine();
		String[] arr = str.split("[,;:.?! ]+");
		for (String string : arr) {
			strSet.add(string.toLowerCase());
		}
		System.out.println("Number of words: "+arr.length);
		System.out.println("Number of unique words: "+strSet.size());
		System.out.println("The words are ");
		int i=0;
		for (String string : strSet) {
			System.out.println((++i)+"."+string);
		}
		

	}

}
