package p1295;

// 1 ms,	99.84%
// 41.9 MB,	90.37%
public class FindNumbersWithEvenNumberOfDigits {

	public int findNumbers(int[] nums) {
		int answer = 0;
		for (int num : nums) {
			if (Integer.toString(num).length() % 2==0) {
				answer++;
			}
		}

		return answer;
	}

	public int findNumbers_UsingLog(int[] nums) {
		int answer = 0;
		for(int num: nums) {
			if(Math.floor(Math.log10(num) + 1) % 2 == 0) {
				answer++;
			}
		}

		return answer;
	}
}
