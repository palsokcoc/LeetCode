package p0941;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidMountainArrayTest {

	ValidMountainArray solution;

	@BeforeEach
	void setUp() {
		solution = new ValidMountainArray();
	}

	@Test
	public void test_ValidMountainArray_EmptyArray_ShouldReturnFalse() {
		int[] arr = new int[0];
		assertFalse(solution.validMountainArray(arr));
	}

	@Test
	public void test_ValidMountainArray_LengthOneArray_ShouldReturnFalse() {
		int[] arr = new int[]{1};
		assertFalse(solution.validMountainArray(arr));
	}

	@Test
	public void test_ValidMountainArray_LengthTwoArray_ShouldReturnFalse() {
		int[] arr = new int[]{1, 2};
		assertFalse(solution.validMountainArray(arr));
	}

	@Test
	public void test_ValidMountainArray_LengthThreeArray_AllSame_ShouldReturnFalse() {
		int[] arr = new int[]{1, 1, 1};
		assertFalse(solution.validMountainArray(arr));
	}

	@Test
	public void test_ValidMountainArray_LengthThreeArray_AllAscending_ShouldReturnFalse() {
		int[] arr = new int[]{1, 2, 3};
		assertFalse(solution.validMountainArray(arr));
	}

	@Test
	public void test_ValidMountainArray_LengthThreeArray_AllDescending_ShouldReturnFalse() {
		int[] arr = new int[]{3, 2, 1};
		assertFalse(solution.validMountainArray(arr));
	}

	@Test
	public void test_ValidMountainArray_LengthThreeArray_ReverseMountain_ShouldReturnFalse() {
		int[] arr = new int[]{3, 1, 2};
		assertFalse(solution.validMountainArray(arr));
	}

	@Test
	public void test_ValidMountainArray_LengthThreeArray_Mountain_ShouldReturnTrue() {
		int[] arr = new int[]{1, 3, 2};
		assertTrue(solution.validMountainArray(arr));
	}

	@Test
	public void test_ValidMountainArray_LengthFourArray_AllSame_ShouldReturnFalse() {
		int[] arr = new int[]{1, 1, 1, 1};
		assertFalse(solution.validMountainArray(arr));
	}

	@Test
	public void test_ValidMountainArray_LengthFourArray_AllAscending_ShouldReturnFalse() {
		int[] arr = new int[]{1, 2, 3, 4};
		assertFalse(solution.validMountainArray(arr));
	}

	@Test
	public void test_ValidMountainArray_LengthFourArray_AllDescending_ShouldReturnFalse() {
		int[] arr = new int[]{4, 3, 2, 1};
		assertFalse(solution.validMountainArray(arr));
	}

	@Test
	public void test_ValidMountainArray_LengthFourArray_ReverseMountain_ShouldReturnFalse() {
		int[] arr = new int[]{4, 3, 1, 2};
		assertFalse(solution.validMountainArray(arr));
	}

	@Test
	public void test_ValidMountainArray_LengthFourArray_Mountain_ShouldReturnTrue() {
		int[] arr = new int[]{1, 3, 4, 2};
		assertTrue(solution.validMountainArray(arr));
	}

	@Test
	public void test_ValidMountainArray_LengthFiveArray_AllSame_ShouldReturnFalse() {
		int[] arr = new int[]{1, 1, 1, 1, 1};
		assertFalse(solution.validMountainArray(arr));
	}

	@Test
	public void test_ValidMountainArray_LengthFiveArray_AllAscending_ShouldReturnFalse() {
		int[] arr = new int[]{1, 2, 3, 4, 5};
		assertFalse(solution.validMountainArray(arr));
	}

	@Test
	public void test_ValidMountainArray_LengthFiveArray_AllDescending_ShouldReturnFalse() {
		int[] arr = new int[]{5, 4, 3, 2, 1};
		assertFalse(solution.validMountainArray(arr));
	}

	@Test
	public void test_ValidMountainArray_LengthFiveArray_ReverseMountain_ShouldReturnFalse() {
		int[] arr = new int[]{4, 3, 1, 2, 5};
		assertFalse(solution.validMountainArray(arr));
	}

	@Test
	public void test_ValidMountainArray_LengthFiveArray_Mountain_ShouldReturnTrue() {
		int[] arr = new int[]{1, 3, 5, 4, 2};
		assertTrue(solution.validMountainArray(arr));
	}
}