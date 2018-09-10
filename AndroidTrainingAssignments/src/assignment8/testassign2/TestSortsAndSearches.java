package assignment8.testassign2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import assignment2.BinarySearch;
import assignment2.BubbleSort;
import assignment2.InsertionSort;
import assignment2.LinearSearch;
import assignment2.SelectionSort;

public class TestSortsAndSearches {
	
	@Test
	public void testBinarySearch() {
		int[] input = {2, 3, 4, 5, 6, 7, 8, 9, 22, 33};
		int expected = 4; //searching for the number 6, returns index 4
		
		BinarySearch binarySearch = new BinarySearch();
		
		assertEquals(expected, binarySearch.binarySearch(input, 0, 10, 6));
	}

	@Test
	public void testBubbleSort() {
		int[] input = {3, 1, 9, 4, 90};
		int[] expected = {1, 3, 4, 9, 90};
		
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSort(input);
		
		assertArrayEquals(expected, input);
	}
	
	@Test
	public void testInsertionSort() {
		int[] input = {3, 1, 9, 4, 90};
		int[] expected = {1, 3, 4, 9, 90};
		
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.insertSort(input);
		
		assertArrayEquals(expected, input);
	}
	
	@Test
	public void testLinearSearch() {
		int[] input = {2, 3, 4, 5, 6, 7, 8, 9, 22, 33};
		int expected = 4; //searching for the number 6, returns index 4
		
		LinearSearch linearSearch = new LinearSearch();
		
		assertEquals(expected, linearSearch.linearSearch(input, 6));
	}
	
	@Test
	public void testSelectionSort() {
		int[] input = {3, 1, 9, 4, 90};
		int[] expected = {1, 3, 4, 9, 90};
		
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.selectSort(input);
		
		assertArrayEquals(expected, input);
	}
}
