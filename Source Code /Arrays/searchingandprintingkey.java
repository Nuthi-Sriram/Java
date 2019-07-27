/**
 * To read elements into an array and search for the key which is entered and
 * print the key which is entered and print the position in which the key is
 * present
 */
import java.util.Scanner;

public class searchingandprintingkey {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter number of elements you want to enter into the array");
		int n = sc.nextInt();
		int a[] = new int[n];
		int key;
		System.out.println("Start entering the elements into the array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element which you want to search for:");
		key = sc.nextInt();

		for (int i = 0; i < n; i++) {
			if (key == a[i]) {
				i++;
				System.out.println("The given element :" + key
						+ " is present at the " + i + " position");

			}
		}
	}
}
