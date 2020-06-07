package arraycollection;

public class OneDimArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,3,4,5,5,6,7,8,9};
		System.out.println(a[1]);
		
		String s[]= {"name","name1","name2"};
		System.out.println(s[0]);
		
		int b[];
		b = new int[6];
		//or
		int c[]=new int[6];
		c[0]=10;
		c[1]=20;
		c[2]=30;
		c[3]=40;
		//c[6]=70;
		int l = c.length;
		System.out.println("lenght of an array c is :" +l);
		for (int i = 0; i < l; i++) {
			System.out.println(c[i]);
			
		}
		
	}

}
