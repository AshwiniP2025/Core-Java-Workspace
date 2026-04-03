//odd no list
package ScannerClass;

import java.util.Scanner;

public class EvenOddList {
	
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Choose Your Option:");
		System.out.println("1- Enter First Number (1 to 50)");
		System.out.println("2- Enter Second Number (1 to 50)");
		System.out.println("Enter Your Choice(1 or 2)");
		int choice = s.nextInt();
		
		if(choice == 1) {
			System.out.println("Even number from 1 to 50:");
			for(int i = 1; i <= 50; i++) {
				if(i%2 == 0) {
					System.out.println(i+ " ");
				}
			}
		}
		
		else if (choice == 2){
			System.out.println("Odd number from 1 to 50:");
			for(int i = 1; i <= 50; i++) {
				if(i%2 != 0) {
					System.out.println(i+ " ");
					
				}
			}
		}
		
				else {
					System.out.println("Invalid Input. Please enter 1 or 2");
				}
		s.close();
	}

}
