package p0119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// In Pascal Triangle, 0-based row n consists of the following numbers:
// C(n,0), C(n,1), C(n,2), ... , C(n,n)
// where C(n,0) = 1 and for i in [1,n], C(n,i) = C(n,i-1) * (n+1-i) / i
// where C(n,k) is the number of k-combinations in a set of n elements.
// Time:	O(k),	0 ms,		100%
// Space:	O(1),	39.7 MB,	98.03%
public class PascalsTriangleII {
	public List<Integer> getRow(int rowIndex) {
		int n = rowIndex + 1;
		Integer[] row = new Integer[n];

		row[0] = 1;
		long combinations = 1L;
		for(int i = 1; i <= (rowIndex / 2); i++) {
			combinations = combinations * (n - i) / i;
			row[i] = (int) combinations;
			// Since the triangle is symmetric
			row[rowIndex - i] = row[i];
		}
		row[rowIndex] = 1;

		return Arrays.asList(row);
	}
}
