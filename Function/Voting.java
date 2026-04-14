//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

package Function;

import java.util.Scanner;

public class Voting {
	
	public static void findAge(int age) {
		if(age >= 18) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("Not Eligible to vote");
		}
		return;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		findAge(age);
	}

}
