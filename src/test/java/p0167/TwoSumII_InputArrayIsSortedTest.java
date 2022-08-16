package p0167;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumII_InputArrayIsSortedTest {

	TwoSumII_InputArrayIsSorted solution;

	@BeforeEach
	void setUp() {
		solution = new TwoSumII_InputArrayIsSorted();
	}

	@Test
	public void test_TwoSum_LengthTwo_ShouldSuccess() {
		int[] nums = {5, 6};
		int target = 11;
		int[] actual = solution.twoSum(nums, target);
		int[] expected = {1, 2};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_TwoSum_LengthThree_SumOf1And2_ShouldSuccess() {
		int[] nums = {5, 6, 7};
		int target = 11;
		int[] actual = solution.twoSum(nums, target);
		int[] expected = {1, 2};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_TwoSum_LengthThree_SumOf1And3_ShouldSuccess() {
		int[] nums = {5, 6, 7};
		int target = 12;
		int[] actual = solution.twoSum(nums, target);
		int[] expected = {1, 3};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_TwoSum_LengthThree_SumOf2And3_ShouldSuccess() {
		int[] nums = {5, 6, 7};
		int target = 13;
		int[] actual = solution.twoSum(nums, target);
		int[] expected = {2, 3};
		assertArrayEquals(expected, actual);
	}
}