package org.datatype;

import org.omg.CORBA.DATA_CONVERSION;

public class DataType {


	 boolean jj;
	static String kk;
	static boolean ll;
	
	
	public void empid() {
		int a=896767;
		//int ai=9003994682;
		long aa=9003994682l;
		System.out.println(a);
	}

	public void empid2(int a)
	{
		System.out.println(a);
	}

	public void empname(String name) {
		
		System.out.println(jj);
	
		for(char i=0;i<130;i++)
		{
			//char j=i;
			System.out.println(i);
		}
		char j=153;
		System.out.println(j);
		
		char g=(char) -1;
		System.out.println(Integer.valueOf(g));
	}

	public void salary(double salary) {
		System.out.println(salary);
	}
	
	public void phno(long phno) {
		System.out.println(phno);
	}
	

	public static void main(String[] args) {

		DataType gg = new DataType();
		
		gg.empname("yuvraj");
		
		
		

	}

}
