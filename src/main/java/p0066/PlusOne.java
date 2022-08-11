package p0066;

// Time:	O(n),	0 ms,		100%
// Space:	O(1),	40.9 MB,	89.79%
public class PlusOne {
	public int[] plusOne(int[] digits) {
		int i = digits.length - 1;
		int carrier = 1;

		while (carrier > 0 && i >= 0) {
			if (digits[i] + carrier < 10) {
				digits[i] = digits[i] + carrier;
				carrier = 0;
			} else {
				digits[i] = 0;
			}
			i--;
		}

		if (carrier > 0) {
			digits = new int[digits.length + 1];
			digits[0] = 1;
		}

		return digits;
	}
}
