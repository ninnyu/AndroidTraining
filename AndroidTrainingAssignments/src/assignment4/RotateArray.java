/*
 * Name: RotArray
 * @author NinnYu Chin
 * Description: Rotate a given array to the right by getting input from user if n=3,
 * then [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */

package assignment4;
import java.util.*;

public class RotateArray {
	public static void main (String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Here is your original array: ");
		printArray(arr);
		
		System.out.println("\n\nEnter a number to rotate the array: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++)
			rotateArray(arr, arr.length);
		
		System.out.println("\nHere is your new rotated array: ");
		printArray(arr);
		
		sc.close();
	}
	
	public static void rotateArray(int[] arr, int n) {
		int temp = arr[0];
		int i;
		for (i = 0; i < n-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ", ");
		}
	}
}
