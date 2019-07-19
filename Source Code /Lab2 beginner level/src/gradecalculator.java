/**Write to find the grade of a student depending on the score details as follows
 * 0-39		- F
 * 40-49	- P
 * 50-59	-D
 * 60-69	-C
 * 70-79	-B
 * 80-89	-A
 * 90-100	-O
 * */

import java.util.Scanner;

public class gradecalculator {

	public static void main(String[] args) {
		System.out.println("Enter the marks");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if (marks > 90 && marks <=100)
			System.out.println("You have secured an " + "O" + " grade");
		else if (marks > 80 && marks < 89)
			System.out.println("You have secured a " + "A" + " grade");
		else if (marks > 70 && marks < 79)
			System.out.println("You have secured a " + "B " + " grade");
		else if (marks > 60 && marks < 69)
			System.out.println("You have secured a " + "C" + " grade");
		else if (marks > 50 && marks < 59)
			System.out.println("You have secured a " + " D" + " grade");
		else if (marks > 40 && marks < 49)
			System.out.println("You have secured a " + "P" + " grade");

		else
			System.out.println("You have secured a " + "F" + " grade");

	}
}
