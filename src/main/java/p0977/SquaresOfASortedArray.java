package p0977;

// Uses two fixed size arrays of length 10001, where 10000 is the maximum length of the input array
// Runs in O(n) and uses O(n) plus fixed amount of memory, but it is still suboptimal
// Time:	O(n),	14 ms,		11.22%
// Space:	O(n),	66.6 MB,	-
public class SquaresOfASortedArray {

	public int[] sortedSquares(int[] nums) {
		// The maximum length of the input array is bound to 10000
		int[] squares = new int[10001];
		int[] frequencies = new int[10001];

		// for each number, put the square of that number to the index equal to the absolute value of the number
		// frequencies array stores how many times the square values exist
		for (int num : nums) {
			squares[Math.abs(num)] = num * num;
			frequencies[Math.abs(num)]++;
		}

		int[] answer = new int[nums.length];
		int index = 0;

		// filter the squares array so that only the values with frequency greater than 1 are taken
		for (int i = 0; i < squares.length; i++) {
			for (int j = 0; j < frequencies[i]; j++) {
				answer[index] = squares[i];
				index++;
			}
		}

		return answer;
	}
}
