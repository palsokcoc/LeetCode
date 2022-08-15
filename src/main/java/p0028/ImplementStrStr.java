package p0028;

// Brute force O(m*n) solution
// Look For https://en.wikipedia.org/wiki/Knuth%E2%80%93Morris%E2%80%93Pratt_algorithm
// for a faster solution with extra space. (TC: O(m+n) and SC: O(n))
// Time:	O(m*n),	0 ms,		100%
// Space:	O(1),	40.0 MB,	96.77%
public class ImplementStrStr {
	public int strStr(String haystack, String needle) {
		if (needle.isEmpty()) {
			return 0;
		}

		int m = haystack.length();
		int n = needle.length();
		int j;

		for (int i = 0; i <= m - n; i++) {
			j = 0;
			while (j < n && haystack.charAt(i + j) == needle.charAt(j)) {
				j++;
			}
			if (j == n) {
				return i;
			}
		}

		return -1;
	}
}
