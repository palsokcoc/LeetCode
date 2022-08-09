package p0448;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindAllNumbersDisappearedInAnArrayTest {

	FindAllNumbersDisappearedInAnArray2 solution;

	@BeforeEach
	void setUp() {
		solution = new FindAllNumbersDisappearedInAnArray2();
	}

	@Test
	public void test_FindDisappearedNumbers_n2_AllOnes_ShouldSuccess() {
		int[] nums = new int[]{1, 1};
		List<Integer> actual = solution.findDisappearedNumbers(nums);
		List<Integer> expected = Arrays.asList(2);
		assertEquals(expected, actual);
	}

	@Test
	public void test_FindDisappearedNumbers_n2_AllTwos_ShouldSuccess() {
		int[] nums = new int[]{2, 2};
		List<Integer> actual = solution.findDisappearedNumbers(nums);
		List<Integer> expected = Arrays.asList(1);
		assertEquals(expected, actual);
	}

	@Test
	public void test_FindDisappearedNumbers_n8() {
		int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
		List<Integer> actual = solution.findDisappearedNumbers(nums);
		List<Integer> expected = Arrays.asList(5, 6);
		assertEquals(expected, actual);
	}
}