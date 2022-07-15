package p0485;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxConsecutiveOnesTest {

	MaxConsecutiveOnes solution;

	@BeforeEach
	void setUp() {
		solution = new MaxConsecutiveOnes();
	}

	@Test
	public void test_FindMaxConsecutiveOnes_AllZeroes() {
		int[] nums = new int[]{0, 0, 0, 0, 0, 0};
		int actual = solution.findMaxConsecutiveOnes(nums);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_FindMaxConsecutiveOnes_AllOnes() {
		int[] nums = new int[]{1, 1, 1, 1, 1, 1};
		int actual = solution.findMaxConsecutiveOnes(nums);
		int expected = 6;
		assertEquals(expected, actual);
	}

	@Test
	public void test_FindMaxConsecutiveOnes_Mixed1() {
		int[] nums = new int[]{1, 1, 0, 1, 1, 1};
		int actual = solution.findMaxConsecutiveOnes(nums);
		int expected = 3;
		assertEquals(expected, actual);
	}

	@Test
	public void test_FindMaxConsecutiveOnes_Mixed2() {
		int[] nums = new int[]{1, 0, 1, 1, 0, 1};
		int actual = solution.findMaxConsecutiveOnes(nums);
		int expected = 2;
		assertEquals(expected, actual);
	}
}