/**Read the student details and copy that student details into another student 
 *Without using constructors
 */

import java.util.Scanner;

public class WithoutCopyConstructor {
	int id;
	String name;

	WithoutCopyConstructor(int x, String nam) {
		id = x;
		name = nam;
	}

	WithoutCopyConstructor() {

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
		WithoutCopyConstructor obj1 = new WithoutCopyConstructor(x, nam);
		WithoutCopyConstructor obj2 = new WithoutCopyConstructor();
		obj2.id = obj1.id;
		obj2.name = obj1.name;
		obj1.display();
		obj2.display();
	}

}
