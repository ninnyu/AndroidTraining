package assignment8.testassign1;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import assignment1.ArmstrongNum;
import assignment1.FactorialNum;

/** 
 * @author Dragos Review
 * Looks great!
 */

@RunWith(Parameterized.class)
public class TestFactorial {
	
	private int input, expectedResult;
	private FactorialNum factorial;

	@Before
	public void initialize() {
		factorial = new FactorialNum();
	}
	
	public TestFactorial(int input, int expectedResult) {
		this.input = input;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection armstrongNumbers() {
		return Arrays.asList(new Object[][] {
			{1, 1},
			{2, 2},
			{5, 120}
		});
	}

	@Test
	public void test() {
		System.out.println("Testing Armstrong number..." + input + " " + expectedResult);
		assertEquals(expectedResult, factorial.findFactorial(input));
	}
}
