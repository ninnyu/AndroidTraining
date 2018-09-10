/*
 * Name: PrimeNum
 * @author NinnYu Chin
 * Description: Prints prime numbers from 1 to 100.
 */

package assignment1;
public class PrimeNum {
	public static void main (String[] args) {
		System.out.println("Here is a list of prime numbers from 1 to 100.");
		
		for (int i = 2; i <= 100; i++) {
			if ( isPrime(i) ) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	public static boolean isPrime (int x) {
		if ( x == 2)
			return true;
		if ( (x % 2) == 0 )
			return false;
		for (int i = 3; i < x; i += 2) {
			if ( (x % i) == 0 ) {
				return false;
			}
		}
		return true;
	}
}
