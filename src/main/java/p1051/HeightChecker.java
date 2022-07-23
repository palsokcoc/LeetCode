package p1051;

import java.util.Arrays;

// Uses Arrays.sort()
// Time:	O(nlgn),	2 ms,		72.90%
// Space:	O(n),		42.2 MB,	32.61%
public class HeightChecker {

	public int heightChecker(int[] heights) {
		int[] sortedHeights = Arrays.copyOf(heights, heights.length);
		Arrays.sort(sortedHeights);

		int result = 0;
		for(int i = 0; i < heights.length; i++) {
			if(heights[i] != sortedHeights[i]) {
				result++;
			}
		}

		return result;
	}
}
