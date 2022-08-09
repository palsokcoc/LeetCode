package p0448;

import java.util.ArrayList;
import java.util.List;

// Follow up: Without extra space (in-place) and in O(n) runtime.
// Time:	O(n),		1 ms,		97.68%
// Space:	O(1),		42.3MB,		88.01%
public class FindAllNumbersDisappearedInAnArray2 {

	public List<Integer> findDisappearedNumbers(int[] nums) {
		int currentNum;
		int nextNum;

		// Keep moving each number to the index equal to itself
		// Note that the values start with 1 where the indices start with 0
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != i + 1) {
				currentNum = nums[i];
				while(nums[currentNum - 1] != currentNum) {
					nextNum = nums[currentNum - 1];
					nums[currentNum - 1] = currentNum;
					currentNum = nextNum;
				}
			}
		}

		// Find the indices where the value is not equal to the index
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != i + 1) {
				result.add(i + 1);
			}
		}

		return result;
	}
}
