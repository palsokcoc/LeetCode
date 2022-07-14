package p1342;

public class NumberOfStepsToReduceANumberToZero1 {

	public int numberOfSteps(int num) {
		int answer = 0;

		while (num > 0) {
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num--;
			}
			answer++;
		}

		return answer;
	}

	public int numberOfSteps2(int num) {
		int answer = 0;

		while (num > 0) {
			if ((num & 1) == 0) {
				num >>= 1;
			} else {
				num--;
			}
			answer++;
		}

		return answer;
	}
}
