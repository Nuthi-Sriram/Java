/**
 * To simply call a function using an object only and implementation of OOPs
 * concept
 */

import java.util.Scanner;

public class pgm {
	void display(int x) {
		System.out.println("The entered value is " + x);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int x = sc.nextInt();
		pgm p = new pgm();
		p.display(x);
		/**
		 * Have to use an object in order to call a non static function of a
		 * class
		 */

	}

}
