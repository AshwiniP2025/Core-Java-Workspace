package ChatGptPracticeQue;

import java.util.Scanner;

public class EvenOdd {
//	public static void main(String[] args) {
//		int n = 3;
//		
//		if(n%2 == 0) {
//			System.out.println("Number is even");
//		}else {
//			System.out.println("Number is odd");
//		}
//	}
//}


//User Input
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println(num +" is even number");
		}else {
			System.out.println(num +" is odd number");
		}
	}
}
