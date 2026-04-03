package ScannerClass;

import java.util.Scanner;

public class MaxNo {
	
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first number:-");
		int num1 = s.nextInt();
		
		System.out.println("Enter the second number:-");
		int num2 = s.nextInt();
		
		if(num1 > num2) {
			
		System.out.println("Maximum number " +num1);
		}
		
		else {
			System.out.println("Maximum number is " +num2);
			
			s.close();
		}
}
}