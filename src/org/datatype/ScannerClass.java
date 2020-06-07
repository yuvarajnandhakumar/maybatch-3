package org.datatype;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter you atm pin number");
		int pinnumber = obj.nextInt();
		System.out.println(" you atm pin number: " +pinnumber);
	
		
		System.out.println("enter your ph no");
		long phno = obj.nextLong();
		System.out.println(" your ph no :" +phno  +" " +"ph noumber displayed");

		System.out.println("enter you option saving/current");
		String option = obj.next();
		System.out.println(" you option saving/current: " +option);

		
		System.out.println("enter amount for withdraw");
		float amount = obj.nextFloat();
		System.out.println(" amount for withdraw: " +amount);

		
		System.out.println("do u need to continue y /n");
		boolean yes = obj.nextBoolean();
		System.out.println("do u need to continue y /n :" +yes);

		
	}

}
