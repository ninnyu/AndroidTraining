package assignment8.testassign1;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import assignment1.ArmstrongNum;
import assignment1.PalindromeNum;

@RunWith(Parameterized.class)
public class TestPalindrome {
	
	private String input;
	private boolean expectedResult;
	private PalindromeNum palindrome = new PalindromeNum();

	@Before
	public void initialize() {
		palindrome = new PalindromeNum();
	}
	
	public TestPalindrome (String input, boolean expectedResult) {
		this.input = input;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection armstrongNumbers() {
		return Arrays.asList(new Object[][] {
			{"1", true},
			{"55", true},
			{"77", true},
			{"81", false},
			{"90", false},
			{"999", true}
		});
	}

	@Test
	public void test() {
		System.out.println("Testing Palindrome number..." + input + " " + expectedResult);
		assertEquals(expectedResult, palindrome.isPalindrome(input));
	}
}