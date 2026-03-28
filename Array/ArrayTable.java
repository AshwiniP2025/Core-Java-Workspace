package Array;

import java.util.Scanner;

public class ArrayTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of friend");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] name = new String[n];
		int[] age = new int[n];
		String[] cities = new String[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter details of friends " + (i+1) + ":");
			System.out.println("Name: ");
			name[i] = sc.nextLine();		
			
			System.out.println("Age: ");
			age[i] = sc.nextInt();
			sc.nextLine();
			
			System.out.println("City: ");
			cities[i] = sc.nextLine();	
		}
			
			System.out.println("Friend information table:");
			
			System.out.printf("%-15s %-10s %-15s\n", "name",   "age",    "city");
		
			for(int i = 0; i < n; i++) {
				System.out.printf("%-15s %-10s %-15s\n", name[i]  ,  age[i]  ,  cities[i]);
			
		}
	}

}
