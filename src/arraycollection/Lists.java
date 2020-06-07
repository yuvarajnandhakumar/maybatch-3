package arraycollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

	public void arraylists() {
		List l = new ArrayList();
		l.add(10);
		l.add("string");
		l.add('C');
		l.add(40f);
		l.add(10);
		System.out.println(l);
	}

	public void linkedlists() {
		List l = new LinkedList();
		l.add(10);
		l.add("string");
		l.add('C');
		l.add(40f);
		l.add(10);
		System.out.println(l);
		
		List k = new LinkedList();
		k.add("one");
		k.add("two");
		k.add("three");
		k.add("four");
		System.out.println(k);
		
		l.addAll(k);
		System.out.println(l);
		
		l.set(4, 500);
		System.out.println(l);
		
		l.remove(1);
		System.out.println(l);
		
		l.removeAll(k);
		l.removeAll(l);
		System.out.println(k);

		System.out.println(l);

		

	}

	public static void main(String[] args) {
		Lists l =new Lists();
		l.linkedlists();

	}

}
