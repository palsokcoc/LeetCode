package p0067;

// Time:	O(n),	1 ms,		100%
// Space:	O(1),	40.9 MB,	99.79%
public class AddBinary {
	public String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder(Math.max(a.length(), b.length()));

		int i = a.length() - 1;
		int j = b.length() - 1;
		int carrier = 0;
		int sum;

		while (i >= 0 || j >= 0) {
			sum = carrier;

			if (i >= 0) {
				sum += a.charAt(i) - '0';
				i--;
			}

			if (j >= 0) {
				sum += b.charAt(j) - '0';
				j--;
			}

			sb.append(sum % 2);
			carrier = sum / 2;
		}

		if (carrier==1) {
			sb.append("1");
		}

		return sb.reverse().toString();
	}
}
