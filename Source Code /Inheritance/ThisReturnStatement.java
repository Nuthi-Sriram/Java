/**This keyword can be used to return current class instance*/

class A {
	A getA() {
		System.out.println(this);
		return this;
	}

	void msg() {
		System.out.println("Hello");
	}
}

public class ThisReturnStatement {

	public static void main(String[] args) {
		new A().getA().msg();
	}

}
