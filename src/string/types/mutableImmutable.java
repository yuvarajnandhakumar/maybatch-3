package string.types;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class mutableImmutable {

	public static void main(String[] args) {
		System.out.println("immutable");
		String s1 = "my name";
		String s2 =" is yuvarj";
		String s3 = s1.concat(s2);	
		System.out.println(s3);

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));

		System.out.println("mutable");
		StringBuffer s4=new StringBuffer("yuva");
		StringBuffer s5=new StringBuffer("raj");
		System.out.println("s4 value :" +s4);
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));

		s4.append(s5);
		System.out.println("s4 value :" +s4);
		System.out.println("after modifing");
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));

		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		 
		 Date date = new Date();
		 String date1= dateFormat.format(date);
		 System.out.println(date1);
		 char[] ch = date1.toCharArray();
		 System.out.print(ch[3]);
		 System.out.print(ch[4]);

		


	}

}
