/**Program to reverse the array elements*/
import java.util.Scanner;

public class reversearray {
	public static void main(String args) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter number of elements you want to enter into the array");
		int n = sc.nextInt();
		int rev=0,rem,num;
		int a[] = new int[n];
		System.out.println("Start entering the elements into the array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("The reverse of the elemensts that are entered into the array are:");
		
		for (int i = 0; i < n; i++) {
			num=a[i];
			while(num>0)
			{
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			System.out.println(rev);
		}

	}
}
