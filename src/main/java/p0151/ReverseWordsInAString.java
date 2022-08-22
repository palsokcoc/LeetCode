package p0151;

// Uses O(n) extra space
// Time:	O(n),	2 ms,		99.95%
// Space:	O(n),	42.0 MB,	98.62%
public class ReverseWordsInAString {
	public String reverseWords(String s) {
		StringBuilder sb = new StringBuilder(s.length());

		int right = s.length() - 1;
		int wordLength;
		// Start from the end of the string move left
		while (right >= 0) {
			wordLength = 0;

			// Skip blanks
			while (right >= 0 && s.charAt(right) == ' ') {
				right--;
			}

			// Find the length of the word
			while (right >= wordLength && s.charAt(right - wordLength) != ' ') {
				wordLength++;
			}

			// Copy the word to the result
			for (int j = wordLength - 1; j >= 0; j--) {
				sb.append(s.charAt(right - j));
			}

			// Put a space after the word
			if (wordLength > 0) {
				sb.append(' ');
			}

			right = right - wordLength;
		}

		if(sb.length() > 1) {
			// Discard the extra space after the last word
			return sb.substring(0, sb.length()-1);
		} else {
			return  sb.toString();
		}
	}
}
