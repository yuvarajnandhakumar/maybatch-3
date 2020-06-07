package org.controlstatement;

public class Controlstatement {

	public void controlstmt() {

		int i=10;

		if(i==9)
		{
			System.out.println("value of i is first if "+i);
		}

		else if(i==10)
		{
			if(i<5)
			{
				System.out.println("i is less than 5");
			}
			else
			{
				System.out.println("i is not lesser than 5");
			}
		}
		else
		{
			System.err.println("value of i is " +i);
		}

	}


	public void whileloop() {

		int i=5;
		while (i<=10) 
		{
			System.out.println(i);
			i++;
		}

	}

	public void dowhile() {
		int i=7;
		do
		{  
			// code block to be executed
			System.out.println("value of i is :" +i );  
			i++;  
		}
		while(i<9);  


	}

	public void forloop() {

		int i=10;
		for (int j = 5; j < i; j++) 
		{
			for (int k = 5; k < i; k++) 
			{
				System.out.println("2nd for loop result :" +k);
			}
		System.out.println("1st for loop :"+j);
		}
	}
	public static void main(String[] args) {

		Controlstatement hh = new Controlstatement();
		hh.forloop();

	}

}
