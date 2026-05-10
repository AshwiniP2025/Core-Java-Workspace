package ChatGptPracticeQue;

import java.util.Scanner;

public class CountDigit {
//	public static void main(String[] args) {
//		int digit = 12345;
//		int count = 0;
//		
//        while (digit != 0) {
//        	digit = digit/10;
//			count++;
//		}
//        System.out.println(count);
//	}
//}
  
//User Input
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num = sc.nextInt();
		
		int count = 0;
		
		while (num != 0) {
			num = num / 10;
			count ++;
		}
		System.out.println("Count the numbers= " +count);
	}
}
