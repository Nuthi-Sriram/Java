/**
 * We can pass an argument to method using this keyword we can pass an argument
 * to a constructor call as well
 */
class B {
	PassThisArgumentConstruc obj;

	B(PassThisArgumentConstruc obj) {
		this.obj = obj;
	}

	void display() {
		System.out.println(obj.data);
	}

}

public class PassThisArgumentConstruc {
	int data = 10;

	PassThisArgumentConstruc() {
		B b = new B(this);
		b.display();
	}

	public static void main(String[] args) {
		 new PassThisArgumentConstruc();

	}

}
