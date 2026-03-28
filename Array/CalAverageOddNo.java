// WAP to calculate average of all odd numbers.
package Array;

public class CalAverageOddNo {
	public static void main(String [] args) {
		int a[] = {0,1,2, 3, 4, 5, 6, 7, 8, 9 };
		
		int sum = 0;
		int count = 0;
		
		for(int i = 1; i < a.length; i++) {
			if(a[i]%2 != 0) {
				sum += a[i];
				count++;
			}
		}
		if(count > 0) {
			int average = sum / count;
			System.out.println("Average of all odd numbers:" +average);
		}
	}

}
