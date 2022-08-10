package p0724;

// https://leetcode.com/problems/find-pivot-index/discuss/109274/JavaC++-Clean-Code
// Time:	O(n)
// Space:	O(1)
public class FindPivotIndex2 {
	public int pivotIndex(int[] nums) {
		int total = 0;
		for (int num : nums) {
			total += num;
		}

		int leftSum = 0;
		for (int i = 0; i < nums.length; i++) {
			// if i is the pivot, then the left and right sums are equal
			// ==> total = leftSum + nums[i] + rightSum
			// ==> total = 2 * leftSum + nums[i]
			// ==> 2 * leftSum = total - nums[i]
			if (leftSum * 2 == total - nums[i]) {
				return i;
			}
			leftSum += nums[i];
		}

		return -1;
	}
}
