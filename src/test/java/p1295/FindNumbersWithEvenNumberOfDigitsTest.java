package p1295;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindNumbersWithEvenNumberOfDigitsTest {

	FindNumbersWithEvenNumberOfDigits solution;

	@BeforeEach
	void setUp() {
		solution = new FindNumbersWithEvenNumberOfDigits();
	}

	@Test
	public void test_FindNumbers_EmptyArray_ShouldReturnZero() {
		int[] nums = new int[0];
		int actual = solution.findNumbers(nums);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_FindNumbers_SingleOddElement_ShouldReturnZero() {
		int[] nums = new int[]{123};
		int actual = solution.findNumbers(nums);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_FindNumbers_SingleEvenElement_ShouldReturnOne() {
		int[] nums = new int[]{1234};
		int actual = solution.findNumbers(nums);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_FindNumbers_SingleDigitElement_ShouldReturnZero() {
		int[] nums = new int[]{1};
		int actual = solution.findNumbers(nums);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_FindNumbers_SingleDigitElement_Mixed1() {
		int[] nums = new int[]{12, 345, 2, 6, 7896};
		int actual = solution.findNumbers(nums);
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void test_FindNumbers_SingleDigitElement_Mixed2() {
		int[] nums = new int[]{555, 901, 482, 1771};
		int actual = solution.findNumbers(nums);
		int expected = 1;
		assertEquals(expected, actual);
	}
}