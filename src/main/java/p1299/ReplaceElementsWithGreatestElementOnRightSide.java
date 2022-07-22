package p1299;

// Time:	O(n),	1 ms,		100%
// Space:	O(1),	44.5 MB,	87.84%
public class ReplaceElementsWithGreatestElementOnRightSide {

	public int[] replaceElements(int[] arr) {
		int initial;
		int largestSoFar = -1;

		for (int i = arr.length - 1; i >= 0; i--) {
			initial = arr[i];
			arr[i] = largestSoFar;
			largestSoFar = Math.max(largestSoFar, initial);
		}

		return arr;
	}
}
