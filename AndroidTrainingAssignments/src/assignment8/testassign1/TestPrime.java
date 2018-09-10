package assignment8.testassign1;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import assignment1.ArmstrongNum;
import assignment1.PrimeNum;

@RunWith(Parameterized.class)
public class TestPrime {
	
	private int input;
	private boolean expectedResult;
	private PrimeNum primeNum = new PrimeNum();

	@Before
	public void initialize() {
		primeNum = new PrimeNum();
	}
	
	public TestPrime(int input, boolean expectedResult) {
		this.input = input;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection armstrongNumbers() {
		return Arrays.asList(new Object[][] {
			{2, true},
			{3, true},
			{4, false},
			{9, false},
			{29, true}
		});
	}

	@Test
	public void test() {
		System.out.println("Testing Prime number..." + input + " " + expectedResult);
		assertEquals(expectedResult, primeNum.isPrime(input));
	}
}
