package p0066;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlusOneTest {

	PlusOne solution;

	@BeforeEach
	void setUp() {
		solution = new PlusOne();
	}

	@Test
	public void test_PlusOne_0_ShouldReturn1() {
		int[] digits = {0};
		int[] actual = solution.plusOne(digits);
		int[] expected = {1};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_PlusOne_9_ShouldReturn10() {
		int[] digits = {9};
		int[] actual = solution.plusOne(digits);
		int[] expected = {1, 0};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_PlusOne_10_ShouldReturn11() {
		int[] digits = {1, 0};
		int[] actual = solution.plusOne(digits);
		int[] expected = {1, 1};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_PlusOne_99_ShouldReturn100() {
		int[] digits = {9, 9};
		int[] actual = solution.plusOne(digits);
		int[] expected = {1, 0, 0};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_PlusOne_123_ShouldReturn124() {
		int[] digits = {1, 2, 3};
		int[] actual = solution.plusOne(digits);
		int[] expected = {1, 2, 4};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_PlusOne_4321_ShouldReturn4322() {
		int[] digits = {4, 3, 2, 1};
		int[] actual = solution.plusOne(digits);
		int[] expected = {4, 3, 2, 2};
		assertArrayEquals(expected, actual);
	}
}