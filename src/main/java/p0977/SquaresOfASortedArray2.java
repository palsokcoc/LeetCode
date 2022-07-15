package p0977;

// Similar to the first solution but ses one 2D array instead of two 1D arrays
// Runtime is quite worse than the first solution
// Runs in O(n) and uses O(n) plus fixed amount of memory, but it is still suboptimal
// Time:	O(n),	99 ms,		7.79%
// Space:	O(n),	67.4 MB,	-
public class SquaresOfASortedArray2 {

	public int[] sortedSquares(int[] nums) {
		// The maximum length of the input array is bound to 10000
		int[][] squares = new int[10001][2];

		// for each number, put the square of that number to the index equal to the absolute value of the number
		// frequencies array stores how many times the square values exist
		for (int num : nums) {
			int absoluteValue = Math.abs(num);
			squares[absoluteValue][0] = absoluteValue * absoluteValue;
			squares[absoluteValue][1]++;
		}

		int[] answer = new int[nums.length];
		int index = 0;

		// filter the squares array so that only the values with frequency greater than 1 are taken
		for (int i = 0; i < squares.length; i++) {
			for (int j = 0; j < squares[i][1]; j++) {
				answer[index] = squares[i][0];
				index++;
			}
		}

		return answer;
	}
}
