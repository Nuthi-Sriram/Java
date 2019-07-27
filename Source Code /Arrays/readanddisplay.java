/**Program to read elements using Scanner class into an array and display them*/
import java.util.Scanner;

public class readanddisplay {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter number of elements you want to enter into the array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Start entering the elements into the array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("The elements entered into the array are:");
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}
