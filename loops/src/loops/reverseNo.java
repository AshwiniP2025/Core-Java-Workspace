//287 -> 782 
package Practice;

import java.util.Scanner;

public class reverseNo {
	public static void main(String[] args) {
		
		int reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		while(num > 0) {
			
		reverse = (reverse * 10) + num % 10;
		num = num / 10;
		
		}
	  System.out.println("reverse number" +reverse);
	}
}
