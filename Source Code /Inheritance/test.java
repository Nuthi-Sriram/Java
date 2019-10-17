class abhi1
{
	abhi1(int a)
	{
		System.out.println("super constructer");
	}
}
public class test extends abhi1{

	int b;
	test(int a)
	{
		super(5);
		this.b=a;	
	}
	
	public static void main(String[] args) {

		test t=new test(5);
	}

}
