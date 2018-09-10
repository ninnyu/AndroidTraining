package assignment8.testassign4;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import assignment4.RotateArray;

public class TestRotateArray {
	int[] input = {1, 2, 3, 4, 5, 6, 7};
	int[] expected = {3, 4, 5, 6, 7, 1, 2};	//expected after rotating by 2
	
	@Test
	public void test() {
		RotateArray rotateArray = new RotateArray();
		
		for (int i = 0; i < 2; i++)
			rotateArray.rotateArray(input, input.length);
		
		assertArrayEquals(expected, input);
	}
}
