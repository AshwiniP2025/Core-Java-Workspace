package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortTheArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 5 numbers");
		int n = sc.nextInt();
		
		int arr[] = new int[5];
		
		for(int i = 0; i<5; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println("Sorted array");
		for(int i=0;i<5;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
