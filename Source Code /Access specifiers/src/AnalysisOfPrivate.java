/**
 * Write a program to demonstrate the private access specifier by initializing the value to
 * a data and make the data variable as private create an object in the main and
 * access the private variable using an object and also have a method called
 * display which is also private try to access this method display through the
 * object analyze the result if you are not able to access the data
 * members(variable as well as method) modify accordingly.
 */
/**The output should be a compilation time error*/
class members{
	private int data=3;
	private void display(){
		System.out.println("The value of data is "+data);
}
}
	class AnalysisOfPrivate {

		public static void main(String[] args) {
			members obj=new members();
		obj.display();
	
	}
	
	}



/**NO error output*/
//class AnalysisOfPrivate {
//private int data=3;
//private void display(){
//	System.out.println("The value of data is "+data);
//}
//	
//	public static void main(String[] args) {
//		AnalysisOfPrivate obj=new AnalysisOfPrivate();
//		obj.display();
//
//	}
//
//}
