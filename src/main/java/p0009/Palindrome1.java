package p0009;

public class Palindrome1 {
	public boolean isPalindrome(int x) {
		if(x < 0) {
			return false;
		}

		int index = 0;
		int[] digits = new int[10];
		while (x > 0) {
			digits[index] = x % 10;
			x = x / 10;
			index++;
		}

		for(int i = 0; i < index/2; i++) {
			if(digits[i] != digits[index-i-1]) {
				return false;
			}
		}

		return true;
	}
}