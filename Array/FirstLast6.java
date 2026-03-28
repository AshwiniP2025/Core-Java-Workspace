//Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
package Array;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6};
        int[] b = {6, 7, 8, 9};
        int[] c = {3, 4, 5, 7};

        System.out.println("a: " + checkArray(a));
        System.out.println("b: " + checkArray(b));
        System.out.println("c: " + checkArray(c));
    }

    public static boolean checkArray(int[] array) {
        return array[0] == 6 || array[array.length - 1] == 6;
    }
}
