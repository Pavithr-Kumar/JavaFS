package com.zettamine.day04.area_volume_calculator;

import java.util.Scanner;

public class CaclAreaVolume {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Shape[]  shapeArr = new Shape[5];
		System.out.println("1.Triagle\n2.Rectangle\n3.Sphere\n4.Cube");
		int opt =0;
		for(int i=0;i<shapeArr.length;i++) {
			System.out.println("Enter next Shape\n1.Triagle\n2.Rectangle\n3.Sphere\n4.Cube");
			opt = scan.nextInt();
			switch(opt) {
			case 1:
				System.out.println("Enter base & height of Triangle:");
				double b=scan.nextDouble();
				double h=scan.nextDouble();
				shapeArr[i]=new Triangle(b, h);
				break;
			case 2:
				System.out.println("Enter length & width of Rectangle:");
				 b=scan.nextDouble();
				 h=scan.nextDouble();
				shapeArr[i]=new Rectangle(b, h);
				break;
			case 3:
				System.out.println("Enter radius of Sphere:");
				b=scan.nextDouble();
				shapeArr[i]=new Sphere(b);
				break;
			case 4:
				System.out.println("Enter length, width & height of Triangle:");
				 b=scan.nextDouble();
				 h=scan.nextDouble();
				 double l = scan.nextDouble();
				 shapeArr[i]= new Cube(l, i, h);
				 break;
			default :
				System.out.println("Invalid input");
				return;
			}
		}
		
		for(int i=0;i<shapeArr.length;i++) {
			System.out.println(shapeArr[i].getClass().getSimpleName());
			if(shapeArr[i] instanceof Spatial) {
				System.out.println("Area   = "+shapeArr[i].area());
				System.out.println("Volume = "+shapeArr[i].volume());
			}
			else
				System.out.println("Area   = "+shapeArr[i].area());
		}

	}

}
