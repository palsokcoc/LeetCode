package p1299;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReplaceElementsWithGreatestElementOnRightSideTest {

	ReplaceElementsWithGreatestElementOnRightSide solution;

	@BeforeEach
	void setUp() {
		solution = new ReplaceElementsWithGreatestElementOnRightSide();
	}

	@Test
	public void test_ReplaceElements_SingleElementArray_ShouldSuccess() {
		int[] arr = new int[]{1};
		int[] actual = solution.replaceElements(arr);
		int[] expected = new int[]{-1};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_ReplaceElements_LengthTwoArray_AllAscending_ShouldSuccess() {
		int[] arr = new int[]{1, 2};
		int[] actual = solution.replaceElements(arr);
		int[] expected = new int[]{2, -1};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_ReplaceElements_LengthTwoArray_AllDescending_ShouldSuccess() {
		int[] arr = new int[]{2, 1};
		int[] actual = solution.replaceElements(arr);
		int[] expected = new int[]{1, -1};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_ReplaceElements_LengthTwoArray_AllSame_ShouldSuccess() {
		int[] arr = new int[]{1, 1};
		int[] actual = solution.replaceElements(arr);
		int[] expected = new int[]{1, -1};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_ReplaceElements_LengthThreeArray_AllAscending_ShouldSuccess() {
		int[] arr = new int[]{1, 2, 3};
		int[] actual = solution.replaceElements(arr);
		int[] expected = new int[]{3, 3, -1};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_ReplaceElements_LengthThreeArray_AllDescending_ShouldSuccess() {
		int[] arr = new int[]{3, 2, 1};
		int[] actual = solution.replaceElements(arr);
		int[] expected = new int[]{2, 1, -1};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_ReplaceElements_LengthThreeArray_AllSame_ShouldSuccess() {
		int[] arr = new int[]{1, 1, 1};
		int[] actual = solution.replaceElements(arr);
		int[] expected = new int[]{1, 1, -1};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_ReplaceElements_LengthThreeArray_FirstElementLargest_NotSorted_ShouldSuccess() {
		int[] arr = new int[]{3, 1, 2};
		int[] actual = solution.replaceElements(arr);
		int[] expected = new int[]{2, 2, -1};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_ReplaceElements_LengthThreeArray_FirstElementSmallest_NotSorted_ShouldSuccess() {
		int[] arr = new int[]{1, 3, 2};
		int[] actual = solution.replaceElements(arr);
		int[] expected = new int[]{3, 2, -1};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_ReplaceElements_LengthFourArray_AllDescending_ShouldSuccess() {
		int[] arr = new int[]{4, 3, 2, 1};
		int[] actual = solution.replaceElements(arr);
		int[] expected = new int[]{3, 2, 1, -1};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_ReplaceElements_LengthFourArray_AllSame_ShouldSuccess() {
		int[] arr = new int[]{1, 1, 1, 1};
		int[] actual = solution.replaceElements(arr);
		int[] expected = new int[]{1, 1, 1, -1};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_ReplaceElements_LengthFourArray_FirstElementLargest_NotSorted_ShouldSuccess() {
		int[] arr = new int[]{4, 3, 1, 2};
		int[] actual = solution.replaceElements(arr);
		int[] expected = new int[]{3, 2, 2, -1};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_ReplaceElements_LengthFourArray_FirstElementSmallest_NotSorted_ShouldSuccess() {
		int[] arr = new int[]{1, 3, 4, 2};
		int[] actual = solution.replaceElements(arr);
		int[] expected = new int[]{4, 4, 2, -1};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_ReplaceElements_LengthSixArray_RandomContent_ShouldSuccess() {
		int[] arr = new int[]{17, 18, 5, 4, 6, 1};
		int[] actual = solution.replaceElements(arr);
		int[] expected = new int[]{18, 6, 6, 6, 1, -1};
		assertArrayEquals(expected, actual);
	}
}