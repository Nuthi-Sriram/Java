class abhi
{
	void m(int a,int b)
	{
		System.out.println("m1");
	}
	void m2(int a,long b)
	{
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		abhi a=new abhi();
		
		a.m(5,6);
		a.m2(65,-1111164511);
	}
}