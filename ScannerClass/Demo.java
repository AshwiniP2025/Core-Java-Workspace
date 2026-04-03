package ScannerClass;

import java.util.Scanner;

public class Demo {
	
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number :-");
		int number = s.nextInt();
		
		System.out.println("You entred :-" +number);
		
		s.close();
	}

}
