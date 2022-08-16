package p0209;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinimumSizeSubarraySumTest {

	MinimumSizeSubarraySum solution;

	@BeforeEach
	void setUp() {
		solution = new MinimumSizeSubarraySum();
	}

	@Test
	public void test_MinSubArrayLen_LengthOne_WrongTarget_ShouldReturn0() {
		int[] nums = {5};
		int target = 6;
		int actual = solution.minSubArrayLen(target, nums);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_MinSubArrayLen_LengthOne_CorrectTarget_ShouldReturn1() {
		int[] nums = {5};
		int target = 5;
		int actual = solution.minSubArrayLen(target, nums);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_MinSubArrayLen_LengthTwo_WrongTarget_ShouldReturn0() {
		int[] nums = {5, 6};
		int target = 12;
		int actual = solution.minSubArrayLen(target, nums);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_MinSubArrayLen_LengthTwo_FirstElementAsTarget_ShouldReturn1() {
		int[] nums = {5, 6};
		int target = 5;
		int actual = solution.minSubArrayLen(target, nums);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_MinSubArrayLen_LengthTwo_SecondElementAsTarget_ShouldReturn1() {
		int[] nums = {5, 6};
		int target = 6;
		int actual = solution.minSubArrayLen(target, nums);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_MinSubArrayLen_LengthTwo_TotalSumAsTarget_ShouldReturn2() {
		int[] nums = {5, 6};
		int target = 11;
		int actual = solution.minSubArrayLen(target, nums);
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void test_MinSubArrayLen_LengthThree_SingleRepeatingElementAsTarget_ShouldReturn2() {
		int[] nums = {2, 4, 4};
		int target = 4;
		int actual = solution.minSubArrayLen(target, nums);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_MinSubArrayLen_LengthSix_SumOfLastTwoElementsAsTarget_ShouldReturn2() {
		int[] nums = {2, 3, 1, 2, 4, 3};
		int target = 7;
		int actual = solution.minSubArrayLen(target, nums);
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void test_MinSubArrayLen_LengthSix_SameElements_WrongTarget_ShouldReturn0() {
		int[] nums = {1, 1, 1, 1, 1, 1};
		int target = 11;
		int actual = solution.minSubArrayLen(target, nums);
		int expected = 0;
		assertEquals(expected, actual);
	}
}