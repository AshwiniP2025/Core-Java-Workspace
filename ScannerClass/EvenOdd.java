package ScannerClass;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number:-");
		int num = s.nextInt();
		
		if(num%2 == 0) {
			System.out.println(num+ " is Even number");	
		}
		else {
			System.out.println(num+ " is Odd number");
			}	
		s.close();
	}
	
}
