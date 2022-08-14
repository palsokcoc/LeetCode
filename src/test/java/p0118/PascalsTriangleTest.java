package p0118;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PascalsTriangleTest {

	PascalsTriangle solution;

	@BeforeEach
	void setUp() {
		solution = new PascalsTriangle();
	}

	@Test
	public void test_Generate_1() {
		List<List<Integer>> actual = solution.generate(1);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(1));
		assertEquals(expected, actual);
	}

	@Test
	public void test_Generate_2() {
		List<List<Integer>> actual = solution.generate(2);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1));
		assertEquals(expected, actual);
	}

	@Test
	public void test_Generate_3() {
		List<List<Integer>> actual = solution.generate(3);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1), Arrays.asList(1, 2, 1));
		assertEquals(expected, actual);
	}

	@Test
	public void test_Generate_4() {
		List<List<Integer>> actual = solution.generate(4);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1), Arrays.asList(1, 2, 1), Arrays.asList(1, 3, 3, 1));
		assertEquals(expected, actual);
	}

	@Test
	public void test_Generate_5() {
		List<List<Integer>> actual = solution.generate(5);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1), Arrays.asList(1, 2, 1), Arrays.asList(1, 3, 3, 1), Arrays.asList(1, 4, 6, 4, 1));
		assertEquals(expected, actual);
	}
}