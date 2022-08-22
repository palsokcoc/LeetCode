package p0151;

// In-Place
// Time:	O(n),	2 ms,		99.95%
// Space:	O(1),	42.0 MB,	98.62%
public class ReverseWordsInAString2 {
	public String reverseWords(String s) {
		char[] chars = s.toCharArray();
		int length;

		// Remove leading spaces, trailing spaces and extra spaces between words
		int slow = 0;
		boolean copySpace = false;
		for (int fast = 0; fast < chars.length; fast++) {
			if(chars[fast] != ' ') {
				chars[slow++] = chars[fast];
				copySpace = true;
			} else if(copySpace){
				chars[slow++] = chars[fast];
				copySpace = false;
			}
		}

		// Now slow gives the new length
		if(slow == 0 || chars[slow-1] != ' ') {
			length = slow;
		} else {
			length = slow - 1;
		}

		// Reverse the array
		char temp;
		for (int i = 0; i < length / 2; i++) {
			temp = chars[i];
			chars[i] = chars[length-1-i];
			chars[length-1-i] = temp;
		}

		// Reverse each word
		int left = 0;
		int wordLength = 0;
		while(left < length) {
			// Skip spaces
			while(left < length && chars[left] == ' ') {
				left++;
			}

			// Find word length
			while(left+wordLength < length && chars[left+wordLength] != ' ') {
				wordLength++;
			}

			// Reverse the word
			for (int i = 0; i < wordLength / 2; i++) {
				temp = chars[left+i];
				chars[left+i] = chars[left+wordLength-1-i];
				chars[left+wordLength-1-i] = temp;
			}

			left += wordLength;
			wordLength = 0;
		}

		return String.valueOf(chars, 0, length);
	}
}
