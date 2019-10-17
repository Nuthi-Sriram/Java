/**
 * read the student details and copy that student details into another student
 * Using constructor 
 */

import java.util.Scanner;

public class CopyConstructor {
	int id;
	String name;

	CopyConstructor(int x, String nam) {
		id = x;
		name = nam;
	}

	CopyConstructor(CopyConstructor obj1) {
		id = obj1.id;
		name = obj1.name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the StudentID");
		int x = sc.nextInt();
		System.out.println("Enter the name of the student");
		String nam = sc.next();
		CopyConstructor obj1 = new CopyConstructor(x, nam);
		CopyConstructor obj2 = new CopyConstructor(obj1);
		obj1.display();
		obj2.display();
	}

}
