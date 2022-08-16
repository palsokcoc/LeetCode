package p0561;

import java.util.Arrays;

// Time:	O(nlgn),						13 ms,		94.24%
// Space:	Depends on Sort Algorithm,		44.5 MB,	92.05%
// An interesting solution using counting sort can be found in
// https://leetcode.com/problems/array-partition/solution/
public class ArrayPartition {
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int result= 0;
		for (int i = 0; i < nums.length; i += 2) {
			result += nums[i];
		}

		return result;
	}
}
