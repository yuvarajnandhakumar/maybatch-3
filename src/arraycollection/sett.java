package arraycollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class sett {

	private void hashset() {
		Set s = new HashSet<>();

		s.add(10);
		s.add(20);
		s.add(10);
		s.add("yuvaraj");
		s.add('C');
		System.out.println(s);

	}
	private void linkedhashset() {

		Set s = new LinkedHashSet<>();

		s.add(10);
		s.add(20);
		s.add(10);
		s.add("yuvaraj");
		s.add('C');
		System.out.println(s);
	}

	private void treeset() {
		
		Set s = new TreeSet<>();

		
		s.add("anand");
		s.add("yuvaraj");
		s.add("sekar");
		System.out.println(s);

	}
	public static void main(String[] args) {

		sett t = new sett();
		t.hashset();
		t.linkedhashset();
		t.treeset();
	}

}
