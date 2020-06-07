package arraycollection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TwoDimenArray {


	private void maps() {

		Map<Integer, String> m = new TreeMap<Integer,String>();
		m.put(4, "testd");
		m.put(2, "testb");
		m.put(3, "testc");
		System.out.println(m);

		Set<Entry<Integer,String>> obj1 = m.entrySet();
		for(Entry<Integer, String> obj2:obj1)
		{
			System.out.println(obj2);
		}

		for (Map.Entry m1:m.entrySet()) { 
			System.out.println(m1.getKey()+"="+m1.getValue()); 
		} 	}


	private void hashtable() {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
		ht.put(101," ajay"); 
		ht.put(104,"Vijay"); 
		ht.put(103,"ajay"); 
		ht.put(104,"Vijay"); 
		System.out.println("-------------Hash table--------------"); 
		for (Map.Entry m:ht.entrySet()) { 
			System.out.println(m.getKey()+" "+m.getValue()); 
		} 

		//----------------hashmap-------------------------------- 
		HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
		hm.put(100,"Amit"); 
		hm.put(104,"Amit");  // hash map allows duplicate values 
		hm.put(101,"Vijay"); 
		hm.put(102,"Rahul"); 
		System.out.println("-----------Hash map-----------"); 
		for (Map.Entry m:hm.entrySet()) { 
			System.out.println(m.getKey()+" "+m.getValue()); 
		} 
	} 

	public static void main(String[] args) {

		TwoDimenArray m = new TwoDimenArray();
		m.hashtable();
			int dd[][][] = new int[3][3][3];
			dd[0][0][0]=15;
			dd[0][1][0]=2;
			dd[0][2][0]=45;

			dd[2][2][0]=45;
			dd[1][0][0]=3;
			dd[1][1][0]=4;

				System.out.println(dd[0][0][0]);


	}

}
