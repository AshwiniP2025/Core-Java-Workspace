//WAP to accept 5 numbers from the user and count 2 digit numbers from it.
package Array;

import java.util.Scanner;

public class TwoDigitNo {
	public static void main(String args[]) {
		
		int a[] = new int[5];
		int count = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the 5 numbers");
		for(int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for(int num : a) {
			if((num > 10 && num < 99) || (num > -10 && num < -99))
				count++;
				System.out.println("number of Two Digit Numbers: " +count);
		}
	}

}
