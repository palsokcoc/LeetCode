package p1342;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberOfStepsToReduceANumberToZeroTest {

	NumberOfStepsToReduceANumberToZero2 solution;

	@BeforeEach
	void setUp() {
		solution = new NumberOfStepsToReduceANumberToZero2();
	}

	@Test
	public void test_NumberOfSteps_num0() {
		final int actual = solution.numberOfSteps(0);
		final int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_NumberOfSteps_num8() {
		final int actual = solution.numberOfSteps(8);
		final int expected = 4;
		assertEquals(expected, actual);
	}

	@Test
	public void test_NumberOfSteps_num14() {
		final int actual = solution.numberOfSteps(14);
		final int expected = 6;
		assertEquals(expected, actual);
	}

	@Test
	public void test_NumberOfSteps_num123() {
		final int actual = solution.numberOfSteps(123);
		final int expected = 12;
		assertEquals(expected, actual);
	}
}