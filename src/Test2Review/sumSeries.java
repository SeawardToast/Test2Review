package Test2Review;
import java.util.Scanner;

public class sumSeries {

	public static void main(String[] args) {
		sumSeries();

	}

	
	public static void sumSeries() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n");
		int n = s.nextInt();
		
		double sum = 0;
		
		for(double i=1; i<=n; i++) {
		//	System.out.println(i);
			sum += i/(i+(i+1));
			System.out.println(sum);
		}
		
	}
	
}
