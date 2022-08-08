package p0414;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ThirdMaximumNumberTest {

	ThirdMaximumNumber solution;

	@BeforeEach
	void setUp() {
		solution = new ThirdMaximumNumber();
	}

	@Test
	public void test_ThirdMax_LengthOneArray_ShouldSuccess() {
		int[] nums = new int[]{1};
		int actual = solution.thirdMax(nums);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ThirdMax_LengthTwoArray_Ascending_ShouldSuccess() {
		int[] nums = new int[]{1, 2};
		int actual = solution.thirdMax(nums);
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ThirdMax_LengthTwoArray_Descending_ShouldSuccess() {
		int[] nums = new int[]{2, 1};
		int actual = solution.thirdMax(nums);
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ThirdMax_LengthThreeArray_TwoUniqueNumbers_ShouldSuccess() {
		int[] nums = new int[]{1, 2, 2};
		int actual = solution.thirdMax(nums);
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ThirdMax_LengthThreeArray_Ascending_ShouldSuccess() {
		int[] nums = new int[]{1, 2, 3};
		int actual = solution.thirdMax(nums);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ThirdMax_LengthThreeArray_Descending_ShouldSuccess() {
		int[] nums = new int[]{3, 2, 1};
		int actual = solution.thirdMax(nums);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ThirdMax_LengthThreeArray_NotSorted_ShouldSuccess() {
		int[] nums = new int[]{3, 1, 2};
		int actual = solution.thirdMax(nums);
		int expected = 1;
		assertEquals(expected, actual);
	}


	@Test
	public void test_ThirdMax_LengthFourArray_TwoUniqueNumbers_ShouldSuccess() {
		int[] nums = new int[]{2, 2, 3, 1};
		int actual = solution.thirdMax(nums);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ThirdMax_LengthFourArray_ThreeUniqueNumbers_ShouldSuccess() {
		int[] nums = new int[]{2, 2, 3, 2};
		int actual = solution.thirdMax(nums);
		int expected = 3;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ThirdMax_LengthFourArray_Ascending_ShouldSuccess() {
		int[] nums = new int[]{1, 2, 3, 4};
		int actual = solution.thirdMax(nums);
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ThirdMax_LengthFourArray_Descending_ShouldSuccess() {
		int[] nums = new int[]{4, 3, 2, 1};
		int actual = solution.thirdMax(nums);
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ThirdMax_LengthFourArray_NotSorted_ShouldSuccess() {
		int[] nums = new int[]{3, 1, 4, 2};
		int actual = solution.thirdMax(nums);
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ThirdMax_OneIntegerMin_NotSorted_ShouldSuccess() {
		int[] nums = new int[]{1, 2, Integer.MIN_VALUE};
		int actual = solution.thirdMax(nums);
		int expected = Integer.MIN_VALUE;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ThirdMax_TwoItegerMins_NotSorted_ShouldSuccess() {
		int[] nums = new int[]{Integer.MIN_VALUE, 1, Integer.MIN_VALUE};
		int actual = solution.thirdMax(nums);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_ThirdMax_ThreeIntegerMins_ShouldSuccess() {
		int[] nums = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
		int actual = solution.thirdMax(nums);
		int expected = Integer.MIN_VALUE;
		assertEquals(expected, actual);
	}
}