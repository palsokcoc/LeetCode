package p0344;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

	ReverseString solution;

	@BeforeEach
	void setUp() {
		solution = new ReverseString();
	}

	@Test
	public void test_ReverseString_EmptyString_ShouldReturnEmptyString() {
		char[] s = {};
		solution.reverseString(s);
		char[] expected = {};
		assertArrayEquals(expected, s);
	}

	@Test
	public void test_ReverseString_LengthOneString_ShouldReturnTheSameString() {
		char[] s = {'a'};
		solution.reverseString(s);
		char[] expected = {'a'};
		assertArrayEquals(expected, s);
	}

	@Test
	public void test_ReverseString_LengthTwoString_SameChars_ShouldReturnTheSameString() {
		char[] s = {'a', 'a'};
		solution.reverseString(s);
		char[] expected = {'a', 'a'};
		assertArrayEquals(expected, s);
	}

	@Test
	public void test_ReverseString_LengthTwoString_DifferentChars_ShouldSuccess() {
		char[] s = {'a', 'b'};
		solution.reverseString(s);
		char[] expected = {'b', 'a'};
		assertArrayEquals(expected, s);
	}

	@Test
	public void test_ReverseString_LengthThreeString_SameChars_ShouldReturnTheSameString() {
		char[] s = {'a', 'a', 'a'};
		solution.reverseString(s);
		char[] expected = {'a', 'a', 'a'};
		assertArrayEquals(expected, s);
	}

	@Test
	public void test_ReverseString_LengthThreeString_Palindrome_ShouldReturnTheSameString() {
		char[] s = {'a', 'b', 'a'};
		solution.reverseString(s);
		char[] expected = {'a', 'b', 'a'};
		assertArrayEquals(expected, s);
	}

	@Test
	public void test_ReverseString_LengthThreeString_AllDifferentChars_ShouldSuccess() {
		char[] s = {'a', 'b', 'c'};
		solution.reverseString(s);
		char[] expected = {'c', 'b', 'a'};
		assertArrayEquals(expected, s);
	}

	@Test
	public void test_ReverseString_Hello_ShouldReturn_olleH() {
		char[] s = {'h', 'e', 'l', 'l', 'o'};
		solution.reverseString(s);
		char[] expected = {'o', 'l', 'l', 'e', 'h'};
		assertArrayEquals(expected, s);
	}

	@Test
	public void test_ReverseString_Hannah_ShouldReturn_hannaH() {
		char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
		solution.reverseString(s);
		char[] expected = {'h', 'a', 'n', 'n', 'a', 'H'};
		assertArrayEquals(expected, s);
	}
}