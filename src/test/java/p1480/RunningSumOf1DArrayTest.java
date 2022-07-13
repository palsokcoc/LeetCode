package p1480;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RunningSumOf1DArrayTest {

	RunningSumOf1DArray solution;

	@BeforeEach
	void setUp() {
		solution = new RunningSumOf1DArray();
	}

	@Test
	public void test_RunningSum_All_Negative() {
		int[] numbers = new int[]{-1, -2, -3, -4};
		int[] actualRunningSums = solution.runningSum(numbers);
		int[] expectedRunningSums = new int[]{-1, -3, -6, -10};

		Assertions.assertArrayEquals(expectedRunningSums, actualRunningSums);
	}

	@Test
	public void test_RunningSum_All_Positive_Ordered() {
		int[] numbers = new int[]{1, 2, 3, 4};
		int[] actualRunningSums = solution.runningSum(numbers);
		int[] expectedRunningSums = new int[]{1, 3, 6, 10};

		Assertions.assertArrayEquals(expectedRunningSums, actualRunningSums);
	}

	@Test
	public void test_RunningSum_All_Positive_Unordered() {
		int[] numbers = new int[]{3, 1, 2, 10, 1};
		int[] actualRunningSums = solution.runningSum(numbers);
		int[] expectedRunningSums = new int[]{3, 4, 6, 16, 17};

		Assertions.assertArrayEquals(expectedRunningSums, actualRunningSums);
	}

	@Test
	public void test_RunningSum_All_Same() {
		int[] numbers = new int[]{1, 1, 1, 1, 1};
		int[] actualRunningSums = solution.runningSum(numbers);
		int[] expectedRunningSums = new int[]{1, 2, 3, 4, 5};

		Assertions.assertArrayEquals(expectedRunningSums, actualRunningSums);
	}

	@Test
	public void test_RunningSum_Mixed() {
		int[] numbers = new int[]{5, -9, 0, 4, -10};
		int[] actualRunningSums = solution.runningSum(numbers);
		int[] expectedRunningSums = new int[]{5, -4, -4, 0, -10};

		Assertions.assertArrayEquals(expectedRunningSums, actualRunningSums);
	}
}