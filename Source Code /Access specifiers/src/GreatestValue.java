/**Write a program to print the greatest value using nesting of method*/
import java.util.Scanner;

public class GreatestValue {

	static void search(int key, int a[], int n) {
		nested(key, a, n);

	}

	static void nested(int key, int a[], int n) {
		int flag = 0;
		for (int i = 0; i < n; i++) {
			if (key == a[i])
				flag = 1;
		}
		if (flag == 1)

			System.out
					.println("The entered element is present in the array");
		else
			System.out
					.println("The entered element is not present in the array");
	}

			
	

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements into an array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}
		System.out.println("Enter the element which you want to search for");
		int key = sc.nextInt();
		search(key, a, n);

	}

}
