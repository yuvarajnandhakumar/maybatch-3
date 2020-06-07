package org.project.overlaod;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Overload1 {

	public void method1(String name) {
		
	}
	public void method1(int idcard) {
		
		System.out.println(idcard);

	}
	
	public void addition(int a)
	{
		System.out.println("hi all " +a);
		System.out.println("running some script");
	}
	
	public void method1(String surname, String lastname)
	{
		
	}
	
	public void method1(String surname, int lastname)
	{
		
	}
	
	public void method1(int surname, String lastname)
	{
		
	}
	
	
	
	public static void main(String[] args) {
		Overload1 jj = new Overload1();
		jj.method1(10);
		jj.method1("4545");
		jj.method1("yuvaraj", "N");
		
	}

}
