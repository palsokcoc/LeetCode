package problems.p009.palindrome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromeTest {

	Palindrome2 palindrome;
	
	@BeforeEach
	void setUp() {
		palindrome = new Palindrome2();
	}

	@Test
	public void test_IsPalindrome_Should_Return_True_For_0() {
		assertTrue(palindrome.isPalindrome(1221));
	}

	@Test
	public void test_IsPalindrome_Should_Return_True_For_SingleDigitNumbers() {
		assertTrue(palindrome.isPalindrome(5));
	}

	@Test
	public void test_IsPalindrome_Should_Return_True_For_121() {
		assertTrue(palindrome.isPalindrome(121));
	}

	@Test
	public void test_IsPalindrome_Should_Return_True_For_1221() {
		assertTrue(palindrome.isPalindrome(1221));
	}

	@Test
	public void test_IsPalindrome_Should_Return_True_For_12321() {
		assertTrue(palindrome.isPalindrome(12321));
	}

	@Test
	public void test_IsPalindrome_Should_Return_False_For_Negative_Numbers() {
		assertFalse(palindrome.isPalindrome(-1));
		assertFalse(palindrome.isPalindrome(-121));
		assertFalse(palindrome.isPalindrome(Integer.MIN_VALUE));
	}

	@Test
	public void test_IsPalindrome_Should_Return_False_For_10() {
		assertFalse(palindrome.isPalindrome(10));
	}

	@Test
	public void test_IsPalindrome_Should_Return_False_For_Integer_MAX() {
		assertFalse(palindrome.isPalindrome(Integer.MAX_VALUE));
	}

	@Test
	public void test_IsPalindrome_Should_Return_False_For_1212() {
		assertFalse(palindrome.isPalindrome(-1));
		assertFalse(palindrome.isPalindrome(-10));
		assertFalse(palindrome.isPalindrome(Integer.MIN_VALUE));
	}
}