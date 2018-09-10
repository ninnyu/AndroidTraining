/*
 * Name: InsertionSort
 * @author NinnYu Chin
 * Description: Function for insertion sort.
 */

package assignment2;

public class InsertionSort {
	public static void main (String[] args) {
		int[] arr = {3, 1, 7, 9, 90, 56, 0, 100, 55, 11, 77, 99, 44};
		
		System.out.println("Here is the array unsorted: ");
		for (int i = 0; i < arr.length; i++) {
			if ( i != arr.length-1 )
				System.out.print(arr[i] + ", ");
			if ( i == arr.length-1 )
				System.out.print(arr[i]);
		}
		
		System.out.println("\n\nHere is the array after going through insertion sort: ");
		insertSort(arr);
		for (int i = 0; i < arr.length; i++) {
			if ( i != arr.length-1 )
				System.out.print(arr[i] + ", ");
			if ( i == arr.length-1 )
				System.out.print(arr[i]);
		}
	}
	
	public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
 
            while ((j >= 0) && (arr[j] > key)) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
	}
}


