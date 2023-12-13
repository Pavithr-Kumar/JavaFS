package com.zettamine.day06.insurance_bazaar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InsurancePolicyApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Integer,String> insuPolicies = new HashMap<Integer,String>();
		System.out.print("Enter the no of Policy names you want to store:");
		int id;
		String policy;
		int count =scan.nextInt();
		for(int i=0;i<count;i++) {
			System.out.print("Enter the Policy ID : ");
			id=scan.nextInt();
			scan.nextLine();
			System.out.print("Enter the Policy Name : ");
			policy=scan.nextLine();
			addPolicyDetails (insuPolicies,id,policy);
			
		}
		System.out.println();
		for(Map.Entry<Integer, String> entry:insuPolicies.entrySet()) 
			System.out.println(entry.getKey()+" "+entry.getValue());
		System.out.println();
		System.out.print("Enter the policy type to be searched : ");
		
		searchBasedOnPolicyType(insuPolicies,scan.nextLine());

	}

	private static void addPolicyDetails(Map<Integer, String> insuPolicies, int id, String policy) {
		insuPolicies.put(id, policy);
		
	}
	
	private static void searchBasedOnPolicyType(Map<Integer, String> insuPolicies,String polType) {
		for(Map.Entry<Integer, String> entry:insuPolicies.entrySet()) {
			if(entry.getValue().toLowerCase().contains(polType.toLowerCase()))
				System.out.println(entry.getKey());
		}
		
	}

}
