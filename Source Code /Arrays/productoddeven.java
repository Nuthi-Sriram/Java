/**To find the product of the elements present in the odd and even position*/
import java.util.Scanner;

public class productoddeven {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter number of elements you want to enter into the array");
		int n = sc.nextInt();
		int prodo = 1, prode = 1;
		int a[] = new int[n];
		System.out.println("Start entering the elements into the array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				prode = prode * a[i];
			} else {
				prodo = prodo * a[i];
			}

		}
		System.out
				.println("The product of the elements present in the odd postion is :"
						+ prode);
		System.out
				.println("The product of the elements present in the even postion is :"
						+ prodo);
	}
}
