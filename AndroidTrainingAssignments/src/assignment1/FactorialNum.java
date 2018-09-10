/*
 * Name: FactorialNum
 * @author NinnYu Chin
 * Description: Prints the factorials of numbers 1 to 10.
 */

package assignment1;
public class FactorialNum {
	public static void main (String[] args) {
		System.out.println("Here is a list of factorials of numbers from 1 to 10.");
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + "! = " + findFactorial(i));;
		}
	}
	
	public static int findFactorial (int x) {
		int n = 1;
		for (int i = x; i > 0; i--) {
			n *= i;
		}
		return n;
	}
}
