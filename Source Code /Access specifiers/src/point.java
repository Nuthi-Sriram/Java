/**
 * Write a program to define a class point with two instance variables x and y
 * to store the x and y coordinates of the point define a parameterized
 * constructor to initialize the value
 */
import java.util.Scanner;

public class point {
	int x;
	int y;

	point(int a, int b) {
		int x = a;
		int y = b;
		System.out.println(x);
		System.out.println(y);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of the coordinates of x and y");
		int a = sc.nextInt();
		int b = sc.nextInt();
		point obj = new point(a, b);

	}
}
