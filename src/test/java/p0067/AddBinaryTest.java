package p0067;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddBinaryTest {

	AddBinary solution;

	@BeforeEach
	void setUp() {
		solution = new AddBinary();
	}

	@Test
	public void testAddBinary_0_Plus_0() {
		String actual = solution.addBinary("0", "0");
		String expected = "0";
		assertEquals(expected, actual);
	}

	@Test
	public void testAddBinary_0_Plus_1() {
		String actual = solution.addBinary("0", "1");
		String expected = "1";
		assertEquals(expected, actual);
	}

	@Test
	public void testAddBinary_1_Plus_0() {
		String actual = solution.addBinary("1", "0");
		String expected = "1";
		assertEquals(expected, actual);
	}

	@Test
	public void testAddBinary_1_Plus_1() {
		String actual = solution.addBinary("1", "1");
		String expected = "10";
		assertEquals(expected, actual);
	}

	@Test
	public void testAddBinary_11_Plus_0() {
		String actual = solution.addBinary("11", "0");
		String expected = "11";
		assertEquals(expected, actual);
	}

	@Test
	public void testAddBinary_11_Plus_1() {
		String actual = solution.addBinary("11", "1");
		String expected = "100";
		assertEquals(expected, actual);
	}

	@Test
	public void testAddBinary_1_Plus_11() {
		String actual = solution.addBinary("1", "11");
		String expected = "100";
		assertEquals(expected, actual);
	}

	@Test
	public void testAddBinary_1010_Plus_1011() {
		String actual = solution.addBinary("1010", "1011");
		String expected = "10101";
		assertEquals(expected, actual);
	}
}