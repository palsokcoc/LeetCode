package p1346;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckIfNAndItsDoubleExistTest {
	CheckIfNAndItsDoubleExist solution;

	@BeforeEach
	void setUp() {
		solution = new CheckIfNAndItsDoubleExist();
	}

	@Test
	public void test_CheckIfExist_EmptyArray_ShouldReturnFalse() {
		int[] arr = new int[0];
		assertFalse(solution.checkIfExist(arr));
	}

	@Test
	public void test_CheckIfExist_SingleElementArray_ShouldReturnFalse() {
		int[] arr = new int[]{1};
		assertFalse(solution.checkIfExist(arr));
	}

	@Test
	public void test_CheckIfExist_DoubleElementArray_ShouldReturnTrue() {
		int[] arr = new int[]{1, 2};
		assertTrue(solution.checkIfExist(arr));
	}

	@Test
	public void test_CheckIfExist_DoubleElementArray_Exists_ShouldReturnTrue() {
		int[] arr = new int[]{1, 2};
		assertTrue(solution.checkIfExist(arr));
	}

	@Test
	public void test_CheckIfExist_DoubleElementArray_NotExists_ShouldReturnFalse() {
		int[] arr = new int[]{1, 3};
		assertFalse(solution.checkIfExist(arr));
	}

	@Test
	public void test_CheckIfExist_TripleElementArray_ExistsAtTheBeginning_ShouldReturnTrue() {
		int[] arr = new int[]{1, 2, 3};
		assertTrue(solution.checkIfExist(arr));
	}

	@Test
	public void test_CheckIfExist_TripleElementArray_ExistsAtTheEnd_ShouldReturnTrue() {
		int[] arr = new int[]{1, 3, 2};
		assertTrue(solution.checkIfExist(arr));
	}

	@Test
	public void test_CheckIfExist_TripleElementArray_NotExists_ShouldReturnFalse() {
		int[] arr = new int[]{1, 3, 12};
		assertFalse(solution.checkIfExist(arr));
	}

	@Test
	public void test_CheckIfExist_MultipleElementArray_ExistsAtTheBeginning_ShouldReturnTrue() {
		int[] arr = new int[]{1, 2, 3, 4};
		assertTrue(solution.checkIfExist(arr));
	}

	@Test
	public void test_CheckIfExist_MultipleElementArray_ExistsAtTheMiddle_ShouldReturnTrue() {
		int[] arr = new int[]{1, 2, 4, 5};
		assertTrue(solution.checkIfExist(arr));
	}

	@Test
	public void test_CheckIfExist_MultipleElementArray_ExistsAtTheEnd_ShouldReturnTrue() {
		int[] arr = new int[]{1, 2, 3, 6};
		assertTrue(solution.checkIfExist(arr));
	}

	@Test
	public void test_CheckIfExist_MultipleElementArray_NotExists_ShouldReturnFalse() {
		int[] arr = new int[]{1, 3, 12, 13};
		assertFalse(solution.checkIfExist(arr));
	}
}