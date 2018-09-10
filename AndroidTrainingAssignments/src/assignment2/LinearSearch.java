/*
 * Name: LinearSearch
 * @author NinnYu Chin
 * Description: Function for linear search. Returns -1 if not found.
 */

package assignment2;
import java.util.Scanner;

public class LinearSearch {
	
	public static void main (String[] args) {
		int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 22, 33, 44, 55, 66, 77, 88, 99};

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to search. Enter anything but a number to stop searching. ");
		
		while ( sc.hasNextInt() ) {
			int n = sc.nextInt();
			int key = linearSearch(arr, n);
		
			if ( key >= 0)
				System.out.println("The number " + n + " is found at index " + key + ".");
			else
				System.out.println("The number " + n + " cannot be found.");
		}
		sc.close();
	}

	public static int linearSearch(int[] arr, int x) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == x)
	                return i;
	        }
	        return -1;
	}
}
