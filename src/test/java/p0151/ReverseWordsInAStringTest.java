package p0151;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseWordsInAStringTest {

	ReverseWordsInAString3 solution;

	@BeforeEach
	void setUp() {
		solution = new ReverseWordsInAString3();
	}

	@Test
	public void test_ReverseWords_EmptyString_ShouldReturnEmptyString() {
		String s = "";
		String actual = solution.reverseWords(s);
		String expected = "";
		assertEquals(expected, actual);
	}

	@Test
	public void test_ReverseWords_SingleSpace_ShouldReturnEmptyString() {
		String s = " ";
		String actual = solution.reverseWords(s);
		String expected = "";
		assertEquals(expected, actual);
	}

	@Test
	public void test_ReverseWords_MultipleSpaces_ShouldReturnEmptyString() {
		String s = "   ";
		String actual = solution.reverseWords(s);
		String expected = "";
		assertEquals(expected, actual);
	}

	@Test
	public void test_ReverseWords_WordWithOneLetter_ShouldReturnTheSameString() {
		String s = "a";
		String actual = solution.reverseWords(s);
		String expected = "a";
		assertEquals(expected, actual);
	}

	@Test
	public void test_ReverseWords_SingleWord_ShouldReturnTheSameString() {
		String s = "one";
		String actual = solution.reverseWords(s);
		String expected = "one";
		assertEquals(expected, actual);
	}

	@Test
	public void test_ReverseWords_SingleWordWithLeadingSpaces_ShouldReturnTheString() {
		String s = "   one";
		String actual = solution.reverseWords(s);
		String expected = "one";
		assertEquals(expected, actual);
	}

	@Test
	public void test_ReverseWords_SingleWordWithLeadingAndTrailingSpaces_ShouldReturnTheString() {
		String s = "   one   ";
		String actual = solution.reverseWords(s);
		String expected = "one";
		assertEquals(expected, actual);
	}

	@Test
	public void test_ReverseWords_TwoWordsWithLeadingAndTrailingSpaces_ShouldSuccess() {
		String s = "   one   two   ";
		String actual = solution.reverseWords(s);
		String expected = "two one";
		assertEquals(expected, actual);
	}

	@Test
	public void test_ReverseWords_ThreeWordsWithLeadingAndTrailingSpaces_ShouldSuccess() {
		String s = "   one   two   three  ";
		String actual = solution.reverseWords(s);
		String expected = "three two one";
		assertEquals(expected, actual);
	}

	@Test
	public void test_ReverseWords_FourWordsWithLeadingAndTrailingSpaces_ShouldSuccess() {
		String s = "   one   two   three  four  ";
		String actual = solution.reverseWords(s);
		String expected = "four three two one";
		assertEquals(expected, actual);
	}
}