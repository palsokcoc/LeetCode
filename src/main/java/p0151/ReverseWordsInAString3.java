package p0151;

// Same in-place algorithm with ReverseWordsInAString2
// Three methods are introduced to make the main method cleaner
// Time:	O(n),	3 ms,		98.83%
// Space:	O(1),	42.7 MB,	88.21%
public class ReverseWordsInAString3 {
	public String reverseWords(String s) {
		char[] chars = s.toCharArray();

		int length = cleanSpaces(chars);
		reverseArray(chars, 0, length);
		reverseWords(chars, length);

		return String.valueOf(chars, 0, length);
	}


	// Remove leading spaces, trailing spaces and extra spaces between words
	// Use two pointers starting from the first element
	// The fast one skips the redundant spaces and copies non-space characters and necessary spaces to the slow pointer
	private int cleanSpaces(char[] chars) {
		int slow = 0;
		boolean spaceNeeded = false;
		for (int fast = 0; fast < chars.length; fast++) {
			if (chars[fast]==' ' && spaceNeeded) {
				chars[slow++] = chars[fast];
				spaceNeeded = false;
			} else if (chars[fast]!=' ') {
				chars[slow++] = chars[fast];
				spaceNeeded = true;
			}
		}

		// If there are trailing spaces in input, then the previous loop adds one extra space at the end.
		// In that case, we need to discard the last character and return slow-1
		if (slow==0 || spaceNeeded) {
			return slow;
		} else {
			return slow - 1;
		}
	}

	private void reverseArray(char[] chars, int offset, int length) {
		int left = offset;
		int right = offset + length - 1;
		char temp;
		while (left < right) {
			temp = chars[left];
			chars[left++] = chars[right];
			chars[right--] = temp;
		}
	}

	private void reverseWords(char[] chars, int length) {
		int left = 0;
		int wordLength = 0;

		while (left < length) {
			// Skip space
			if (chars[left]==' ') {
				left++;
			}

			// Find word length
			while (left + wordLength < length && chars[left + wordLength]!=' ') {
				wordLength++;
			}

			reverseArray(chars, left, wordLength);

			left += wordLength;
			wordLength = 0;
		}
	}
}
