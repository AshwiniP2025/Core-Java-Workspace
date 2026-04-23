package Practice;

import java.util.Iterator;
import java.util.Scanner;

public class PrintFullName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String s1 = sc.next();
		
		System.out.println("Enter your middle name: ");
		String s2 = sc.next();
		
		System.out.println("Enter your last name: ");
		String s3 = sc.next();
		
		System.out.print(s1.toUpperCase().charAt(0) +".");
		
		System.out.print(s2.toUpperCase().charAt(0) +".");
		
		System.out.print(s3.toUpperCase().charAt(0));
		
		for (int i = 1; i < s3.length(); i++) {
			System.out.print(s3.toLowerCase().charAt(i));
		}
	}

}
