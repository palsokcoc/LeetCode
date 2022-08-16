package p0561;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayPartitionTest {

	ArrayPartition solution;

	@BeforeEach
	void setUp() {
		solution = new ArrayPartition();
	}

	@Test
	public void test_ArrayPairSum_OnePair_ShouldReturnTheSumOfThePair() {
		int[] nums = {1, 2};
		int actual = solution.arrayPairSum(nums);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ArrayPairSum_TwoPairs_ShouldSuccess() {
		int[] nums = {1, 2, 3, 4};
		int actual = solution.arrayPairSum(nums);
		int expected = 4;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ArrayPairSum_ThreePairs_ShouldSuccess() {
		int[] nums = {6, 2, 6, 5, 1, 2};
		int actual = solution.arrayPairSum(nums);
		int expected = 9;
		assertEquals(expected, actual);
	}
}