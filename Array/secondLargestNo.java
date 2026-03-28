package Array;

import java.util.Arrays;

public class secondLargestNo {
	
	public static void main(String[] args) {
		int[] arr = {10,5,20,8,15};
		
		Arrays.sort(arr);
		System.out.println("second largest number:" +arr[arr.length-2]);
	}

}
