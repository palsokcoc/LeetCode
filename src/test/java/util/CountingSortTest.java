package util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountingSortTest {

	@Test
	public void test_CountingSort_AllAscending() {
		int[] nums = new int[]{0,1,2,3,4,5,10};
		int[] actual = CountingSort.countingSort(nums, 10);
		Arrays.sort(nums);
		assertArrayEquals(nums, actual);
	}

	@Test
	public void test_CountingSort_AllDescending() {
		int[] nums = new int[]{10,5,4,3,2,1,0};
		int[] actual = CountingSort.countingSort(nums, 10);
		Arrays.sort(nums);
		assertArrayEquals(nums, actual);
	}

	@Test
	public void test_CountingSort_NotSorted() {
		int[] nums = new int[]{10,5,1,2,3,4,0};
		int[] actual = CountingSort.countingSort(nums, 10);
		Arrays.sort(nums);
		assertArrayEquals(nums, actual);
	}
}