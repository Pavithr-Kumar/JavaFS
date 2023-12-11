package com.zettamine.day01;

import java.util.Scanner;

public class leastOffer {

	public static void main(String[] args) {
		
		int noOfItems;
		Scanner scan = new Scanner (System.in);
		System.out.print("enter the number of items: ");
		noOfItems=scan.nextInt();
		scan.nextLine();
		String[] itemsWithDetails= new String[noOfItems];
		for(int i=0;i<noOfItems;i++)
			itemsWithDetails[i]= scan.nextLine();
		scan.close();
		
		Object[][] arr = new Object[noOfItems][3];
		
		for(int i=0;i<noOfItems;i++)
			arr[i]=itemsWithDetails[i].split(",");
		
		int minDis = Integer.MAX_VALUE;
		int[] discArr = new int[noOfItems];
		for(int i=0;i<noOfItems;i++) {
			//if((Integer.parseInt((String) arr[i][1])*(Integer.parseInt((String) arr[i][2]))/100)<minDis)
				discArr[i] = Integer.parseInt((String) arr[i][1])*(Integer.parseInt((String) arr[i][2]))/100;
		}
		
		for(int i=0;i<noOfItems;i++) {// Finding Minimum discount
			if(minDis>discArr[i])
				minDis=discArr[i];
		}
		System.out.print("Items with Minimum Discount: ");
		for(int i=0;i<noOfItems;i++) {
			if((Integer.parseInt((String) arr[i][1])*(Integer.parseInt((String) arr[i][2]))/100)==minDis)
				System.out.print(arr[i][0]+" ");
		}
		
		
		scan.close();
	}

}
