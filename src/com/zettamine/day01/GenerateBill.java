package com.zettamine.day01;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int noOfPizzas,noOfPuffs,noOfCoolDrinks;
		System.out.print("Enter the no of pizzas bought: ");
		noOfPizzas = scan.nextInt();
		System.out.print("Enter the no of puffs bought: ");
		noOfPuffs = scan.nextInt();
		System.out.print("Enter the no of cool drinks bought: ");
		noOfCoolDrinks = scan.nextInt();
		float total = (float)(noOfPizzas*100 + noOfPuffs*20 + noOfCoolDrinks*10);
		System.out.println();
		System.out.println("Bill Details");
		System.out.println("No of Pizzas:\t\t"+noOfPizzas+"\t"+"Cost:\t"+noOfPizzas*100);
		System.out.println("No of Puffs:\t\t"+noOfPuffs+"\t"+"Cost:\t"+noOfPuffs*20);
		System.out.println("No of Cool Drinks:\t"+noOfCoolDrinks+"\t"+"Cost:\t"+noOfCoolDrinks*10);
		System.out.println();
		System.out.printf("Total Price = %.2f\n",total);
		System.out.println("ENJOY THE SHOW!!!");
        scan.close();
	}

}
