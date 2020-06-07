package Constor;

public class EmpName extends EmpDetail{


	public EmpName() {
		super("mani");

		System.out.println("child class def constructor");
	}
	
	public EmpName(String name) {

		System.out.println("par constructor one string");
	}
	
	public EmpName(String fname, String lname) {
		System.out.println("par constrcutor two string");
	}
	
	public static void main(String[] args) {
		EmpName  obj = new EmpName("yuvaraj");
		

	}
}
