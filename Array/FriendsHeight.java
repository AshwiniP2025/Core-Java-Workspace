//WAP to accept heights of 10 friends and print the heights above 6 feet.
package Array;

import java.util.Scanner;

public class FriendsHeight {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		
		int height[] = new int[10];
		
		System.out.println("Enter the heights of 10 friends");
		for(int i = 0; i < 10; i++) {
		  height[i] = s.nextInt();
		}
		System.out.println("Height above 6 feets");
		for(int heights : height) {
		if(heights > 72) {
			
			System.out.println(heights+ " inches");  
		}
	}
	}
}
