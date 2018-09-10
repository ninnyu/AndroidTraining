/*
 * Name: RemDupes
 * @author NinnYu Chin
 * Description: Remove duplicate numbers from sorted array (DO not use Collection framework).
 */

package assignment4;

public class RemoveDupesSortedArray {
	public static void main (String[] args) {
		Integer[] arr = {1, 1, 1, 2, 2, 2, 3, 4, 5, 6, 7, 7, 7, 8, 9};
		
		System.out.println("Here is the original array: ");
		printArray(arr);
		
		System.out.println("\n\nHere is the array after duplicates are removed: ");
		removeDupes(arr);
		printArray(arr);
	}
	
	public static void removeDupes(Integer[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == arr[i+1])
				arr[i] = null;
		}
	}
	
	public static void printArray(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1 && arr[i] != null)
				System.out.print(arr[i]);
			else if (arr[i] != null)
				System.out.print(arr[i] + ", ");
		}
	}
}
