/** Read numbers from the user until the program sums the first ten numbers */
import java.util.Scanner;

public class sumuntil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out
				.println("Keep entering the value until the program terminates");
		for (int i = 0; i < 10; i++) {
			int b=sc.nextInt();
			sum = sum +b;
		}
		System.out
				.println("The sum of the first ten numbers entered is " + sum);
	}

}
 