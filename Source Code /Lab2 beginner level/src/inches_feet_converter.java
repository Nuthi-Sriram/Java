/** Program to convert inches into feet and inches */
import java.util.Scanner;

public class inches_feet_converter {

	public static void main(String[] args) {

		int inches;

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter inches:");
		inches = in.nextInt();

		double feet = (double) inches / 12;

		System.out.println(feet + " Feet");

	}

}
