package ChatGptPracticeQue;

import java.util.Scanner;

//public class FactorialNo {
//	public static void main(String[] args) {
//		
//		int fact = 1;
//		 for(int i = 1; i <= 5; i++) {
//			 fact = fact * i;
//		 }
//		 System.out.println("factorial Number: " +fact);
//	}
//}

//User Input 

public class FactorialNo {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = sc.nextInt();
	int fact = 1;
	
	for(int i = 1; i <= num; i++) {
	  fact = fact * i;
	}
	System.out.println("Factoral Number:" +fact);
  }
}