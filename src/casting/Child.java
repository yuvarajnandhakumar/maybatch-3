package casting;

public class Child extends Parent{

	public void mehtodchild() {
		System.out.println("child calss");
	}

	@Override
	public void methodparent() {
		super.methodparent();

		System.out.println("child calss override method");		
	}
	public static void main(String[] args) {
		Child p = new Child();
		p.methodparent();
		p.mehtodchild();

	}

}
