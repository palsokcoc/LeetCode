package p0054;

import java.util.ArrayList;
import java.util.List;

// Time:	O(n),	0 ms,		100%
// Space:	O(1),	40.6 MB,	87.27%
public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		final int m = matrix.length;
		final int n = matrix[0].length;
		List<Integer> result = new ArrayList<>(m * n);

		// Initial Boundaries
		int left = 0;
		int top = 0;
		int right = n - 1;
		int bottom = m - 1;

		// Directions: RIGHT, DOWN, LEFT, UP
		final int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

		// Initial Direction: RIGHT
		int direction = 0;

		// Initial Position
		int row = 0;
		int column = -1;

		int index = 0;
		while (index < m * n) {
			int[] steps = directions[direction];

			// Keep moving until a boundary is hit
			while (row + steps[0] >= top && row + steps[0] <= bottom && column + steps[1] >= left && column + steps[1] <= right) {
				row = row + steps[0];
				column = column + steps[1];
				result.add(index++, matrix[row][column]);
			}

			// Update boundaries
			switch (direction) {
				case 0 -> top++;
				case 1 -> right--;
				case 2 -> bottom--;
				case 3 -> left++;
			}

			// Change direction
			direction = (direction + 1) % 4;
		}

		return result;
	}
}
