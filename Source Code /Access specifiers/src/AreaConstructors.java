/** Write a program to print the area of the rectangle using constructors */

public class AreaConstructors {
	int l;
	int b;

	AreaConstructors() {
		l = 3;
		b = 2;
	}

	void area() {
		int area = l * b;
		System.out.println("The area of the rectangle is " + area);

	}

	public static void main(String[] args) {
		AreaConstructors a = new AreaConstructors();
		a.area();

	}

}
