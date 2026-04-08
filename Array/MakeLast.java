//Given an int array, return a new array with double the length where its last element is the same as the original array, 
//and all the other elements are 0. The original array will be length 1 or more. 
//Note: by default, a new int array contains all 0's.
//makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
//makeLast([1, 2]) → [0, 0, 0, 2]
//makeLast([3]) → [0, 3]

package CodingBat;

public class MakeLast {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4};

        int newArr[] = new int[2 * arr.length];

        newArr[newArr.length - 1] = arr[arr.length - 1];

        for(int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
