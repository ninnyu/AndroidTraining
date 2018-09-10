/*
 * Name: BubbleSort
 * @author NinnYu Chin
 * Description: Function for bubble sort.
 */

package assignment2;

public class BubbleSort {
	public static void main (String[] args) {
		int[] arr = {3, 1, 7, 9, 90, 56, 0, 100, 55, 11, 77, 99, 44};
		
		System.out.println("Here is the array unsorted: ");
		for (int i = 0; i < arr.length; i++) {
			if ( i != arr.length-1 )
				System.out.print(arr[i] + ", ");
			if ( i == arr.length-1 )
				System.out.print(arr[i]);
		}
		
		System.out.println("\n\nHere is the array after going through bubble sort: ");
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			if ( i != arr.length-1 )
				System.out.print(arr[i] + ", ");
			if ( i == arr.length-1 )
				System.out.print(arr[i]);
		}
	}
	
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if ( arr[j]	> arr[j+1] ) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
