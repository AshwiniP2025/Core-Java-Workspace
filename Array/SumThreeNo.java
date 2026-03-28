package Array;

import java.util.Scanner;

public class SumThreeNo {
	public static void main(String[] args) {
		int a[] = new int[3];
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
		System.out.println("Enter the number");
		a[i] = sc.nextInt();
		
		sum+=a[i];
		}
		
		System.out.println(sum);
		
	}
}