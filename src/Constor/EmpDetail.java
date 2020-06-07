package Constor;

public class EmpDetail {
	

	public EmpDetail() {
		System.out.println("parent class default constructor");
	}
	public EmpDetail(int a) {
		//this("yuvraj");
		System.out.println("parameterized constructor for int "+a);
	}	
	
	public EmpDetail(String s) {

		System.out.println("parameterized constructor for string " +s);
		System.out.println("parameterized constructor for string " +s);

	}	
	
	public static void main(String[] args) {

		//EmpDetail lll=new EmpDetail();
		EmpDetail lll=new EmpDetail(10);
	}

}
