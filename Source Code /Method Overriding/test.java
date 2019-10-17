/**To demonstrate the fact that b 
 * is a reference variable
 * of animal so, b.bark() is not allowed*/
/**Output
 * 
 *  Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method bark() is undefined for the type Animal

	at test.main(test.java:25)
*/

class Animal{
	void move(){
		System.out.println("Move");
	}
}
class dog extends Animal{
	void move(){
		System.out.println("Walk");
	}
	void bark(){
		System.out.println("Bark");
	}
}
public class test {

	
	public static void main(String[] args) {
Animal a =new Animal();
Animal b=new dog();
a.move();
b.move();
b.bark();
	}

}
