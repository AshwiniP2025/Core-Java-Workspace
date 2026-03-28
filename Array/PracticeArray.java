package Array;

import java.util.Scanner;

public class PracticeArray {
//	public static void main(String[] args) {
//		int num []= new int[5];
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 0; i < num.length; i++) {
//			System.out.println("Enter the numbers");
//			num[i] = sc.nextInt();
//		}
//		System.out.println("The array is: ");
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
//  }

//	Using String
	public static void main(String[] args) {
		
		String[] name = new String[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < name.length; i++) {
			System.out.println("Enter the Friends name: ");
			name[i] = sc.next();
		}
		System.out.println("Friends circle: ");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}
}
