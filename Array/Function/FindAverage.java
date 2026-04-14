//find average using function.
package Function;

import java.util.Scanner;

public class FindAverage {
	
	public static int findAvg(int a, int b , int c) {
		
		int avg = (a + b + c) /3;
		return avg;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a = sc.nextInt();
		
		System.out.println("Enter the 2nd number");
		int b = sc.nextInt();
		
		System.out.println("Enter the 3rd number");
		int c = sc.nextInt();
		
		System.out.println("Average is -" +findAvg(a, b, c));
	}
}
