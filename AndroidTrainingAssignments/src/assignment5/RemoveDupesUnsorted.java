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

public class RemoveDupesUnsorted {
	
	public static void main (String[] args) {
		RemoveDupesUnsorted rDupesUnsorted = new RemoveDupesUnsorted();
		Integer[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 5, 5, 3, 3, 3, 1};
				
		System.out.println("Here is the array:");
		rDupesUnsorted.printArray(arr);
		System.out.println("\n\nHere is the array after duplicates are removed:");
		rDupesUnsorted.remove(arr);
		rDupesUnsorted.printArray(arr);
	}

	public void remove(Integer[] arr) {
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
