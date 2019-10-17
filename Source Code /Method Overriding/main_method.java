/**Program to demonstrate a Method Overriding*/
import java.util.Scanner;
class parent{
	void show(){
		System.out.println("Parent Show");
	}
}
	class child extends parent{
		void show(){
			System.out.println("Child Show");
		}
	}

public class main_method {

	public static void main(String[] args) {
		parent obj1=new parent();
		obj1.show();
		parent obj2=new child();
		obj2.show();
	}

}
