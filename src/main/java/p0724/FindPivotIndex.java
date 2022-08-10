package p0724;

// Time:	O(n),	1 ms,		100%
// Space:	O(n),	42.9 MB,	97.16%
public class FindPivotIndex {
	public int pivotIndex(int[] nums) {
		// P[0] = 0
		// P[i] = P[0] + ... + P[i-1]
		int[] runningSums = new int[nums.length + 1];
		for (int i = 1; i < runningSums.length; i++) {
			runningSums[i] = runningSums[i - 1] + nums[i - 1];
		}

		// For each index,
		// Left Sum = P[i]
		// Right Sum = P[length-1] - P[i] - nums[i]
		int total = runningSums[runningSums.length - 1];
		for (int i = 0; i < nums.length; i++) {
			if (runningSums[i] == total - runningSums[i] - nums[i]) {
				return i;
			}
		}

		return -1;
	}
}
