import java.util.Scanner;

/** Program to convert seconds time into hours,minutes and seconds */
public class time_conversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter time in seconds");
		int time_seconds = sc.nextInt();
		int s = time_seconds % 60;
		int h = time_seconds / 3600;
		int m = (time_seconds - (h* 3600)) / 60;
		System.out.println(h + ":" + m + ":" + s);

	}

}
