/*
 * Name: PalindromeNum
 * @author NinnYu Chin
 * Description: Prints palindrome numbers from 1 to 100.
 */

package assignment1;
public class PalindromeNum {
	public static void main (String[] args) {
		System.out.println("Here is a list of numbers from 1 to 100 that is a palindrome.");
		
		for (int i = 0; i <= 100; i++) {
			String s = Integer.toString(i);
			if ( isPalindrome(s) )
				System.out.print(i + " ");
		}
	}
	
	public static boolean isPalindrome(String s) {
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
}
