package p0977;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquaresOfASortedArrayTest {

	SquaresOfASortedArray4 solution;

	@BeforeEach
	void setUp() {
		solution = new SquaresOfASortedArray4();
	}

	@Test
	public void test_SortedSquares_NullArray_ShouldReturnNull() {
		int[] nums = null;
		int[] actual = solution.sortedSquares(nums);
		assertNull(actual);
	}

	@Test
	public void test_SortedSquares_EmptyArray_ShouldReturnEmptyArray() {
		int[] nums = new int[0];
		int[] actual = solution.sortedSquares(nums);
		int[] expected = new int[0];
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_SortedSquares_SingleNegativeElementArray_ShouldSuccess() {
		int[] nums = new int[]{-7};
		int[] actual = solution.sortedSquares(nums);
		int[] expected = new int[]{49};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_SortedSquares_AllNegativeElementsArray_ShouldSuccess() {
		int[] nums = new int[]{-7, -3};
		int[] actual = solution.sortedSquares(nums);
		int[] expected = new int[]{9, 49};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_SortedSquares_AllButLastNegativeElementsArray_ShouldSuccess() {
		int[] nums = new int[]{-7, -3, -1, 2};
		int[] actual = solution.sortedSquares(nums);
		int[] expected = new int[]{1, 4, 9, 49};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_SortedSquares_SinglePositiveElementArray_ShouldSuccess() {
		int[] nums = new int[]{7};
		int[] actual = solution.sortedSquares(nums);
		int[] expected = new int[]{49};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_SortedSquares_AllPositiveElementsArray_ShouldSuccess() {
		int[] nums = new int[]{3, 7};
		int[] actual = solution.sortedSquares(nums);
		int[] expected = new int[]{9, 49};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_SortedSquares_AllButFirstPositivetiveElementsArray_ShouldSuccess() {
		int[] nums = new int[]{-7, 0, 2, 3, 9};
		int[] actual = solution.sortedSquares(nums);
		int[] expected = new int[]{0, 4, 9, 49, 81};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_SortedSquares_NegativeAndPostiveNumbersHavingTheSameSquareValue_ShouldPutTheSquareValueTwice() {
		int[] nums = new int[]{-7, -3, 2, 3, 11};
		int[] actual = solution.sortedSquares(nums);
		int[] expected = new int[]{4, 9, 9, 49, 121};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_SortedSquares_EmptyArray_NegativePostiveAndZeroMixed() {
		int[] nums = new int[]{-4, -1, 0, 3, 10};
		int[] actual = solution.sortedSquares(nums);
		int[] expected = new int[]{0, 1, 9, 16, 100};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_SortedSquares_EmptyArray_NegativeAndPositiveBoundryValues_ShouldSuccess() {
		int[] nums = new int[]{-10000, -4, -1, 0, 3, 10, 10000};
		int[] actual = solution.sortedSquares(nums);
		int[] expected = new int[]{0, 1, 9, 16, 100, 100000000, 100000000};
		assertArrayEquals(expected, actual);
	}
}