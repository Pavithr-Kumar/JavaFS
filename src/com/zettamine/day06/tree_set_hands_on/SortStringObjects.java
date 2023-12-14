package com.zettamine.day06.tree_set_hands_on;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortStringObjects {

	public static void main(String[] args) {
		Set<String> strSet = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length()==o2.length())
					return o1.compareTo(o2);
				return o1.length()-o2.length();
			}

			
			
		});
		strSet.add( new String("Ravi"));
		strSet.add( new String("Raja"));
		strSet.add( new String("Suraj"));
		strSet.add( new String("Suresh"));
		strSet.add( new String("Nagendra"));
		strSet.add( new String("Raju"));
		
		System.out.println(strSet);

	}

}
