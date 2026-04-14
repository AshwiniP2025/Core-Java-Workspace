//Write a function to print the sum of all odd numbers from 1 to n.

package Function;

import java.util.Scanner;

public class sumOddNo {
	public static int calculeteOddNo(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if(i % 2 != 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		System.out.println("Sum of all odd numbers is: " +calculeteOddNo(num));
	}

}
