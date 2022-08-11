package p0498;

// Time:	O(n),	1 ms,		100%
// Space:	O(1),	43.7 MB,	99.13%
public class DiagonalTraverse {

	public int[] findDiagonalOrder(int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;
		int[] result = new int[m * n];

		// In the while loop below, the 'First row' case runs in the first iteration,
		// which increases the column index before using it. That's why we start with column = -1
		int row = 0;
		int column = -1;
		int index = 0;

		// Last row and last column cases are handled before the first row and first column cases
		// to make sure the lower left and upper right corners are processed correctly
		while (index < m * n) {
			// Last row: Move right and keep going upper right
			if (row == m - 1) {
				result[index++] = mat[row][++column];
				while (row > 0 && column < n - 1) {
					result[index++] = mat[--row][++column];
				}
			}

			// Last column: Move down and keep going lower left
			else if (column == n - 1) {
				result[index++] = mat[++row][column];
				while (row < m - 1 && column > 0) {
					result[index++] = mat[++row][--column];
				}
			}

			// First row: Move right and keep going lower left
			else if (row == 0) {
				result[index++] = mat[row][++column];
				while (row < m - 1 && column > 0) {
					result[index++] = mat[++row][--column];
				}
			}

			// First column: Move down and keep going upper right
			else if (column == 0) {
				result[index++] = mat[++row][column];
				while (row > 0 && column < n - 1) {
					result[index++] = mat[--row][++column];
				}
			}
		}

		return result;
	}
}
