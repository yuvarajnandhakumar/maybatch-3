package org.project.override;

public final class BigBazzar {

	final int i=10;
	static int j=20;

	public static void abc() {

		System.out.println(j);
		j=10+20;
		System.out.println(j);


	}

	public final static  void xyz() {

		final int i=20;
		int ll = 56;

	}

	public static void main(String[] args) {


		xyz();


	}

}
