package p0119;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PascalsTriangleIITest {

	PascalsTriangleII solution;

	@BeforeEach
	void setUp() {
		solution = new PascalsTriangleII();
	}

	@Test
	public void test_GetRow_0() {
		List<Integer> actual = solution.getRow(0);
		List<Integer> expected = List.of(1);
		assertEquals(expected, actual);
	}

	@Test
	public void test_GetRow_1() {
		List<Integer> actual = solution.getRow(1);
		List<Integer> expected = List.of(1, 1);
		assertEquals(expected, actual);
	}

	@Test
	public void test_GetRow_2() {
		List<Integer> actual = solution.getRow(2);
		List<Integer> expected = List.of(1, 2, 1);
		assertEquals(expected, actual);
	}

	@Test
	public void test_GetRow_3() {
		List<Integer> actual = solution.getRow(3);
		List<Integer> expected = List.of(1, 3, 3, 1);
		assertEquals(expected, actual);
	}

	@Test
	public void test_GetRow_4() {
		List<Integer> actual = solution.getRow(4);
		List<Integer> expected = List.of(1, 4, 6, 4, 1);
		assertEquals(expected, actual);
	}

	@Test
	public void test_GetRow_5() {
		List<Integer> actual = solution.getRow(5);
		List<Integer> expected = List.of(1, 5, 10, 10, 5, 1);
		assertEquals(expected, actual);
	}

	@Test
	public void test_GetRow_6() {
		List<Integer> actual = solution.getRow(6);
		List<Integer> expected = List.of(1, 6, 15, 20, 15, 6, 1);
		assertEquals(expected, actual);
	}

	@Test
	public void test_GetRow_7() {
		List<Integer> actual = solution.getRow(7);
		List<Integer> expected = List.of(1, 7, 21, 35, 35, 21, 7, 1);
		assertEquals(expected, actual);
	}

	@Test
	public void test_GetRow_8() {
		List<Integer> actual = solution.getRow(8);
		List<Integer> expected = List.of(1, 8, 28, 56, 70, 56, 28, 8, 1);
		assertEquals(expected, actual);
	}

	@Test
	public void test_GetRow_33() {
		List<Integer> actual = solution.getRow(33);
		List<Integer> expected = List.of(1, 33, 528, 5456, 40920, 237336, 1107568, 4272048, 13884156, 38567100, 92561040, 193536720, 354817320, 573166440, 818809200, 1037158320, 1166803110, 1166803110, 1037158320, 818809200, 573166440, 354817320, 193536720, 92561040, 38567100, 13884156, 4272048, 1107568, 237336, 40920, 5456, 528, 33, 1);
		assertEquals(expected, actual);
	}
}