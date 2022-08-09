package p0448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Extra space (not in-place)
// Time:	O(n),		3 ms,		100%
// Space:	O(n),		50.2MB,		96.33%
public class FindAllNumbersDisappearedInAnArray {

	public List<Integer> findDisappearedNumbers(int[] nums) {
		// Create a new array and copy each num in nums to the corresponding index in the new array
		int[] sortedNums = new int[nums.length + 1];
		for (int num : nums) {
			sortedNums[num] = num;
		}

		// Find the indices where index != value
		List<Integer> result = new ArrayList<>();
		for (int i = 1; i < sortedNums.length; i++) {
			if (sortedNums[i] != i) {
				result.add(i);
			}
		}
		return result;
	}
}
