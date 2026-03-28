//Given an array of ints length 3, figure out which is larger, 
//the first or last element in the array, and set all the other elements to be that value. 
//Return the changed array.
//maxEnd3([1, 2, 3]) → [3, 3, 3]
//maxEnd3([11, 5, 9]) → [11, 11, 11]
//maxEnd3([2, 11, 3]) → [3, 3, 3]
package Array;

public class maxEnd3 {
	public int[] make(int a[]) {

		if (a[0] > a[1] && a[0] > a[2]) {
			return new int[] { a[0], a[0], a[0] };

		} else if (a[1] > a[2] && a[1] > a[0]) {
			return new int[] { a[1], a[1], a[1] };

		} else 
			return new int[] { a[2], a[2], a[2] };
	}

	public static void main(String[] args) {
		maxEnd3 m = new maxEnd3();
		int arry[] = m.make(new int[] {5,11,13});
		for (int i : arry) {
			System.out.print(i+" ");
		}
		
	}

}