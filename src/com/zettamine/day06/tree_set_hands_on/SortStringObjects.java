package com.zettamine.day06.tree_set_hands_on;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortStringObjects {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Set<String> strSet = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length()==o2.length())
					return o1.compareTo(o2);
				return o1.length()-o2.length();
			}

			
			
		});
		System.out.print("how many students: ");
		int count =scan.nextInt();
		scan.nextLine();
		for(int i=0;i<count;i++) {
			System.out.print("enter student-"+(i+1)+" name:");
			strSet.add(scan.nextLine());
		}
		
		count=1;
		for (String string : strSet) {
			System.out.println((count++)+". "+string);
		}
	

	}

}
