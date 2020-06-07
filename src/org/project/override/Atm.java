package org.project.override;

public class Atm extends Bank{
	
	@Override
	public  void Saving(int a) {
		super.Saving(a);
		System.out.println("previous scripts executed");
		
		int b=1000;
		System.out.println("deposit: " +b);
		
		
		int c=b+a;
		System.out.println("Total amount " +c);
		
		
		
	}
	
	public static void main(String[] args) {
		Atm aa = new Atm();
		aa.Saving(100);
	}

}
