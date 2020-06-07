package org.controlstatement;

import java.util.Scanner;

public class ContrlStatement {


	public void switchmethod() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the CHARACTER to display the value");
		String ss= s.next();
		char c= ss.charAt(0);
		switch(c)
		{
		case 'M' :
			System.out.println("monday");
			break;
		case 'T' :
			System.out.println("tuesday");
			break;
		case 'W' :
			System.out.println("wednesday");
			break;
		case 'H' :
			System.out.println("thursday");
			break;
		case 'F' :
			System.out.println("friday");
			break;
		case 'S' :
			System.out.println("saturday");
			break;
		case 'U' :
			System.out.println("sunday");
			break;
		default:
			System.out.println("CHARACTER not exist in switch case");
		}

		System.out.println("switch case executed");

	}

	public void brkconti() {

		int n=10;
		for (int j = n; j >= n; j--) {

			if(j==5)
			{
				System.exit(0);
			}
			System.out.println(j);
		}

		System.out.println("outside for loop");
		System.out.println("statement after for loop");
	}
	public static void main(String[] args) {

		ContrlStatement kk = new ContrlStatement();
		kk.switchmethod();
	}

}
