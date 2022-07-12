package problems.p009.palindrome;

public class Palindrome2 {
	public boolean isPalindrome(int x) {
		// Negative numbers and numbers endign with 0 except 0 are not palindromes
		if(x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}

		// Check if the reverted second half is equal to the first half
		// Example: 1221 (Length is even)
		// Round 1: firstHalf=122, revertedSecondHalf=1
		// Round 2: firstHalf=12, revertedSecondHalf=12
		// Example: 12321 (Length is odd)
		// Round 1: firstHalf=1232, revertedSecondHalf=1
		// Round 2: firstHalf=123, revertedSecondHalf=12
		// Round 3: firstHalf=12, revertedSecondHalf=123
		int revertedSecondHalf = 0;
		int firstHalf = x;
		while (firstHalf > revertedSecondHalf) {
			revertedSecondHalf = (revertedSecondHalf * 10) + (firstHalf % 10);
			firstHalf = firstHalf / 10;
		}


		// 1221  => firstHalf=12, revertedSecondHalf=12
		// 12321 => firstHalf=12, revertedSecondHalf=123
		return (revertedSecondHalf == firstHalf) || ((revertedSecondHalf / 10) == firstHalf);
	}
}