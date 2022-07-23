package p1051;

// Uses a slightly modified Counting Sort
// Time:	O(n),		0 ms,		100%
// Space:	O(1),		39.9MB,		97.32%
public class HeightChecker2 {


	public int heightChecker(int[] heights) {
		// Example: heights = [1, 1, 4, 2, 1, 3]

		// Find counts of heights
		int[] counts = new int[101];
		for (int height : heights) {
			counts[height]++;
		}
		// counts = [0, 3, 1, 1, 1, 0, ......, 0]

		// Find the running sum of counts
		for (int i = 1; i < counts.length; i++) {
			counts[i] = counts[i - 1] + counts[i];
		}
		// counts = [0, 3, 4, 5, 6, 6, ......, 6]

		/*
			Iterate over the heights array to find the elements that are placed differently from the correct order.
			For each h in heights,
				- counts[h-1] is the number of heights that are smaller than h
				- Since the array is zero indexed, these smaller numbers are placed between indexes 0 and counts[h-1]-1
				- That is, counts[h-1]-1 gives the index of the last height smaller than h
				- Then, counts[h-1] gives the index of the first h
				- And,  counts[h]-1 gives the index of the last h
			Then, the indexes of h in the output array are (counts[h-1]),...,(counts[h]-1)
			For example, for height = 1, the indexes are 0, 1, and 2.
			As a result, h = heights[i] is in the correct place only if counts[h-1] <= i <= counts[h]-1
			Or, h = heights[i] is in the wrong place if i < counts[h-1] or i > counts[h]-1
		 */
		int result = 0;
		for (int i = 0; i < heights.length; i++) {
			if (i < counts[heights[i] - 1] || i > counts[heights[i]] - 1) {
				result++;
			}
		}

		return result;
	}
}
