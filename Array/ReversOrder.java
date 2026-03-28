package Array;

import java.util.Scanner;

public class ReversOrder {
	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);

	        int[] a = new int[5];

	        System.out.println("Enter 5 Numbers");
	        for (int i = 0; i < a.length; i++) {
	            a[i] = sc.nextInt();
	        }

	        System.out.println("reverse order:");
	        for (int i = a.length - 1; i >= 0; i--) {
	            System.out.println(a[i]);
	        }

	        sc.close();
	}
}
