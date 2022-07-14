package p0383;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RansomNoteTest {

	RansomNote1 solution;

	@BeforeEach
	void setUp() {
		solution = new RansomNote1();
	}

	@Test
	public void test_CanConstruct_ShouldFail1() {
		String ransomNote = "a";
		String magazine = "b";
		assertFalse(solution.canConstruct(ransomNote, magazine));
	}

	@Test
	public void test_CanConstruct_ShouldFail2() {
		String ransomNote = "aa";
		String magazine = "ab";
		assertFalse(solution.canConstruct(ransomNote, magazine));
	}

	@Test
	public void test_CanConstruct_ShouldSucceed() {
		String ransomNote = "aa";
		String magazine = "aab";
		assertTrue(solution.canConstruct(ransomNote, magazine));
	}
}