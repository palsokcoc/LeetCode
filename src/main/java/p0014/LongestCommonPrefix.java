package p0014;

// Time:	O(m*n),	1 ms,		89.34%
// Space:	O(1),	40.4 MB,	92.27%
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		String first = strs[0];
		int length = first.length();
		int j;

		for (int i = 1; i < strs.length && length > 0; i++) {
			for (j = 0; j < length && j < strs[i].length() && first.charAt(j) == strs[i].charAt(j); j++) {
				// Nothing
			}

			length = j;
		}

		return first.substring(0, length);
	}
}
