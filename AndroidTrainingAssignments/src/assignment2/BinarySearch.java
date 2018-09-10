/*
 * Name: BinarySearch
 * @author NinnYu Chin
 * Description: Function for doing binary search. Returns -1 if not found.
 */

package assignment2;
import java.util.Scanner;

public class BinarySearch {
	
	public static void main (String[] args) {
		int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 22, 33, 44, 55, 66, 77, 88, 99};

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to search. Enter anything but a number to stop searching. ");
		
		while ( sc.hasNextInt() ) {
			int n = sc.nextInt();
			int key = binarySearch(arr, 0, arr.length-1, n);
		
			if ( key >= 0)
				System.out.println("The number " + n + " is found at index " + key + ".");
			else
				System.out.println("The number " + n + " cannot be found.");
		}
		sc.close();
	}

	public static int binarySearch(int arr[], int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left)/2;
 
            if (arr[mid] == x)
               return mid;
 
            if (arr[mid] > x)
               return binarySearch(arr, left, mid-1, x);
 
            return binarySearch(arr, mid+1, right, x);
        }
        return -1;
    }
}
