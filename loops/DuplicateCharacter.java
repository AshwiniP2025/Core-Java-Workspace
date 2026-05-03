package ChatGptPracticeQue;

import java.util.Scanner; //incomplete this code

public class DuplicateCharacter {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the String");
//		String str = sc.nextLine();
//		
//		for (int i = 0; i < str.length(); i++) {
//			for (int j = i+1; j < str.length(); j++) {
//				
//				if(str.charAt(i) == str.charAt(j)) {
//					System.out.println(str.charAt(i));
//					break;
//				}
//			}
//		}
//	}

//}

//for(int i=0; i<str.length(); i++) {
//    for(int j=i+1; j<str.length(); j++) {
//        if(str.charAt(i) == str.charAt(j)) {
//            System.out.println(str.charAt(i));
//            break;
//        }
//    }
//}
  
//-*ChatGPtcode-*
//import java.util.Scanner;
//
//public class DuplicateCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            boolean isDuplicate = false;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            // check if already printed before
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (isDuplicate && !alreadyPrinted) {
                System.out.println(str.charAt(i));
            }
        }
    }
}

