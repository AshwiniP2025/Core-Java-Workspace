//Write a function which takes in 2 numbers and returns the greater of those two.
package Function;

import java.util.Scanner;

public class GreaterNum {
	public static int findGreaterNum(int a, int b) {
		if(a > b) {
		   return a;
	  }else {
		  return b;
    }
}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Greater number is- " +findGreaterNum(a,b));
	}
}