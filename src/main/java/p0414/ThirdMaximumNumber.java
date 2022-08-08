package p0414;

// Time:	O(n),		1 ms,		97.68%
// Space:	O(1),		42.3MB,		88.01%
public class ThirdMaximumNumber {

	public int thirdMax(int[] nums) {
		int max1 = nums[0];
		Integer max2 = null;
		Integer max3 = null;

		for (int num : nums) {
			if (num != max1 && (max2 == null || num != max2)) {
				if (num > max1) {
					max3 = max2;
					max2 = max1;
					max1 = num;
				} else if (max2 == null || num > max2) {
					max3 = max2;
					max2 = num;
				} else if (max3 == null || num > max3) {
					max3 = num;
				}
			}
		}

		return max3 != null ? max3 : max1;
	}
}
