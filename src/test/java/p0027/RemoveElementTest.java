package p0027;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveElementTest {

	RemoveElement solution;

	@BeforeEach
	void setUp() {
		solution = new RemoveElement();
	}

	@Test
	public void test_RemoveElement_EmptyArray_ShouldReturnEmptyArray() {
		int[] nums = new int[0];
		int val = 1;
		int k = solution.removeElement(nums, val);
		int[] expected = new int[0];
		assertEquals(0, k);
		assertArrayEqualsAfterSorting(expected, nums, k);
	}

	@Test
	public void test_RemoveElement_SingleElementArray_DifferentValue_ShouldReturnTheSameArray() {
		int[] nums = new int[]{1};
		int val = 2;
		int k = solution.removeElement(nums, val);
		int[] expected = new int[]{1};
		assertEquals(1, k);
		assertArrayEqualsAfterSorting(expected, nums, k);
	}

	@Test
	public void test_RemoveElement_SingleElementArray_SameValue_ShouldReturnEmptyArray() {
		int[] nums = new int[]{1};
		int val = 1;
		int k = solution.removeElement(nums, val);
		int[] expected = new int[0];
		assertEquals(0, k);
		assertArrayEqualsAfterSorting(expected, nums, k);
	}

	@Test
	public void test_RemoveElement_DoubleSameElementArray_DifferentValue_ShouldReturnTheSameArray() {
		int[] nums = new int[]{1, 1};
		int val = 2;
		int k = solution.removeElement(nums, val);
		int[] expected = new int[]{1, 1};
		assertEquals(2, k);
		assertArrayEqualsAfterSorting(expected, nums, k);
	}

	@Test
	public void test_RemoveElement_DoubleSameElementArray_SameValue_ShouldReturnEmptyArray() {
		int[] nums = new int[]{1, 1};
		int val = 1;
		int k = solution.removeElement(nums, val);
		int[] expected = new int[0];
		assertEquals(0, k);
		assertArrayEqualsAfterSorting(expected, nums, k);
	}

	@Test
	public void test_RemoveElement_MultipleSameElementArray_DifferentValue_ShouldReturnTheSameArray() {
		int[] nums = new int[]{1, 1, 1};
		int val = 2;
		int k = solution.removeElement(nums, val);
		int[] expected = new int[]{1, 1, 1};
		assertEquals(3, k);
		assertArrayEqualsAfterSorting(expected, nums, k);
	}

	@Test
	public void test_RemoveElement_MultipleSameElementArray_SameValue_ShouldReturnEmptyArray() {
		int[] nums = new int[]{1, 1, 1};
		int val = 1;
		int k = solution.removeElement(nums, val);
		int[] expected = new int[0];
		assertEquals(0, k);
		assertArrayEqualsAfterSorting(expected, nums, k);
	}

	@Test
	public void test_RemoveElement_MultipleElementArray_NoMatchingValue_ShouldReturnTheSameArray() {
		int[] nums = new int[]{1, 2, 3};
		int val = 0;
		int k = solution.removeElement(nums, val);
		int[] expected = new int[]{1, 2, 3};
		assertEquals(3, k);
		assertArrayEqualsAfterSorting(expected, nums, k);
	}

	@Test
	public void test_RemoveElement_MultipleElementArray_ValueMatchingFirstElement_ShouldSuccess() {
		int[] nums = new int[]{1, 2, 3};
		int val = 1;
		int k = solution.removeElement(nums, val);
		int[] expected = new int[]{2, 3};
		assertEquals(2, k);
		assertArrayEqualsAfterSorting(expected, nums, k);
	}

	@Test
	public void test_RemoveElement_MultipleElementArray_ValueMatchingMiddleElement_ShouldSuccess() {
		int[] nums = new int[]{1, 2, 3};
		int val = 2;
		int k = solution.removeElement(nums, val);
		int[] expected = new int[]{1, 3};
		assertEquals(2, k);
		assertArrayEqualsAfterSorting(expected, nums, k);
	}

	@Test
	public void test_RemoveElement_MultipleElementArray_ValueMatchingLastElement_ShouldSuccess() {
		int[] nums = new int[]{1, 2, 3};
		int val = 3;
		int k = solution.removeElement(nums, val);
		int[] expected = new int[]{1, 2};
		assertEquals(2, k);
		assertArrayEqualsAfterSorting(expected, nums, k);
	}

	@Test
	public void test_RemoveElement_MultipleElementArray_ValueMatchingMultipleElements_ShouldSuccess() {
		int[] nums = new int[]{1, 2, 3, 1, 2, 3};
		int val = 1;
		int k = solution.removeElement_By_Ray_Kim_12(nums, val);
		int[] expected = new int[]{2, 3, 2, 3};
		assertEquals(4, k);
		assertArrayEqualsAfterSorting(expected, nums, k);
	}

	private void assertArrayEqualsAfterSorting(int[] expected, int[] actual, int k) {
		Arrays.sort(expected,0,k);
		Arrays.sort(actual,0,k);
		for (int i = 0; i < k; i++) {
			assertEquals(expected[i], actual[i]);
		}
	}
}