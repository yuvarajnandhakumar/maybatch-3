package string.types;

public class LiteralNonliteral {

	public static void main(String[] args) {

		String s1="yuvaraj";
		System.out.println(s1);
		System.out.println("literal "+System.identityHashCode(s1));
		String s2="yuvaraj";
		System.out.println(s2);
		System.out.println("literal "+System.identityHashCode(s2));
		
		String n= new String("vipin");
		System.out.println(n);
		System.out.println("non literal "+System.identityHashCode(n));

		String n1= new String("vipin");
		System.out.println(n1);
		System.out.println("non literal "+System.identityHashCode(n1)); 

	}

}
