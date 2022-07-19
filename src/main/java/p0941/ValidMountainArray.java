package p0941;

// Time:	O(n),	2 ms,		75.05%
// Space:	O(1),	54.6 MB,	20.12%
public class ValidMountainArray {

	public boolean validMountainArray(int[] arr) {
		if (arr.length < 2) {
			return false;
		}

		// Ascending
		int i = 1;
		while (i < arr.length && arr[i] > arr[i - 1]) {
			i++;
		}

		// Peak cannot be the first or last element
		if (i==1 || i==arr.length) {
			return false;
		}

		// Descending
		while (i < arr.length && arr[i] < arr[i - 1]) {
			i++;
		}

		return i==arr.length;
	}
}
