package p0026;

// Time:	O(n),	1 ms,		100%
// Space:	O(1),	47.6 MB,	62.97%
public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
		if (nums.length < 2) {
			return nums.length;
		}

		// At this point, it is certain that the array is not empty. Then the first element is always unique and that's why the slow pointer starts with 1
		int slow = 1;

		// While fast pointer moves in each iteration, slow one waits if a duplicate is found
		// Only the non-duplicate values are moved from fast pointer to slow pointer, which results in removing the duplicates.
		for (int fast = 1; fast < nums.length; fast++) {
			if (nums[fast]!=nums[fast - 1]) {
				nums[slow] = nums[fast];
				slow++;
			}
		}

		return slow;
	}
}
