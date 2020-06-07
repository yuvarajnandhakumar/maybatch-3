package org.project.override;

public class Bank {

	public void Saving(int a) {

		System.out.println("you account has rupees of :" +a);
	}
	
	public static void main(String[] args) {
		Bank bb = new Bank();
		bb.Saving(454);
	}

}
