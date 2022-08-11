package p0747;

// Time:	O(n),	0 ms,		100%
// Space:	O(1),	41.6 MB,	78.99%
public class LargestNumberAtLeastTwiceOfOthers {
	public int dominantIndex(int[] nums) {
		int max1 = 0;
		int max2 = 0;
		int index = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max1) {
				index = i;
				max2 = max1;
				max1 = nums[i];
			} else if (nums[i] > max2) {
				max2 = nums[i];
			}
		}

		if (max1 >= 2 * max2) {
			return index;
		} else {
			return -1;
		}
	}
}
