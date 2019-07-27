/**Check whether a given numbe is a palindrome or not*/

import java.util.Scanner;

public class palindromchecker {

	public static void main(String[] args) {
		System.out.println("Enter number to check whether palindrome or not");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		int rev = 0, r;
		while (n > 0) {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}

		if (num == rev)
			System.out
					.println("The entered number " + num + " is a palindrome");
		else
			System.out.println("The entered number " + num
					+ " is not a palindrome");

	}
}
