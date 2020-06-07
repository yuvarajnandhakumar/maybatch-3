package org.project.overlaod;

public class Override1 extends Overload1{
	
	//method1 / addition - created in overlaod1 class
	
	@Override
	public void addition(int a) {
		super.addition(a);
		
		System.out.println("started execution of override script");
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Override1 gg = new Override1();
		gg.addition(20);
	}

}
