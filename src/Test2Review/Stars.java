package Test2Review;

public class Stars {

	public static void main(String[] args) {
		for (int i = 5; i>0; i--) {
			System.out.println();
			for(int k = 0; k<=i; k++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
		}

	}

}
