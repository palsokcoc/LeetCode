package p0118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time:	O(n),	0 ms,		100%
// Space:	O(1),	39.9 MB,	97.42%
public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>(numRows);

		// Row 1
		result.add(Arrays.asList(1));

		List<Integer> previousRow = result.get(0);
		List<Integer> row;
		for (int i = 1; i < numRows; i++) {
			row = new ArrayList<>(i + 1);

			row.add(1);
			for (int j = 1; j < i; j++) {
				row.add(previousRow.get(j - 1) + previousRow.get(j));
			}
			row.add(1);

			result.add(row);
			previousRow = row;
		}

		return result;
	}
}
