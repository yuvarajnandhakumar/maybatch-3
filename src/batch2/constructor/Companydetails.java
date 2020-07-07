package batch2.constructor;

import org.userdefined.empDetails;

public class Companydetails extends EmpDetail{

	public Companydetails() {
		//super("yuvaraj","address");
		//System.out.println("default constructor of child class");
	}
	
	public Companydetails(String name) {
		//System.out.println("para constructor of child class string" +name );
	}
	
	public Companydetails(int no) {
		//System.out.println("para constructor of child class int"+no);
	}
	

	public static void main(String[] args) {

		Companydetails scd = new Companydetails(22);


	}

}
