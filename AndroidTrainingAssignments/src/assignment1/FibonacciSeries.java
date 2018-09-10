/*
 * Name: FibonacciSeries
 * @author NinnYu Chin
 * Description: Prints the first 25 numbers of the fibonacci sequence.
 */

package assignment1;
public class FibonacciSeries {
	public static void main (String[] args) {
		System.out.println("Here are the first 10 numbers of the fibonacci sequence.");
		
		int[] arr = fib(10);
		
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] fib(int n) {
		int[] fibArray = new int[n];
		
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				fibArray[i] = 0;
			}
			if (i == 1) {
				fibArray[i] = 1;
			}
			else if (i >= 2) {
				fibArray[i] = fibArray[i-2] + fibArray[i-1];
			}
		}
		return fibArray;
	}
}
