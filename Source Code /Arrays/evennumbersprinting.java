/**Program to print the even numbers present in an array*/
import java.util.Scanner;

public class evennumbersprinting {
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
		System.out.println("The even elements present in the array are:");
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0)
				System.out.println(a[i]);
		}
	}
}
