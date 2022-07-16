package p1089;

// No extra space
// 2 pass: first one to find the number of zeroes to be duplicated, the next one to shift the contents
// Time:	O(n),	1 ms,		99.40%
// Space:	O(1),	46.1 MB,	25.96%
public class DuplicateZeroes2 {

	public void duplicateZeros(int[] arr) {
		int numberOfDuplicates = 0;
		int index = 0;

		// First pass to find the number of zeroes to be duplicated
		while (index + numberOfDuplicates < arr.length - 1) {
			if (arr[index]==0) {
				numberOfDuplicates++;
			}
			index++;
		}

		int right = arr.length - 1 - numberOfDuplicates;

		// If there is a zero that will stay in the array but will not be duplicated because of lack of space
		if(index < arr.length - numberOfDuplicates && arr[index] == 0) {
			arr[arr.length-1] = 0;
			right--;
		}

		// Second pass to shift the elements of the array starting from the last element that will stay in the array
		for (int i = right; i >= 0; i--) {
			arr[i + numberOfDuplicates] = arr[i];
			if (arr[i]==0) {
				numberOfDuplicates--;
				arr[i] = arr[i + numberOfDuplicates] = 0;
			}
		}
	}
}
