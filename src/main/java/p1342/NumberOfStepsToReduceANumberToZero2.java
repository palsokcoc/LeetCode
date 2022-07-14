package p1342;

public class NumberOfStepsToReduceANumberToZero2 {

	// If we apply the algorithm to the binary representation of the number, then at each iteration:
	// If the number is even (LSB=0) then we divide by two -> 1 step
	// If the number is greater than 1 and is odd (LSB=1) then we subtract 1 and divide by two -> 2 steps
	// If the number is equal to 1 then we subtract 1 -> 1 step
	// Dividing by 2 decreases the length of the binary representation by 1,
	// Then the total number of iterations is equal to the length of the binary representation
	// If the length of the binary is n, then we have n iterations:
	// 1 step if the LSB is 0
	// 2 steps if the LSB is 1, except the last one
	// So the total number of steps = (Total length) + (Total number of 1's) - 1

	public int numberOfSteps(int num) {
		return Integer.toBinaryString(num).length() + Integer.bitCount(num) - 1;
	}
}
