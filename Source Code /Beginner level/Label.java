/** Labels */
public class Label {
	public static void main(String args[])
{
	outerloop:
	for(int i=1;i<4;i++)
	{
		for(int j=1;j<4;j++)
		{
			if(i==2&&j==2)
				continue outerloop;
			System.out.println("I is "+i+" J is "+j);
		}
	
	}
	
}
}
