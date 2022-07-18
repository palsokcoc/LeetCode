package p0027;

// Time:	O(n),	0 ms,		100%
// Space:	O(1),	43.3 MB,	6.84%
public class RemoveElement {

	public int removeElement(int[] nums, int val) {
		int left = 0;
		int right = nums.length - 1;

		// Two pointers start from both ends of the array
		// If left pointer finds the val, the first element from the right side that is different from the val is moved to the left pointer
		while (left <= right) {
			if (nums[left]!=val) {
				left++;
			} else {
				if (nums[right]!=val) {
					nums[left] = nums[right];
				}
				right--;
			}
		}
		return left;
	}

	// https://leetcode.com/problems/remove-element/solution/207575
	// This is a nice solution, but it makes O(n) copies even if the val does not exist in the array
	public int removeElement_By_Ray_Kim_12(int[] nums, int val) {
		int i = 0;
		for (int elem : nums) {
			if (elem!=val) {
				nums[i] = elem;
				i++;
			}
		}
		return i;
	}
}
