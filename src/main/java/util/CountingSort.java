package util;

/**
 * Sorts the given array using counting sort.
 * The values are assumed to be in the range of [0,range]
 */
public class CountingSort {

	public static int[] countingSort(int[] nums, int range) {
		// Find frequencies
		int[] frequencies = new int[range+1];
		for (int num : nums) {
			frequencies[num]++;
		}

		// Find the running sum of frequencies
		for (int i = 1; i < frequencies.length; i++) {
			frequencies[i] = frequencies[i-1] + frequencies[i];
		}

		// Sort
		int[] result = new int[nums.length];
		for (int num : nums) {
			result[--frequencies[num]] = num;
		}

		return result;
	}
}
