/**
 * A single program to demonstrate the key concepts of method overriding Like
 * Overriding an access modifier.The access modifier for an overriding method
 * can allow more, but not less access than the overridden method.
 * */
class parents {
	private void m1() {
		System.out.println("From parent m1()");
	}

	protected void m2() {
		System.out.println("From parent m2()");
	}
}

class childy extends parents {
	private void m1() {
		System.out.println("Fom child m1()");
	}

	public void m2() {
		System.out.println("From child m2()");
	}
}

public class main {

	public static void main(String[] args) {
		parents obj1 = new parents();
		obj1.m2();
		parents obj2 = new childy();
		obj2.m2();
	}

}
