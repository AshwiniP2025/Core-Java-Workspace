package ChatGptPracticeQue;

import java.util.Scanner;

//public class FibonacciSeries {
//	public static void main(String[] args) {
//		int num = 1;
//		int temp = 1;
//		
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(num);
//			int sum = num + temp;
//			num = temp;
//			temp = sum;
//		}
//	}
//}

//User Input
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		int num = 0;
		int temp = 1;
		
		for (int i = 0; i <= n; i++) {
			System.out.println(num);
			int sum = num+temp;
			num = temp;
			temp = sum;		
		}	
	}
}