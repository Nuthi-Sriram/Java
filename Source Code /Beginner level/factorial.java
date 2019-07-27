/** Program to find the factorial of a number */
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter the number of which you want to find the factorial of");
		int n = sc.nextInt();
		for (int i = n; i > 1; i--) {
			fact = fact * i;
		}
		System.out.println("The factorial of the given number is "+fact);
	}

}
