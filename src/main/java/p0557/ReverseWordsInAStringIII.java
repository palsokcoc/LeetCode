package p0557;

// Time:	O(n),	5 ms,		94.01%
// Space:	O(1),	48.9 MB,	78.31%
public class ReverseWordsInAStringIII {
	public String reverseWords(String s) {
		char[] chars = s.toCharArray();

		int left = 0;
		int wordLength = 0;

		while (left < chars.length) {
			// Skip spaces
			if (chars[left]==' ') {
				left++;
			}

			// Find word length
			while (left + wordLength < chars.length && chars[left + wordLength]!=' ') {
				wordLength++;
			}

			// Reverse word
			reverseWord(chars, left, wordLength);

			left += wordLength;
			wordLength = 0;
		}

		return String.valueOf(chars);
	}

	private void reverseWord(char[] chars, int offset, int length) {
		int left = offset;
		int right = offset + length - 1;
		char temp;
		while (left < right) {
			temp = chars[left];
			chars[left++] = chars[right];
			chars[right--] = temp;
		}
	}
}
