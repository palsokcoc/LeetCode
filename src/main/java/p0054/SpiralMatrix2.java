package p0054;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Similar solution where the directions are declared in an enum class
// Slower
// Time:	O(n),	1 ms,		15.38%
// Space:	O(1),	42.0 MB,	64.89%
public class SpiralMatrix2 {
	public List<Integer> spiralOrder(int[][] matrix) {
		final int m = matrix.length;
		final int n = matrix[0].length;
		List<Integer> result = new ArrayList<>(m * n);

		// Intial Boundaries
		int left = 0;
		int top = 0;
		int right = n - 1;
		int bottom = m - 1;

		// Initial Position
		int row = 0;
		int column = -1;

		// Initial Direction
		Direction direction = Direction.RIGHT;

		int index = 0;
		while (index < m * n) {
			// Keep moving until a boundary is hit
			while (row + direction.getRow() >= top && row + direction.getRow() <= bottom && column + direction.getColumn() >= left && column + direction.getColumn() <= right) {
				row = row + direction.getRow();
				column = column + direction.getColumn();
				result.add(index++, matrix[row][column]);
			}

			// Update boundaries
			switch (direction) {
				case RIGHT -> top++;
				case DOWN -> right--;
				case LEFT -> bottom--;
				case UP -> left++;
			}

			direction = direction.changeDirection();
		}

		return result;
	}

	private enum Direction {
		RIGHT(0, 1), DOWN(1, 0), LEFT(0, -1), UP(-1, 0);

		private int row;
		private int column;
		private static List<Direction> ORDERED_DIRECTIONS = Arrays.asList(RIGHT, DOWN, LEFT, UP);

		Direction(int row, int column) {
			this.row = row;
			this.column = column;
		}

		public Direction changeDirection() {
			return ORDERED_DIRECTIONS.get((this.ordinal() + 1) % ORDERED_DIRECTIONS.size());
		}

		public int getRow() {
			return row;
		}

		public int getColumn() {
			return column;
		}
	}
}
