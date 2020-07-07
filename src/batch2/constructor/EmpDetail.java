package batch2.constructor;

public class EmpDetail {

	public EmpDetail() 
	{

		int a=10;
		int b=20;
		//System.out.println(a + "  " +b);

	}

	public EmpDetail(String name) 
	{
		//this("yuvraj","chennai");
		//System.out.println("parameterized constructor empname " +name);
	}

	public EmpDetail(String Empname,String EmpAddress)
	{
		//System.out.println("parameterized constructor empname and empaddress :"+Empname +EmpAddress) ;
	}

	public EmpDetail(String gender,int Empid)
	{
		//System.out.println("parameterized constructor gender and empid :"+gender +Empid);
	}

	public static void main(String[] args) {

		EmpDetail kh = new EmpDetail("ff");
	


	}

}
