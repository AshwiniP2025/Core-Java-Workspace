package Array;

import java.util.Scanner;

public class FirstLastSix2 {
	
	public static void main(String[] args) {
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		for(int i = 0; i < num.length; i++) {
		 num[i] = sc.nextInt();
			
			if (num[0] == 6 || num[num.length - 1] == 6){
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}
	}

}
