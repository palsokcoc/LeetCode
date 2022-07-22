package p0283;

// Two Pointer approach where the first one is used for reading the array and skipping the zero elements and
// the second is used for writing the read non-zero elements in order
// Time:	O(n),	1 ms,		100%
// Space:	O(1),	44.1 MB,	85.12%
public class MoveZeroes {

	public void moveZeroes(int[] nums) {
		int writeIndex = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=0) {
				nums[writeIndex] = nums[i];
				writeIndex++;
			}
		}

		for (int i = writeIndex; i < nums.length; i++) {
			nums[i] = 0;
		}
	}
}
