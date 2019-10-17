import java.util.Scanner;

public class FibonacciSeries {
	int n, a, b, c;

	public FibonacciSeries(int x) {
		n = x;
		a = 0;
		b = 1;
	}

	public void fibonacci() {
		System.out.print(a+" ");
		System.out.print(b+" ");
		c = a + b;
		System.out.print(c+" ");
		for (int i = 0; i < n-3; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(c+" ");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out
				.println("Enter the number n upto which you want to print the Fibonacci series");
		int p = sc.nextInt();
		FibonacciSeries obj = new FibonacciSeries(p);
		obj.fibonacci();
		sc.close();
	}

}
