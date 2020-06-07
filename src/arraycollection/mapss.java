package arraycollection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapss {

	public void hashmap() {
		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(3, "abishek");
		m.put(1, "abishek");
		m.put(2, "yuvraj");
		m.put(4, "karthi");
		m.put(2, "rajesh");

		System.out.println(m);
		System.out.println(m.get(2));

		for (Map.Entry n:m.entrySet()) {
			System.out.println(n.getKey() + " " +n.getValue());
		}


	}

	public void linkedhashmap() {

		Map<Integer, String> m = new LinkedHashMap<Integer, String>();
		m.put(3, "abishek");
		m.put(1, "abishek");
		m.put(2, "yuvraj");
		m.put(4, "karthi");
		m.put(2, "rajesh");

		System.out.println(m);
		System.out.println(m.get(2));

		for (Map.Entry n:m.entrySet()) {
			System.out.println(n.getKey() + " " +n.getValue());
		}
	}

	public void treemap() {
		Map<Integer, String> m = new TreeMap<Integer, String>();
		m.put(3, "abishek");
		m.put(1, "abishek");
		m.put(2, "yuvraj");
		m.put(4, "karthi");
		m.put(2, "rajesh");

		System.out.println(m);
		System.out.println(m.get(2));

		for (Map.Entry n:m.entrySet()) {
			System.out.println(n.getKey() + " " +n.getValue());
		}
	}
	public void hashtable() {
		Map<Integer, String> m = new Hashtable<Integer, String>();
		m.put(3, "abishek");
		m.put(1, "abishek");
		m.put(2, "yuvraj");
		m.put(4, "karthi");
		m.put(2, "rajesh");

		System.out.println(m);
		System.out.println(m.get(2));

		for (Map.Entry n:m.entrySet()) {
			System.out.println(n.getKey() + " " +n.getValue());
		}
	}

	public static void main(String[] args) {
		mapss mm = new mapss();
		//mm.hashmap();
		//mm.linkedhashmap();
		mm.treemap();
		mm.hashtable();
	}

}
