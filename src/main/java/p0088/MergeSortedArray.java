package p0088;

// Time:	O(m+n),	0 ms,		100%
// Space:	O(1),	43.1 MB,	29.70%
public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m - 1;
		int p2 = n - 1;
		int index = nums1.length - 1;

		// Both p1 and p2 starts from the last non-empty element and moves backwards.
		// index starts from the end of the output array and is used to fill the array from right to left
		// At each iteration, the values pointed by p1 and p2 are compared and the larger one is moved to the cell pointed by index and the corresponding pointer is decreased.
		// If p2 < 0, then the second array is finished and all elements of the second array are copied. The first array is already in non-decreasing order.
		// Therefore, the loop is finished when p2 becomes less than zero which means the processing of the second array is finished completely.
		while (p2 >= 0) {
			if (p1 >= 0 && nums1[p1] > nums2[p2]) {
				nums1[index] = nums1[p1];
				p1--;
			} else {
				nums1[index] = nums2[p2];
				p2--;
			}
			index--;
		}
	}
}
