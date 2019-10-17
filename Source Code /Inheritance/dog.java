class animal
{
    	void bark1()
	{
		System.out.println("super bark");
	}
}
public class dog extends animal{

	static void bark()
	{
		System.out.println("sub bark");
		
		
	}
	static void bark(int a)
	{
		System.out.println("sub fun");
	}
	public static void main(String[] args) {
		
		dog d=new dog();
		d.bark();
		d.bark(5);
		
	}

}
