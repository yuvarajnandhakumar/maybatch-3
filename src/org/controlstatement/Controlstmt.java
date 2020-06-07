package org.controlstatement;

import java.util.Scanner;

public class Controlstmt {

	public void ifmethod() {
		int i=10;
		if(i==10)
		{
			System.out.println(i +" is not equal to 9");
		}

		else if(i==10)
		{
			System.out.println(i +" is not equal to 8");
		}
		else
		{
			System.out.println(i +" is not equal to 10");
		}
	}

	public void formethod() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(j +"value");
			}
			System.out.println(i);

		}			
	}

	public void domethod() {

		int i=1;  
		do{  
			System.out.println(i);  
			i++;  
		}
		while(i<=10);  


		int j = 0;
		while (j < 5) {
			System.out.println(j + "while loop");
			j++;
		}

	}

	public void switchcase() {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the day which you need to print");
		
		String j = s.next();
		
		char c = j.charAt(0);
			
		switch (c) {
		case 'A':
			System.out.println("Monday");
			break;
		case 'B':
			System.out.println("Tuesday");
			break;
		case 'C':
			System.out.println("Wednesday");
			break;
		case 'D':
			System.out.println("Thursday");
			break;
		case 'E':
			System.out.println("Friday");
			break;
		case 'F':
			System.out.println("Saturday");
			break;
		case 'G':
			System.out.println("Sunday");
			break;
		default:
			System.out.println("No days found for the value :"+j);
			break;
		}
	}

	public void brk()
	{
		for(int i=1;i<=10;i++){  
			if(i==3){  
				continue;  
			}
			System.out.println(i);			
		}
	}

	public void systemexit()
	{
		int a = 10;

		for (int i = 0; i<10; i++) 
		{ 
			if (i >= 5) 
			{ 
				System.out.println("exit..."); 
				System.exit(0); 
			} 
			else
				System.out.println(i); 
		} 
		System.out.println("End of Program"); 
	}
	public static void main(String[] args) {
		Controlstmt gg = new Controlstmt();
		gg.switchcase();
	}

}
