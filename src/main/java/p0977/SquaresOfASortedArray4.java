package p0977;

// Similar to the 3rd solution
// Uses two pointers, one starting from the beginning of the array and the other from the end
// Runs in O(n) and uses O(n) plus very small fixed amount of memory
// Time:	O(n),	2 ms,		85.31%
// Space:	O(n),	56.3 MB,	 7.73%
public class SquaresOfASortedArray4 {

	public int[] sortedSquares(int[] nums) {
		if (nums==null || nums.length==0) {
			return nums;
		}

		// Use two pointers: The first one starts from the beginning and the other from the end
		int[] answer = new int[nums.length];
		int left = 0;
		int right = nums.length - 1;

		// At each iteration, compare the absolute values of both pointers and put the lower one to the result
		int index = nums.length - 1;
		while (left <= right) {
			if (Math.abs(nums[left]) > Math.abs(nums[right])) {
				answer[index] = nums[left] * nums[left];
				left++;
			} else {
				answer[index] = nums[right] * nums[right];
				right--;
			}

			index--;
		}

		return answer;
	}
}
