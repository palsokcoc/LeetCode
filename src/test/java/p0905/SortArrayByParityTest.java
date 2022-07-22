package p0905;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SortArrayByParityTest {

	SortArrayByParity solution;

	@BeforeEach
	void setUp() {
		solution = new SortArrayByParity();
	}

	@Test
	public void test_SortArrayByParity_EmptyArray_ShouldReturnEmptyArray() {
		int[] nums = new int[0];
		assertArrayIsSortedByParity(solution.sortArrayByParity(nums));
	}

	@Test
	public void test_SortArrayByParity_LengthOneArray_Even_ShouldReturnTheSameArray() {
		int[] nums = new int[]{2};
		assertArrayIsSortedByParity(solution.sortArrayByParity(nums));
	}

	@Test
	public void test_SortArrayByParity_LengthOneArray_Odd_ShouldReturnTheSameArray() {
		int[] nums = new int[]{1};
		assertArrayIsSortedByParity(solution.sortArrayByParity(nums));
	}

	@Test
	public void test_SortArrayByParity_LengthTwoArray_AllEven_ShouldReturnTheSameArray() {
		int[] nums = new int[]{2, 2};
		assertArrayIsSortedByParity(solution.sortArrayByParity(nums));
	}

	@Test
	public void test_SortArrayByParity_LengthTwoArray_AllOdd_ShouldReturnTheSameArray() {
		int[] nums = new int[]{1, 1};
		assertArrayIsSortedByParity(solution.sortArrayByParity(nums));
	}

	@Test
	public void test_SortArrayByParity_LengthTwoArray_FirstElementOdd_ShouldReturnTheReverseArray() {
		int[] nums = new int[]{1, 2};
		assertArrayIsSortedByParity(solution.sortArrayByParity(nums));
	}

	@Test
	public void test_SortArrayByParity_LengthTwoArray_FirstElementEven_ShouldReturnTheSameArray() {
		int[] nums = new int[]{2, 1};
		assertArrayIsSortedByParity(solution.sortArrayByParity(nums));
	}

	@Test
	public void test_SortArrayByParity_LengthThreeArray_AllEven_ShouldReturnTheSameArray() {
		int[] nums = new int[]{2, 4, 2};
		assertArrayIsSortedByParity(solution.sortArrayByParity(nums));
	}

	@Test
	public void test_SortArrayByParity_LengthThreeArray_AllOdd_ShouldReturnTheSameArray() {
		int[] nums = new int[]{1, 3, 5};
		assertArrayIsSortedByParity(solution.sortArrayByParity(nums));
	}

	@Test
	public void test_SortArrayByParity_LengthThreeArray_FirstElementEven_ShouldReturnTheSameArray() {
		int[] nums = new int[]{4, 1, 3};
		assertArrayIsSortedByParity(solution.sortArrayByParity(nums));
	}

	@Test
	public void test_SortArrayByParity_LengthThreeArray_FirstAndSecondElementEven_ShouldReturnTheSameArray() {
		int[] nums = new int[]{4, 2, 5};
		assertArrayIsSortedByParity(solution.sortArrayByParity(nums));
	}

	@Test
	public void test_SortArrayByParity_LengthThreeArray_FirstAndThirdElementEven_ShouldSuccess() {
		int[] nums = new int[]{4, 3, 2};
		assertArrayIsSortedByParity(solution.sortArrayByParity(nums));
	}

	@Test
	public void test_SortArrayByParity_LengthThreeArray_SecondAndThirdElementEven_ShouldSuccess() {
		int[] nums = new int[]{3, 4, 2};
		assertArrayIsSortedByParity(solution.sortArrayByParity(nums));
	}

	@Test
	public void test_SortArrayByParity_LengthFourArray_ThirdAndFourthElementEven_ShouldSuccess() {
		int[] nums = new int[]{3, 1, 2, 4};
		assertArrayIsSortedByParity(solution.sortArrayByParity(nums));
	}

	private void assertArrayIsSortedByParity(int[] nums) {
		int index = 0;
		while(index < nums.length && nums[index] % 2 == 0) {
			index++;
		}

		while(index < nums.length && nums[index] % 2 == 1) {
			index++;
		}

		assertEquals(nums.length, index);
	}
}