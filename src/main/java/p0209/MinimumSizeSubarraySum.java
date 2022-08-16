package p0209;

// Time:	O(n),		2 ms,		79.35%
// Space:	O(1),		58.1 MB,	47.10%
// For this kind of problems, follow this algorithm
// Repeat until the end of the array
// 1. By increasing the fast pointer, increase the window size until you get a valid window
// 2. By increasing the slow pointer, decrease the window size to get a smaller valid window
// 3. Go back to step 1 when the window becomes invalid
public class MinimumSizeSubarraySum {
	public int minSubArrayLen(int target, int[] nums) {
		int slow = 0;
		int fast = 0;
		int sum = 0;
		int answer = Integer.MAX_VALUE;

		while (fast < nums.length) {
			sum += nums[fast++];

			while (sum >= target) {
				answer = Math.min(answer, fast - slow);
				sum -= nums[slow++];
			}
		}

		return (answer==Integer.MAX_VALUE) ? 0:answer;
	}
}
