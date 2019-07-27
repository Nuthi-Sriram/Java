/**Program to read elements into an array and find the sum of elements*/
import java.util.Scanner;

public class arraysum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter number of elements you want to enter into the array");
		int n = sc.nextInt();
		int sum = 0;
		int a[] = new int[n];
		System.out.println("Start entering the elements into the array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			sum = sum + a[i];
		}
System.out.println("The sum of the numbers entered into the array are:"+sum);
	}
}
