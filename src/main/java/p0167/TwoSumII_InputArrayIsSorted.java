package p0167;

// Time:	O(n),		1 ms,		99.47%
// Space:	O(1),		45.3 MB,	90.74%
public class TwoSumII_InputArrayIsSorted {
	public int[] twoSum(int[] numbers, int target) {
		int left = 0;
		int right = numbers.length - 1;

		while (numbers[left] + numbers[right]!=target) {
			if (numbers[left] + numbers[right] < target) {
				left++;
			} else {
				right--;
			}
		}

		return new int[]{left + 1, right + 1};
	}
}
