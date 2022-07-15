package p0485;

// 2 ms,	94.06%
// 57.5 MB,	14.95%
public class MaxConsecutiveOnes {

	public int findMaxConsecutiveOnes(int[] nums) {
		int localMax = 0;
		int globalMax = 0;
		for(int num: nums) {
			if(num == 1) {
				localMax++;
			} else {
				globalMax = Math.max(globalMax, localMax);
				localMax = 0;
			}
		}

		return Math.max(globalMax, localMax);
	}
}
