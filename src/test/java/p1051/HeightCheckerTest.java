package p1051;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HeightCheckerTest {

	HeightChecker2 solution;

	@BeforeEach
	void setUp() {
		solution = new HeightChecker2();
	}

	@Test
	public void test_HeightChecker_AllAscending() {
		int[] heights = new int[]{1, 2, 3, 4, 5};
		int actual = solution.heightChecker(heights);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_HeightChecker_AllDescending() {
		int[] heights = new int[]{5, 4, 3, 2, 1};
		int actual = solution.heightChecker(heights);
		int expected = 4;
		assertEquals(expected, actual);
	}

	@Test
	public void test_HeightChecker_LeetCode1() {
		int[] heights = new int[]{1, 1, 4, 2, 1, 3};
		int actual = solution.heightChecker(heights);
		int expected = 3;
		assertEquals(expected, actual);
	}
}