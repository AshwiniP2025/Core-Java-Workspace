//Take an array as input from the user. Search for a given number x and print the index at which it occurs.
package Array;

import java.util.Scanner;

public class FindArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		
		int[] numbers = new int[size];
		
		System.out.println("Enter the " +size +" numbers");
		for (int i = 0; i < size; i++) {
		   numbers[i] = sc.nextInt();
		}
		System.out.println("Enter the x vaule: ");
		int x = sc.nextInt();
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == x) {
				System.out.println("x found at index: " +i);
			}
		}
	}

}
