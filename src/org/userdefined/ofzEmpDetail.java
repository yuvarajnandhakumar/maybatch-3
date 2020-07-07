package org.userdefined;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ofzEmpDetail {
	
	public static void main(String[] args) {


		empDetails obj1 = new empDetails();
		obj1.setEmpid(1001);
		obj1.setEmpname("vipin");
		obj1.setPhno(7878787878l);
		obj1.setSalary(45000);

		empDetails obj2 = new empDetails();
		obj2.setEmpid(1002);
		obj2.setEmpname("ashok");
		obj2.setPhno(8989898l);
		obj2.setSalary(46000);

		empDetails obj3 = new empDetails();
		obj3.setEmpid(1003);
		obj3.setEmpname("harsha");
		obj3.setPhno(7877787896l);
		obj3.setSalary(45500);
		
		Map<Integer,empDetails> li =new HashMap<Integer,empDetails>();

		li.put(0,obj1);
		li.put(1,obj2);
		li.put(2,obj3);
				
		Set<Entry<Integer, empDetails>> dd = li.entrySet();
		
		for (Entry<Integer, empDetails> a : dd) {
			
			empDetails value = a.getValue();
			System.out.println(value);
			System.out.println(a.getValue().getEmpname());
			System.out.println(a.getValue().getEmpid());
			System.out.println(a.getValue().getEmpname());
			System.out.println(a.getValue().getPhno());
			System.out.println(a.getValue().getSalary());
		}
		
		
		/*for (empDetails dd : li) {

			System.out.println(dd.getEmpid());
			System.out.println(dd.getEmpname());
			System.out.println(dd.getPhno());
			System.out.println(dd.getSalary());

		}*/






	}
}
