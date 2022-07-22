package p0905;

// Two pointer approach where the following is repeated until the array is sorted
// 1. The left one finds the first odd number
// 2. The right one finds the last even number
// 3. Two numbers are swapped
// Time:	O(n),	1 ms,		99.98%
// Space:	O(1),	48.3 MB,	47.11%
public class SortArrayByParity {

	public int[] sortArrayByParity(int[] nums) {
		int left = 0;
		int right = nums.length - 1;

		while( left < right) {
			// Find first odd number
			while(left < nums.length && nums[left] % 2 == 0) {
				left++;
			}

			// Find last even number
			while(right >= 0 && nums[right] % 2 == 1) {
				right--;
			}

			// Swap numbers
			if(left<right) {
				int temp = nums[left];
				nums[left++] = nums[right];
				nums[right--] = temp;
			}
		}

		return nums;
	}
}
