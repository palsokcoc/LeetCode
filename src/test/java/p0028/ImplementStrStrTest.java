package p0028;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImplementStrStrTest {

	ImplementStrStr solution;

	@BeforeEach
	void setUp() {
		solution = new ImplementStrStr();
	}

	@Test
	public void test_StrStr_EmptyHaystack_ShouldReturnMinusOne() {
		String haystack = "";
		String needle = "a";
		int actual = solution.strStr(haystack, needle);
		int expected = -1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_StrStr_EmptyHaystackAndNeedle_ShouldReturnZero() {
		String haystack = "";
		String needle = "";
		int actual = solution.strStr(haystack, needle);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_StrStr_NonEmptyHaystackEmptyNeedle_ShouldReturnZero() {
		String haystack = "a";
		String needle = "";
		int actual = solution.strStr(haystack, needle);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_StrStr_LengthOneSameHaystackAndNeedle_ShouldReturnZero() {
		String haystack = "a";
		String needle = "a";
		int actual = solution.strStr(haystack, needle);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_StrStr_LengthTwoSameHaystackAndNeedle_ShouldReturnZero() {
		String haystack = "ab";
		String needle = "ab";
		int actual = solution.strStr(haystack, needle);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test_StrStr_NoMatch_ShouldReturnMinusOne() {
		String haystack = "abc";
		String needle = "d";
		int actual = solution.strStr(haystack, needle);
		int expected = -1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_StrStr_Hello_ll_ShouldReturnTwo() {
		String haystack = "hello";
		String needle = "ll";
		int actual = solution.strStr(haystack, needle);
		int expected = 2;
		assertEquals(expected, actual);
	}
}