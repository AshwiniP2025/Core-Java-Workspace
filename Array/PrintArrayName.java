package Array;

import java.util.Scanner;

public class PrintArrayName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		
		String name[] = new String[size];
		
		System.out.println("Enter the names-");
		for (int i = 0; i < size; i++) {
		 name[i] = sc.next();
		}
		
		System.out.println("Names are- ");
		for (int i = 0; i < name.length; i++) {
//			System.out.println(name[i]);
			 System.out.println("name " + (i+1) +" is : " + name[i]);
			}
		}
	}
