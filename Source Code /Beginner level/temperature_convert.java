/** Program to convert temperature from Fahrenhit to Celsius*/

import java.util.Scanner;

public class temperature_convert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value in Fahrenhit");
		float f = sc.nextInt();
		float c = ((f - 32) * 5) / 9;
		System.out.println("The temperature in Celsius is " + c);

	}
}
