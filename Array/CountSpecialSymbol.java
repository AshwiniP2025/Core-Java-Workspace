//4. WAP to accept 10 characters from the user and count only special symbols.
package Array;

import java.util.Scanner;

public class CountSpecialSymbol {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        String a[] = new String[10];  
        int count = 0;  
        System.out.println("Enter 10 strings (words or characters):");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.next();
        }

        for (int i = 0; i < a.length; i++) {
            char[] chars = a[i].toCharArray();  
            for (int j = 0; j < chars.length; j++) {
                char ch = chars[j];
                if (!Character.isLetterOrDigit(ch)) {
                    count++;
                    System.out.println("Special Symbol found: " + ch);
                }
            }
        }

        System.out.println("Total Special Symbols: " + count);
        s.close();
    }
}
