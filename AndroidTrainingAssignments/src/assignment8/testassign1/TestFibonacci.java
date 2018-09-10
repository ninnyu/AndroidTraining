package assignment8.testassign1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.omg.CORBA.INITIALIZE;

import assignment1.FibonacciSeries;

public class TestFibonacci {
	int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
	int[] actual;
	FibonacciSeries fibonacciSeries = new FibonacciSeries();
	
	@Test
	public void test() {
		actual = fibonacciSeries.fib(10);
		System.out.println("Testing Fibonacci... ");
		assertArrayEquals(expected, actual);
	}
}
