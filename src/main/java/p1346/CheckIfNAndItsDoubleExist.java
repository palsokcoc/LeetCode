package p1346;

import java.util.HashSet;

// Time:	O(n),	1 ms,		99.93%
// Space:	O(n),	41.7 MB,	92.96%
public class CheckIfNAndItsDoubleExist {

	public boolean checkIfExist(int[] arr) {
		HashSet<Integer> hashSet = new HashSet<>();
		for (int num: arr) {
			if (hashSet.contains(2 * num) || (num % 2==0 && hashSet.contains(num / 2))) {
				return true;
			}
			hashSet.add(num);
		}

		return false;
	}
}
