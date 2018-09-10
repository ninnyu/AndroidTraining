package assignment8.testassign5;

import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.Test;
import assignment5.RemoveDupesUnsortedArray;

/** 
 * @author Dragos Review
 * Looks great!
 */

public class TestRemoveDupesUnsortedArray {
	Integer[] input = {1, 3, 2, 4, 2};
	Integer[] expected = {1, null, 2, 3, 4};
	
	@Test
	public void test() {
		RemoveDupesUnsortedArray removeDupesUnsortedArray = new RemoveDupesUnsortedArray();
		removeDupesUnsortedArray.removeDupes(input);
		
		assertArrayEquals(expected, input);
	}

}
