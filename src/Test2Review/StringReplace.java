package Test2Review;

import java.util.Scanner;

public class StringReplace {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String s3 = s.next();
		System.out.println("Enter c1");
		char c1 = s.next().charAt(0);
		System.out.println("Enter c2");
		char c2 = s.next().charAt(0);
		replaceStr(s3, c1, c2);
		
		

	}
	
	public static String replaceStr(String s, char c1, char c2) {
		String t = s.replace(c1, c2);
		System.out.println(t);
		return t;
	}

}
