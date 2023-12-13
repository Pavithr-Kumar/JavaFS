package com.zettamine.day06.number_of_words;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOfEachWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String,Integer> wordCount = new HashMap<>();
		System.out.println("Enter Student's Article ");
		String str = scan.nextLine();
		String[] strArr = str.split("[,;:.?! ]+");
		
		for (String string : strArr) {
			if(!wordCount.containsKey(string.toLowerCase()))
				wordCount.put(string.toLowerCase(), 1);
			else {
				Integer i = wordCount.get(string.toLowerCase());
				wordCount.put(string.toLowerCase(), i+1);
			}
		}
		
		System.out.println("Number of words: "+strArr.length);
		System.out.println("Words with the count");
		for(Map.Entry<String, Integer> entry:wordCount.entrySet())
			System.out.println(entry.getKey()+": "+entry.getValue());
		scan.close();

	}

}
