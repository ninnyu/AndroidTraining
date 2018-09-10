/*
 * Name: RemoveDupesUnsorted
 * @author NinnYu Chin
 * Description: Program that removes duplicates in an array.
 */

/**
 * DragosReview
 * Comment: code looks very good! 
 */

package assignment5;

import java.util.Arrays;

public class RemoveDupesUnsortedArray {
	
	public static void main (String[] args) {
		RemoveDupesUnsortedArray rDupesUnsorted = new RemoveDupesUnsortedArray();
		Integer[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 5, 5, 3, 3, 3, 1};
				
		System.out.println("Here is the array:");
		rDupesUnsorted.printArray(arr);
		System.out.println("\n\nHere is the array after duplicates are removed:");
		rDupesUnsorted.removeDupes(arr);
		rDupesUnsorted.printArray(arr);
	}

	public void removeDupes(Integer[] arr) {
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == arr[i+1]) {
				arr[i] = null;
			}
		}
	}
	
	public void printArray(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1 && arr[i] != null)
				System.out.print(arr[i]);
			else if (arr[i] != null)
				System.out.print(arr[i] + ", ");
		}
	}
}
