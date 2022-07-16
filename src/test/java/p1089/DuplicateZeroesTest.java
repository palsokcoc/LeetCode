package p1089;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DuplicateZeroesTest {

	DuplicateZeroes2 solution;

	@BeforeEach
	void setUp() {
		solution = new DuplicateZeroes2();
	}

	@Test
	public void test_DuplicateZeros_EmptyArray_ShouldReturnEmptyArray() {
		int[] actual = new int[0];
		solution.duplicateZeros(actual);
		int[] expected = new int[0];
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_DuplicateZeros_ArrayWithNoZeroes_ShouldReturnTheSameArray() {
		int[] actual = new int[]{1, 2, 3};
		solution.duplicateZeros(actual);
		int[] expected = new int[]{1, 2, 3};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_DuplicateZeros_SingleNonZeroElementArray_ShouldReturnTheSameArray() {
		int[] actual = new int[]{1};
		solution.duplicateZeros(actual);
		int[] expected = new int[]{1};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_DuplicateZeros_SingleZeroElementArray_ShouldReturnTheSameArray() {
		int[] actual = new int[]{0};
		solution.duplicateZeros(actual);
		int[] expected = new int[]{0};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_DuplicateZeros_DoubleZeroElementsArray_ShouldReturnTheSameArray() {
		int[] actual = new int[]{0, 0};
		solution.duplicateZeros(actual);
		int[] expected = new int[]{0, 0};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_DuplicateZeros_MultipleZeroElementsArray_ShouldReturnTheSameArray() {
		int[] actual = new int[]{0, 0, 0, 0, 0, 0, 0};
		solution.duplicateZeros(actual);
		int[] expected = new int[]{0, 0, 0, 0, 0, 0, 0};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_DuplicateZeros_MultipleElementsLeadingZeroArray_ShouldSuccess() {
		int[] actual = new int[]{0, 1, 2, 3};
		solution.duplicateZeros(actual);
		int[] expected = new int[]{0, 0, 1, 2};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_DuplicateZeros_MultipleElementsLeadingZerosArray_ShouldSuccess() {
		int[] actual = new int[]{0, 0, 2, 3, 4, 5};
		solution.duplicateZeros(actual);
		int[] expected = new int[]{0, 0, 0, 0, 2, 3};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_DuplicateZeros_MultipleElementsTrailingZeroArray_ShouldSuccess() {
		int[] a = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
		solution.duplicateZeros(a);
		int[] e = new int[]{1, 0, 0, 2, 3, 0, 0, 4};
		assertArrayEquals(e, a);
	}

	@Test
	public void test_DuplicateZeros_MultipleSuccessiveZeroesInTheMiddleArray_ShouldSuccess() {
		int[] a = new int[]{8, 4, 5, 0, 0, 0, 0, 7};
		solution.duplicateZeros(a);
		int[] e = new int[]{8, 4, 5, 0, 0, 0, 0, 0};
		assertArrayEquals(e, a);
	}

	@Test
	public void test_DuplicateZeros_MixedArray_ShouldSuccess() {
		int[] a = new int[]{1, 5, 2, 0, 6, 8, 0, 6, 0};
		solution.duplicateZeros(a);
		int[] e = new int[]{1, 5, 2, 0, 0, 6, 8, 0, 0};
		assertArrayEquals(e, a);
	}
}