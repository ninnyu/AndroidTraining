package assignment8.testassign1;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import assignment1.ArmstrongNum;

/** 
 * @author Dragos Review
 * Looks great!
 */

@RunWith(Parameterized.class)
public class TestArmstrong {
	
	private int input;
	private boolean expectedResult;
	private ArmstrongNum armstrong = new ArmstrongNum();

	@Before
	public void initialize() {
		armstrong = new ArmstrongNum();
	}
	
	public TestArmstrong (int input, boolean expectedResult) {
		this.input = input;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection armstrongNumbers() {
		return Arrays.asList(new Object[][] {
			{1, true},
			{153, true},
			{370, true},
			{371, true},
			{407, true},
			{2, false},
			{50, false},
		});
	}

	@Test
	public void test() {
		System.out.println("Testing Armstrong number..." + input + " " + expectedResult);
		assertEquals(expectedResult, armstrong.isArmstrong(input));
	}
}