package p0498;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiagonalTraverseTest {

	DiagonalTraverse solution;

	@BeforeEach
	void setUp() {
		solution = new DiagonalTraverse();
	}

	@Test
	public void test_FindDiagonalOrder_1By1Array_ShouldReturnTheSameArray() {
		int[][] mat = {{5}};
		int[] actual = solution.findDiagonalOrder(mat);
		int[] expected = {5};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_FindDiagonalOrder_1By2Array_ShouldSuccess() {
		int[][] mat = {{1, 2}};
		int[] actual = solution.findDiagonalOrder(mat);
		int[] expected = {1, 2};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_FindDiagonalOrder_2By1Array_ShouldSuccess() {
		int[][] mat = {{1}, {2}};
		int[] actual = solution.findDiagonalOrder(mat);
		int[] expected = {1, 2};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_FindDiagonalOrder_1By3Array_ShouldSuccess() {
		int[][] mat = {{1, 2, 3}};
		int[] actual = solution.findDiagonalOrder(mat);
		int[] expected = {1, 2, 3};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_FindDiagonalOrder_3By1Array_ShouldSuccess() {
		int[][] mat = {{1}, {2}, {3}};
		int[] actual = solution.findDiagonalOrder(mat);
		int[] expected = {1, 2, 3};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_FindDiagonalOrder_2By2Array_ShouldSuccess() {
		int[][] mat = {{1, 2}, {3, 4}};
		int[] actual = solution.findDiagonalOrder(mat);
		int[] expected = {1, 2, 3, 4};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_FindDiagonalOrder_2By3Array_ShouldSuccess() {
		int[][] mat = {{1, 2, 3}, {4, 5, 6}};
		int[] actual = solution.findDiagonalOrder(mat);
		int[] expected = {1, 2, 4, 5, 3, 6};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_FindDiagonalOrder_2By4Array_ShouldSuccess() {
		int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}};
		int[] actual = solution.findDiagonalOrder(mat);
		int[] expected = {1, 2, 5, 6, 3, 4, 7, 8};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_FindDiagonalOrder_4By2Array_ShouldSuccess() {
		int[][] mat = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
		int[] actual = solution.findDiagonalOrder(mat);
		int[] expected = {1, 2, 3, 5, 4, 6, 7, 8};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_FindDiagonalOrder_3By3Array_ShouldSuccess() {
		int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[] actual = solution.findDiagonalOrder(mat);
		int[] expected = {1, 2, 4, 7, 5, 3, 6, 8, 9};
		assertArrayEquals(expected, actual);
	}
}