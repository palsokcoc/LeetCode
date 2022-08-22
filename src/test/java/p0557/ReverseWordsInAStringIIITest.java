package p0557;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseWordsInAStringIIITest {

	ReverseWordsInAStringIII solution;

	@BeforeEach
	void setUp() {
		solution = new ReverseWordsInAStringIII();
	}

	@Test
	public void test_ReverseWords_EmptyString_ShouldReturnEmptyString() {
		String actual = solution.reverseWords("");
		String expected = "";
		assertEquals(expected, actual);
	}

	@Test
	public void test_ReverseWords_StringWithOneWord_ShouldSuccess() {
		String actual = solution.reverseWords("One");
		String expected = "enO";
		assertEquals(expected, actual);
	}

	@Test
	public void test_ReverseWords_StringWithTwoWords_ShouldSuccess() {
		String actual = solution.reverseWords("One Two");
		String expected = "enO owT";
		assertEquals(expected, actual);
	}

	@Test
	public void test_ReverseWords_StringWithThreeWords_ShouldSuccess() {
		String actual = solution.reverseWords("One Two Three");
		String expected = "enO owT eerhT";
		assertEquals(expected, actual);
	}

	@Test
	public void test_ReverseWords_StringWithFourWords_ShouldSuccess() {
		String actual = solution.reverseWords("Let's take LeetCode contest");
		String expected = "s'teL ekat edoCteeL tsetnoc";
		assertEquals(expected, actual);
	}
}