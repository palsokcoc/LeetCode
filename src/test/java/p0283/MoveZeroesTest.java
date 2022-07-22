package p0283;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MoveZeroesTest {

	MoveZeroes solution;

	@BeforeEach
	void setUp() {
		solution = new MoveZeroes();
	}

	@Test
	public void test_MoveZeroes_EmptyArray_ShouldReturnEmptyArray() {
		int[] nums = new int[0];
		solution.moveZeroes(nums);
		int[] expected = new int[0];
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthOneArray_Zero_ShouldReturnTheSameArray() {
		int[] nums = new int[]{0};
		solution.moveZeroes(nums);
		int[] expected = new int[]{0};
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthOneArray_NonZero_ShouldReturnTheSameArray() {
		int[] nums = new int[]{1};
		solution.moveZeroes(nums);
		int[] expected = new int[]{1};
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthTwoArray_NoZeroes_ShouldReturnTheSameArray() {
		int[] nums = new int[]{1, 2};
		solution.moveZeroes(nums);
		int[] expected = new int[]{1, 2};
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthTwoArray_AllZeroes_ShouldReturnTheSameArray() {
		int[] nums = new int[]{0, 0};
		solution.moveZeroes(nums);
		int[] expected = new int[]{0, 0};
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthTwoArray_FirstElementZero_ShouldReturnTheReverseArray() {
		int[] nums = new int[]{0, 1};
		solution.moveZeroes(nums);
		int[] expected = new int[]{1, 0};
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthTwoArray_LastElementZero_ShouldReturnTheSameArray() {
		int[] nums = new int[]{1, 0};
		solution.moveZeroes(nums);
		int[] expected = new int[]{1, 0};
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthThreeArray_NoZeroes_ShouldReturnTheSameArray() {
		int[] nums = new int[]{1, 2, 3};
		solution.moveZeroes(nums);
		int[] expected = new int[]{1, 2, 3};
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthThreeArray_AllZeroes_ShouldReturnTheSameArray() {
		int[] nums = new int[]{0, 0, 0};
		solution.moveZeroes(nums);
		int[] expected = new int[]{0, 0, 0};
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthThreeArray_FirstElementZero_ShouldSuccess() {
		int[] nums = new int[]{0, 1, 2};
		solution.moveZeroes(nums);
		int[] expected = new int[]{1, 2, 0};
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthThreeArray_MiddleElementZero_ShouldSuccess() {
		int[] nums = new int[]{1, 0, 2};
		solution.moveZeroes(nums);
		int[] expected = new int[]{1, 2, 0};
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthThreeArray_LastElementZero_ShouldReturnTheSameArray() {
		int[] nums = new int[]{1, 2, 0};
		solution.moveZeroes(nums);
		int[] expected = new int[]{1, 2, 0};
		assertArrayEquals(expected, nums);
	}


	@Test
	public void test_MoveZeroes_LengthFourArray_NoZeroes_ShouldReturnTheSameArray() {
		int[] nums = new int[]{1, 2, 3, 4};
		solution.moveZeroes(nums);
		int[] expected = new int[]{1, 2, 3, 4};
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthFourArray_AllZeroes_ShouldReturnTheSameArray() {
		int[] nums = new int[]{0, 0, 0, 0};
		solution.moveZeroes(nums);
		int[] expected = new int[]{0, 0, 0, 0};
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthFourArray_FirstElementZero_ShouldSuccess() {
		int[] nums = new int[]{0, 1, 2, 3};
		solution.moveZeroes(nums);
		int[] expected = new int[]{1, 2, 3, 0};
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthFourArray_FirstTwoElementsZero_ShouldSuccess() {
		int[] nums = new int[]{0, 0, 2, 3};
		solution.moveZeroes(nums);
		int[] expected = new int[]{2, 3, 0, 0};
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthFourArray_FirstAndMiddleElementsZero_ShouldSuccess() {
		int[] nums = new int[]{0, 1, 0, 2};
		solution.moveZeroes(nums);
		int[] expected = new int[]{1, 2, 0, 0};
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthThreeArray_FirstMiddleElementZero_ShouldSuccess() {
		int[] nums = new int[]{1, 0, 2, 3};
		solution.moveZeroes(nums);
		int[] expected = new int[]{1, 2, 3, 0};
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthThreeArray_SecondMiddleElementZero_ShouldSuccess() {
		int[] nums = new int[]{1, 2, 0, 3};
		solution.moveZeroes(nums);
		int[] expected = new int[]{1, 2, 3, 0};
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthThreeArray_AllMiddleElementsZero_ShouldSuccess() {
		int[] nums = new int[]{1, 0, 0, 2};
		solution.moveZeroes(nums);
		int[] expected = new int[]{1, 2, 0, 0};
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthFourArray_LastElementZero_ShouldReturnTheSameArray() {
		int[] nums = new int[]{1, 2, 3, 0};
		solution.moveZeroes(nums);
		int[] expected = new int[]{1, 2, 3, 0};
		assertArrayEquals(expected, nums);
	}

	@Test
	public void test_MoveZeroes_LengthFiveArray_FirstAndThirdElementsZero_ShouldReturnTheSameArray() {
		int[] nums = new int[]{0, 1, 0, 3, 12};
		solution.moveZeroes(nums);
		int[] expected = new int[]{1, 3, 12, 0, 0};
		assertArrayEquals(expected, nums);
	}
}