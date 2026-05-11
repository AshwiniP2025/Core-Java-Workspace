package ChatGptPracticeQue;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		int count = 1;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count ++;
			}
			else if(str.charAt(i) != ' ' && str.charAt(i - 1) == ' ') { //Current character is not a space && Previous character was a space
                count++;
		}
		System.out.println("Count words: " +count);
	}

	}
}
