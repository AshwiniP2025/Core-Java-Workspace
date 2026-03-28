//Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
package Array;

public class CheackEqualNo {
	public static void main(String args[]) {
		int[] a = {3, 4, 5, 6};
        int[] b = {6, 7, 8, 6};
        int[] c = {3, 4, 5, 3};
        
        System.out.println("a: " + checkArray(a));
        System.out.println("b: " + checkArray(b));
        System.out.println("c: " + checkArray(c));
    }

    public static boolean checkArray(int[] array) {
    	return array[0] == array[array.length - 1];
    }
}
