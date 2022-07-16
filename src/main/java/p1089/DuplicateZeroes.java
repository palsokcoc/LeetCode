package p1089;

import java.util.LinkedList;
import java.util.Queue;

// Uses a Queue which takes O(d) space where d is the number of duplicated zeros
// Time:	O(n),	3 ms,		57.32%
// Space:	O(d),	46.1 MB,	25.96%
public class DuplicateZeroes {

	public void duplicateZeros(int[] arr) {
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			queue.add(arr[i]);
			if(arr[i] == 0) {
				queue.add(arr[i]);
			}

			arr[i] = queue.poll();
		}
	}

	public void duplicateZeros1(int[] arr) {
		if (arr==null || arr.length < 2) {
			return;
		}

		Queue<Integer> queue = new LinkedList<>();
		int numberOfPendingZeroes = 0;
		for (int i = 0; i < arr.length; i++) {
			if (numberOfPendingZeroes > 0) {
				queue.add(arr[i]);
				arr[i] = 0;
				numberOfPendingZeroes--;
			} else if (!queue.isEmpty()) {
				queue.add(arr[i]);
				arr[i] = queue.poll();
				if (arr[i]==0) {
					numberOfPendingZeroes++;
				}
			} else if (arr[i]==0) {
				numberOfPendingZeroes++;
			} else {
				queue.add(arr[i]);
				arr[i] = queue.poll();
			}
		}
	}
}
