/**Usage of this keyword in this can be used to refer to current class instance*/
import java.util.Scanner;

public class ThisKeyWord {
	int rollno;
	String name;
	float fee;

	public ThisKeyWord(rollno,name,fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + name + fee);
		;
	}

	public static void main(String[] args) {
		ThisKeyWord S1 = new ThisKeyWord(a, "Pd", 34.343);
		ThisKeyWord S1 = new ThisKeyWord(b, "Harish", 34343);
		S1.display();
		S2.display();

	}

}
