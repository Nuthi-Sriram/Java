/** Program to show the implementation of final keyword in java */
/**Output
 * Throws an error saying cannot override the final method
 * */

class top {
	final void show() {
		System.out.println("From the top show()");
	}
}

class bottom extends top {
	void show() {
		System.out.println("From the bottom show()");
	}
}

public class finals {

	public static void main(String[] args) {
		top obj=new top();
		obj.show();
		top obj=new bottom();
	}

}
