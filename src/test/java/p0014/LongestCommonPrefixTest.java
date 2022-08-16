package p0014;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

	LongestCommonPrefix solution;

	@BeforeEach
	void setUp() {
		solution = new LongestCommonPrefix();
	}

	@Test
	public void test_LongestCommonPrefix_SingleEmptyString_ShouldReturnEmptyString() {
		String[] strs = {""};
		String actual = solution.longestCommonPrefix(strs);
		String expected = "";
		assertEquals(expected, actual);
	}

	@Test
	public void test_LongestCommonPrefix_SingleLengthOneString_ShouldReturnTheString() {
		String[] strs = {"a"};
		String actual = solution.longestCommonPrefix(strs);
		String expected = "a";
		assertEquals(expected, actual);
	}

	@Test
	public void test_LongestCommonPrefix_SingleLengthTwoString_ShouldReturnTheString() {
		String[] strs = {"ab"};
		String actual = solution.longestCommonPrefix(strs);
		String expected = "ab";
		assertEquals(expected, actual);
	}

	@Test
	public void test_LongestCommonPrefix_MultipleStringsWithEmptyString_ShouldReturnEmptyString() {
		String[] strs = {"a", "b", ""};
		String actual = solution.longestCommonPrefix(strs);
		String expected = "";
		assertEquals(expected, actual);
	}

	@Test
	public void test_LongestCommonPrefix_MultipleStringsWithoutLCS_ShouldReturnEmptyString() {
		String[] strs = {"aa", "bb", "cc"};
		String actual = solution.longestCommonPrefix(strs);
		String expected = "";
		assertEquals(expected, actual);
	}

	@Test
	public void test_LongestCommonPrefix_MultipleStringsSomeOfWhichHasLCS_ShouldReturnEmptyString() {
		String[] strs = {"aa", "ab", "cc", "ad"};
		String actual = solution.longestCommonPrefix(strs);
		String expected = "";
		assertEquals(expected, actual);
	}

	@Test
	public void test_LongestCommonPrefix_MultipleStringsWithLengthOneLCS_ShouldSuccess() {
		String[] strs = {"aa", "ab", "ac", "ad"};
		String actual = solution.longestCommonPrefix(strs);
		String expected = "a";
		assertEquals(expected, actual);
	}

	@Test
	public void test_LongestCommonPrefix_MultipleStringsWithLengthTwoLCS_ShouldSuccess() {
		String[] strs = {"flower", "flow", "flight"};
		String actual = solution.longestCommonPrefix(strs);
		String expected = "fl";
		assertEquals(expected, actual);
	}

	@Test
	public void test_LongestCommonPrefix_AllStringsSame_ShouldSuccess() {
		String[] strs = {"flower", "flower", "flower", "flower"};
		String actual = solution.longestCommonPrefix(strs);
		String expected = "flower";
		assertEquals(expected, actual);
	}
}