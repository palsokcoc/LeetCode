package p0344;

// Time:	O(n),	1 ms,		99.91%
// Space:	O(1),	54.2 MB,	75.25%
public class ReverseString {
	public void reverseString(char[] s) {
		int left = 0;
		int right = s.length - 1;
		char temp;
		while(left < right) {
			temp = s[left];
			s[left++] = s[right];
			s[right--] = temp;
		}
	}
}
