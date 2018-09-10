/*
 * Name: ArmstrongNum
 * @author NinnYu Chin
 * Description: Prints armstrong numbers from 1 to 500.
 */

package assignment1;
public class ArmstrongNum {
	public static void main (String[] args) {
		ArmstrongNum armstrongNum = new ArmstrongNum();
		
		System.out.println("Here is a list of armstrong numbers from 1 to 500.");
		for (int i = 1; i <= 500; i++) {
			if (armstrongNum.isArmstrong(i))
				System.out.print(i + " ");
		}
	}
	
	public boolean isArmstrong (Integer n) {
		String s = Integer.toString(n);
		int[] arr = new int[s.length()];
		int a = 0;
		
		for (int i = 0; i < s.length(); i++) {
			arr[i] = Character.getNumericValue(s.charAt(i));
			a += Math.pow(arr[i], 3);
		}
		
		if (a == n)
			return true;
		else
			return false;
	}
}
