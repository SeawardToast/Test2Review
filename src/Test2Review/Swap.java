package Test2Review;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int t = s.nextInt();
		int j = s.nextInt();
		System.out.println(swap(t, j));
	}
	
	public static int swap(int x, int y) {
		int k = y;
		y = x;
		x = k;
		
		System.out.println(x);
		return y;
	}

}
