/*
 * Name: SelectionSort
 * @author: NinnYu Chin
 * Description: Function for selection sort.
 */

package assignment2;

public class SelectionSort {
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
		selectSort(arr);
		for (int i = 0; i < arr.length; i++) {
			if ( i != arr.length-1 )
				System.out.print(arr[i] + ", ");
			if ( i == arr.length-1 )
				System.out.print(arr[i]);
		}
	}
	
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
	}
}
