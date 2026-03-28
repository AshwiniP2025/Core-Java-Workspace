//WAP to accept 5 fruit names and print them all in reverse order.
package Array;

import java.util.Scanner;

public class FruitReverseName {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		String a[] = new String[5];
		
		System.out.println("Enter the 5 Fruits Name:");
		for(int i = 0; i < 5; i++) {
			a[i] = s.next();
		}
		for(int i = a.length-1; i >= 0; i-- ) {
			System.out.println(a[i]+ " ");
		}
			s.close();
	}

}
