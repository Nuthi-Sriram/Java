/**Program to implement array of objects*/
import java.util.Scanner;

public class ArrayOfObjects {
	int a;

	public void setData(int x) {
		a = x;
	}

	public void showData() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter the number of objects which you want to create");
		int n = sc.nextInt();
		ArrayOfObjects obj[] = new ArrayOfObjects[n];
		for (int i = 0; i < n; i++) {
			obj[i] = new ArrayOfObjects();
		}
		System.out.println("Start entering the data into each of the objects");
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			obj[i].setData(x);
		}
		System.out.println("The values entered into the respective objects are:");
		for (int i = 0; i < n; i++) {
			obj[i].showData();
		}
	}

}
