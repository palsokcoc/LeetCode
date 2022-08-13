package p0054;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SpiralMatrixTest {

	SpiralMatrix solution;

	@BeforeEach
	void setUp() {
		solution = new SpiralMatrix();
	}

	@Test
	public void test_spiralOrder_1By1Array_ShouldReturnTheSameArray() {
		int[][] mat = {{5}};
		List<Integer> actual = solution.spiralOrder(mat);
		List<Integer> expected = Arrays.asList(5);
		assertEquals(expected, actual);
	}

	@Test
	public void test_spiralOrder_1By2Array_ShouldSuccess() {
		int[][] mat = {{1, 2}};
		List<Integer> actual = solution.spiralOrder(mat);
		List<Integer> expected = Arrays.asList(1, 2);
		assertEquals(expected, actual);
	}

	@Test
	public void test_spiralOrder_2By1Array_ShouldSuccess() {
		int[][] mat = {{1}, {2}};
		List<Integer> actual = solution.spiralOrder(mat);
		List<Integer> expected = Arrays.asList(1, 2);
		assertEquals(expected, actual);
	}

	@Test
	public void test_spiralOrder_1By3Array_ShouldSuccess() {
		int[][] mat = {{1, 2, 3}};
		List<Integer> actual = solution.spiralOrder(mat);
		List<Integer> expected = Arrays.asList(1, 2, 3);
		assertEquals(expected, actual);
	}

	@Test
	public void test_spiralOrder_3By1Array_ShouldSuccess() {
		int[][] mat = {{1}, {2}, {3}};
		List<Integer> actual = solution.spiralOrder(mat);
		List<Integer> expected = Arrays.asList(1, 2, 3);
		assertEquals(expected, actual);
	}

	@Test
	public void test_spiralOrder_2By2Array_ShouldSuccess() {
		int[][] mat = {{1, 2}, {3, 4}};
		List<Integer> actual = solution.spiralOrder(mat);
		List<Integer> expected = Arrays.asList(1, 2, 4, 3);
		assertEquals(expected, actual);
	}

	@Test
	public void test_spiralOrder_2By3Array_ShouldSuccess() {
		int[][] mat = {{1, 2, 3}, {4, 5, 6}};
		List<Integer> actual = solution.spiralOrder(mat);
		List<Integer> expected = Arrays.asList(1, 2, 3, 6, 5, 4);
		assertEquals(expected, actual);
	}

	@Test
	public void test_spiralOrder_2By4Array_ShouldSuccess() {
		int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}};
		List<Integer> actual = solution.spiralOrder(mat);
		List<Integer> expected = Arrays.asList(1, 2, 3, 4, 8, 7, 6, 5);
		assertEquals(expected, actual);
	}

	@Test
	public void test_spiralOrder_4By2Array_ShouldSuccess() {
		int[][] mat = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
		List<Integer> actual = solution.spiralOrder(mat);
		List<Integer> expected = Arrays.asList(1, 2, 4, 6, 8, 7, 5, 3);
		assertEquals(expected, actual);
	}

	@Test
	public void test_spiralOrder_3By3Array_ShouldSuccess() {
		int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		List<Integer> actual = solution.spiralOrder(mat);
		List<Integer> expected = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
		assertEquals(expected, actual);
	}

	@Test
	public void test_spiralOrder_3By4Array_ShouldSuccess() {
		int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		List<Integer> actual = solution.spiralOrder(mat);
		List<Integer> expected = Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
		assertEquals(expected, actual);
	}
}