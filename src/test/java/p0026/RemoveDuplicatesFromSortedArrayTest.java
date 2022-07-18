package p0026;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayTest {

	RemoveDuplicatesFromSortedArray solution;

	@BeforeEach
	void setUp() {
		solution = new RemoveDuplicatesFromSortedArray();
	}

	@Test
	public void test_RemoveDuplicates_EmptyArray_ShouldReturnEmptyArray() {
		int[] nums = new int[0];
		int k = solution.removeDuplicates(nums);
		int[] expected = new int[0];
		assertArrayEqualsAfterRemovingDuplicates(expected, nums, k);
	}

	@Test
	public void test_RemoveDuplicates_SingleElementArray_ShouldReturnTheSameArray() {
		int[] nums = new int[]{1};
		int k = solution.removeDuplicates(nums);
		int[] expected = new int[]{1};
		assertArrayEqualsAfterRemovingDuplicates(expected, nums, k);
	}

	@Test
	public void test_RemoveDuplicates_DoubleElementArray_NoDuplicates_ShouldReturnTheSameArray() {
		int[] nums = new int[]{1, 2};
		int k = solution.removeDuplicates(nums);
		int[] expected = new int[]{1, 2};
		assertArrayEqualsAfterRemovingDuplicates(expected, nums, k);
	}

	@Test
	public void test_RemoveDuplicates_DoubleElementArray_Duplicates_ShouldReturnSingleElementArray() {
		int[] nums = new int[]{1, 1};
		int k = solution.removeDuplicates(nums);
		int[] expected = new int[]{1};
		assertArrayEqualsAfterRemovingDuplicates(expected, nums, k);
	}

	@Test
	public void test_RemoveDuplicates_MultipleElementArray_DoubleDuplicatesAtTheBeginning_ShouldReturnSingleElementArray() {
		int[] nums = new int[]{1, 1, 2};
		int k = solution.removeDuplicates(nums);
		int[] expected = new int[]{1, 2};
		assertArrayEqualsAfterRemovingDuplicates(expected, nums, k);
	}

	@Test
	public void test_RemoveDuplicates_MultipleElementArray_NoDuplicates_ShouldReturnTheSameArray() {
		int[] nums = new int[]{1, 2, 3, 4, 5};
		int k = solution.removeDuplicates(nums);
		int[] expected = new int[]{1, 2, 3, 4, 5};
		assertArrayEqualsAfterRemovingDuplicates(expected, nums, k);
	}

	@Test
	public void test_RemoveDuplicates_MultipleElementArray_AllDuplicates_ShouldReturnSingleElementArray() {
		int[] nums = new int[]{1, 1, 1, 1, 1};
		int k = solution.removeDuplicates(nums);
		int[] expected = new int[]{1};
		assertArrayEqualsAfterRemovingDuplicates(expected, nums, k);
	}

	@Test
	public void test_RemoveDuplicates_MultipleElementArray_SuccessiveDuplicatesOfOneValue_ShouldSuccess() {
		int[] nums = new int[]{1, 1, 2, 3, 4};
		int k = solution.removeDuplicates(nums);
		int[] expected = new int[]{1, 2, 3, 4};
		assertArrayEqualsAfterRemovingDuplicates(expected, nums, k);
	}

	@Test
	public void test_RemoveDuplicates_MultipleElementArray_ApartDuplicatesOfOneValue_ShouldSuccess() {
		int[] nums = new int[]{1, 1, 2, 3, 3};
		int k = solution.removeDuplicates(nums);
		int[] expected = new int[]{1, 2, 3};
		assertArrayEqualsAfterRemovingDuplicates(expected, nums, k);
	}

	@Test
	public void test_RemoveDuplicates_MultipleElementArray_DuplicatesOfOneValueAtTheEnd_ShouldSuccess() {
		int[] nums = new int[]{1, 2, 3, 4, 4};
		int k = solution.removeDuplicates(nums);
		int[] expected = new int[]{1, 2, 3, 4};
		assertArrayEqualsAfterRemovingDuplicates(expected, nums, k);
	}

	@Test
	public void test_RemoveDuplicates_MultipleElementArray_DuplicatesOfTwoValue_ShouldSuccess() {
		int[] nums = new int[]{1, 1, 2, 2, 3, 3};
		int k = solution.removeDuplicates(nums);
		int[] expected = new int[]{1, 2, 3};
		assertArrayEqualsAfterRemovingDuplicates(expected, nums, k);
	}

	@Test
	public void test_RemoveDuplicates_MultipleElementArray_DuplicatesOfMultipleValues_ShouldSuccess() {
		int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		int k = solution.removeDuplicates(nums);
		int[] expected = new int[]{0, 1, 2, 3, 4};
		assertArrayEqualsAfterRemovingDuplicates(expected, nums, k);
	}

	private void assertArrayEqualsAfterRemovingDuplicates(int[] expected, int[] actual, int k) {
		for (int i = 0; i < k; i++) {
			assertEquals(expected[i], actual[i]);
		}
	}
}