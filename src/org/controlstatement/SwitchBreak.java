package org.controlstatement;

import java.util.Scanner;

public class SwitchBreak {

	public void switchmethod() {

		Scanner ss= new Scanner(System.in);
		System.out.println("enter any number");
		int a=ss.nextInt();
		
		switch(a) {
		case 1 :
			System.out.println("monday");
			break;
		case 2 :
			System.out.println("tuesday");
			break;
		case 3 :
			System.out.println("wednesday");
			break;
		case 4 :
			System.out.println("thursday");
			break;
		case 5 :
			System.out.println("friday");
			break;
		case 6 :
			System.out.println("saturday");
			break;
		case 7 :
			System.out.println("sunday");
			break;
		default :
			System.out.println("number out of switch case");



		}


	}


	public void brkcontinuesystemexit()
	{
		for (int i = 0; i <= 10; i++) {
			if(i==6)
			{
				System.exit(0);	
			}
			System.out.println("for loop result");
			System.out.println(i);
		}
		System.out.println("hello");
		System.out.println("for loop ended");
	}
	public static void main(String[] args) {
		SwitchBreak jj = new SwitchBreak();
		jj.switchmethod();
	}

}
