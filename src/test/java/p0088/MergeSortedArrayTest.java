package p0088;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeSortedArrayTest {

	MergeSortedArray solution;

	@BeforeEach
	void setUp() {
		solution = new MergeSortedArray();
	}

	@Test
	public void test_Merge_EmptyArrays_ShouldReturnEmptyArray() {
		int[] nums1 = new int[0];
		int[] nums2 = new int[0];
		int m = 0;
		int n = 0;
		solution.merge(nums1, m, nums2, n);
		int[] expected = new int[0];
		assertArrayEquals(expected, nums1);
	}

	@Test
	public void test_Merge_EmptyFirstArray_ShouldReturnSecondArray() {
		int[] nums1 = new int[3];
		int[] nums2 = new int[]{1, 2, 3};
		int m = 0;
		int n = 3;
		solution.merge(nums1, m, nums2, n);
		int[] expected = new int[]{1, 2, 3};
		assertArrayEquals(expected, nums1);
	}

	@Test
	public void test_Merge_EmptySecondArray_ShouldReturnFirstArray() {
		int[] nums1 = new int[]{1, 2, 3};
		int[] nums2 = new int[0];
		int m = 3;
		int n = 0;
		solution.merge(nums1, m, nums2, n);
		int[] expected = new int[]{1, 2, 3};
		assertArrayEquals(expected, nums1);
	}

	@Test
	public void test_Merge_SingleElementFirstArray_ShouldSuccess() {
		int[] nums1 = new int[]{1, 0, 0, 0};
		int[] nums2 = new int[]{0, 1, 2};
		int m = 1;
		int n = 3;
		solution.merge(nums1, m, nums2, n);
		int[] expected = new int[]{0, 1, 1, 2};
		assertArrayEquals(expected, nums1);
	}

	@Test
	public void test_Merge_SingleElementSecondArray_ShouldSuccess() {
		int[] nums1 = new int[]{1, 2, 3, 0};
		int[] nums2 = new int[]{0};
		int m = 3;
		int n = 1;
		solution.merge(nums1, m, nums2, n);
		int[] expected = new int[]{0, 1, 2, 3};
		assertArrayEquals(expected, nums1);
	}

	@Test
	public void test_Merge_FirstArraySmallerThanSecond_ShouldSuccess() {
		int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
		int[] nums2 = new int[]{4, 5, 6};
		int m = 3;
		int n = 3;
		solution.merge(nums1, m, nums2, n);
		int[] expected = new int[]{1, 2, 3, 4, 5, 6};
		assertArrayEquals(expected, nums1);
	}

	@Test
	public void test_Merge_FirstArrayLargerThanSecond_ShouldSuccess() {
		int[] nums1 = new int[]{4, 5, 6, 0, 0, 0};
		int[] nums2 = new int[]{1, 2, 3};
		int m = 3;
		int n = 3;
		solution.merge(nums1, m, nums2, n);
		int[] expected = new int[]{1, 2, 3, 4, 5, 6};
		assertArrayEquals(expected, nums1);
	}

	@Test
	public void test_Merge_MultipleElementArrays_Case1_ShouldSuccess() {
		int[] nums1 = new int[]{1, 3, 4, 0, 0, 0};
		int[] nums2 = new int[]{0, 2, 5};
		int m = 3;
		int n = 3;
		solution.merge(nums1, m, nums2, n);
		int[] expected = new int[]{0, 1, 2, 3, 4, 5};
		assertArrayEquals(expected, nums1);
	}

	@Test
	public void test_Merge_MultipleElementArrays_Case2_ShouldSuccess() {
		int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
		int[] nums2 = new int[]{2, 5, 6};
		int m = 3;
		int n = 3;
		solution.merge(nums1, m, nums2, n);
		int[] expected = new int[]{1, 2, 2, 3, 5, 6};
		assertArrayEquals(expected, nums1);
	}

	@Test
	public void test_Merge_MultipleElementArrays_Case3_ShouldSuccess() {
		int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
		int[] nums2 = new int[]{2, 5, 6};
		int m = 3;
		int n = 3;
		solution.merge(nums1, m, nums2, n);
		int[] expected = new int[]{1, 2, 2, 3, 5, 6};
		assertArrayEquals(expected, nums1);
	}
}