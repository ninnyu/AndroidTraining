package assignment8.testassign4;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import assignment4.RemoveDupesSortedArray;

/** 
 * @author Dragos Review
 * Looks great!
 */

public class TestRemoveDupes {
	Integer[] input = {1, 2, 2, 3, 4};
	Integer[] expected = {1, null, 2, 3, 4};
	
	@Test
	public void test() {
		RemoveDupesSortedArray removeDupesSortedArray = new RemoveDupesSortedArray();
		removeDupesSortedArray.removeDupes(input);
		
		assertArrayEquals(expected, input);
	}
}
