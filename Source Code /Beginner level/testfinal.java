/**
 * Understanding the concept of static calling a static function and a non
 * static calling a non static function
 */
public class testfinal {
	void terminate() {

		System.out.println("The program has terminated");
	}

	void display() {
		System.out.println("In the display function");
		terminate();
		/**
		 * A non static function display is calling a non static function
		 * terminate which doesn't need an object in order to call it
		 */
	}

	public static void main(String[] args) {
		testfinal t = new testfinal();
		t.display();
	}

}
