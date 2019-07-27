/**Demonstrate Boolean*/
public class logic {
public static void main(String args[]){
	boolean a=true,b=false;
	boolean c1=(a&&a);
	boolean c2=(a&&b);
	boolean c3=(b&&b);
	boolean c4=(a||a);
	boolean c5=(a||b);
	boolean c6=(b||b);
	boolean c7=(!a);
	boolean c8=(!b);
	System.out.println("AND "+c1+" "+c2+" "+c3);
	System.out.println("OR "+c4+" "+c5+" "+c6);
	System.out.println("NOT "+c7+" "+c8);

}
}
