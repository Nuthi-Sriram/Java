/** Program to demonstrate the usage of a non static function in a class */
public class test {
	static void terminate() {
		/** static function calling a static you need not create an object */
		System.out.println("The program has terminated");
	}

	public static void main(String[] args) {
		System.out.println("Start of execution of the program");
		terminate();
	}

}
