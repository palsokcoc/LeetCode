package p0747;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LargestNumberAtLeastTwiceOfOthersTest {

	LargestNumberAtLeastTwiceOfOthers solution;

	@BeforeEach
	void setUp() {
		solution = new LargestNumberAtLeastTwiceOfOthers();
	}

	@Test
	public void test_DominantIndex_LengthTwo_AllSame_ShouldReturnMinusOne() {
		int[] nums = {1, 1};
		int actual = solution.dominantIndex(nums);
		int expected = -1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_DominantIndex_LengthTwo_AllDifferent_WithoutDominantIndex_ShouldReturnMinusOne() {
		int[] nums = {2, 3};
		int actual = solution.dominantIndex(nums);
		int expected = -1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_DominantIndex_LengthTwo_AllDifferent_WithDominantIndexZero_ShouldReturnZero() {
		int[] nums = {4, 2};
		int actual = solution.dominantIndex(nums);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_DominantIndex_LengthTwo_AllDifferent_WithDominantIndexOne_ShouldReturnOne() {
		int[] nums = {2, 4};
		int actual = solution.dominantIndex(nums);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_DominantIndex_LengthThree_WithoutDominantIndex_ShouldReturnMinusOne() {
		int[] nums = {4, 6, 7};
		int actual = solution.dominantIndex(nums);
		int expected = -1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_DominantIndex_LengthThree_WithDominantIndexZero_ShouldReturnZero() {
		int[] nums = {6, 2, 3};
		int actual = solution.dominantIndex(nums);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_DominantIndex_LengthThree_WithDominantIndexOne_ShouldReturnOne() {
		int[] nums = {2, 6, 3};
		int actual = solution.dominantIndex(nums);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_DominantIndex_LengthThree_WithDominantIndexTwo_ShouldReturnTwo() {
		int[] nums = {2, 3, 6};
		int actual = solution.dominantIndex(nums);
		int expected = 2;
		assertEquals(expected, actual);
	}
}