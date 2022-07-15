package p0977;

// Uses two pointers, one for negative numbers and the other for non negative numbers
// Runs in O(n) and uses O(n) plus very small fixed amount of memory
// Runtime is significantly better than the previous solutions
// Time:	O(n),	2 ms,		85.31%
// Space:	O(n),	55.7 MB,	40.38%
public class SquaresOfASortedArray3 {

	public int[] sortedSquares(int[] nums) {
		if(nums == null || nums.length == 0) {
			return nums;
		}

		int[] answer = new int[nums.length];

		// Use two pointers:
		// The first one starts with the largest negative number and moves backwards in the array
		// The second one starts with the lowest non negative number and moves forwards in the array
		int p2 = 0;
		while (p2 < nums.length && nums[p2] < 0) {
			p2++;
		}
		int p1 = p2 - 1;

		// At each iteration, compare the absolute values of both pointers and put the lower one to the result
		int index = 0;
		int number;
		while (index < nums.length) {
			if (p1 > -1 && p2 < nums.length) {
				if (Math.abs(nums[p1]) < Math.abs(nums[p2])) {
					number = nums[p1];
					p1--;
				} else {
					number = nums[p2];
					p2++;
				}
			} else if (p1 > -1) {
				number = nums[p1];
				p1--;
			} else {
				number = nums[p2];
				p2++;
			}

			answer[index] = number * number;
			index++;
		}

		return answer;
	}
}
