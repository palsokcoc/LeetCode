package p0724;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindPivotIndexTest {

	FindPivotIndex solution;

	@BeforeEach
	void setUp() {
		solution = new FindPivotIndex();
	}

	@Test
	public void test_PivotIndex_LengthOne_ZeroElement_ShouldReturnZero() {
		int[] nums = {0};
		int actual = solution.pivotIndex(nums);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_PivotIndex_LengthOne_NonZeroElement_ShouldReturnZero() {
		int[] nums = {1};
		int actual = solution.pivotIndex(nums);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_PivotIndex_LengthTwo_AllZeros_ShouldReturnZero() {
		int[] nums = {0, 0};
		int actual = solution.pivotIndex(nums);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_PivotIndex_LengthThree_AllZeros_ShouldReturnZero() {
		int[] nums = {0, 0, 0};
		int actual = solution.pivotIndex(nums);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_PivotIndex_LengthTwo_ZeroSum_ShouldReturnMinusOne() {
		int[] nums = {-5, 5};
		int actual = solution.pivotIndex(nums);
		int expected = -1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_PivotIndex_LengthThree_ZeroSumAtTheBeginning_ShouldReturnZero() {
		int[] nums = {-5, 5, 1};
		int actual = solution.pivotIndex(nums);
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void test_PivotIndex_LengthThree_EndingZeroAtTheEnd_ShouldReturnZero() {
		int[] nums = {1, -5, 5};
		int actual = solution.pivotIndex(nums);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_PivotIndex_LengthThree_EqualSumsWithoutPivot_ShouldReturnMinusOne() {
		int[] nums = {1, 2, 3};
		int actual = solution.pivotIndex(nums);
		int expected = -1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_PivotIndex_LengthSix_PivotAtThree_ShouldReturnThree() {
		int[] nums = {1, 7, 3, 6, 5, 6};
		int actual = solution.pivotIndex(nums);
		int expected = 3;
		assertEquals(expected, actual);
	}
}