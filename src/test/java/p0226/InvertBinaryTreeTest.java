package p0226;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InvertBinaryTreeTest {

	InvertBinaryTree solution;

	@BeforeEach
	void setUp() {
		solution = new InvertBinaryTree();
	}

	@Test
	public void test_InvertTree_Should_Return_Empty_Tree_For_Empty_Tree() {
		assertNull(solution.invertTree(null));
	}

	@Test
	public void test_InvertTree_Should_Return_Itself_For_Root_Only_TreeNode() {
		TreeNode root = new TreeNode(1);
		assertEquals(solution.invertTree(root).val, root.val);
	}

	@Test
	public void test_InvertTree_Should_Return_Invert_For_TreeNode() {
		int[] values = new int[]{4, 2, 7, 1, 3, 6, 9};
		TreeNode treeNode = solution.arrayToBinaryTree(values, 0);

		TreeNode invertedTreeNode = solution.invertTree(treeNode);
		int[] actualInvertedValues = solution.binaryTreeToArray(invertedTreeNode);
		int[] expectedInvertedValues = new int[]{4, 7, 2, 9, 6, 3, 1};

		Assertions.assertArrayEquals(expectedInvertedValues, actualInvertedValues);
	}

	@Test
	public void test_ArrayToBinaryTree() {
		int[] values = new int[]{4, 2, 7, 1, 3, 6, 9};
		TreeNode root = solution.arrayToBinaryTree(values, 0);

		assertTreeNodeAndArrayEquals(root, values);

		System.out.println("[" + Arrays.stream(solution.binaryTreeToArray(root)).mapToObj(String::valueOf).collect(Collectors.joining(",")) + "]");

	}

	@Test
	public void test_BinaryTreeToArray() {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);

		int[] values = solution.binaryTreeToArray(root);

		assertTreeNodeAndArrayEquals(root, values);
	}

	private void assertTreeNodeAndArrayEquals(TreeNode root, int[] values) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		int index = 0;
		while (!queue.isEmpty()) {
			TreeNode current = queue.poll();
			assertEquals(current.val, values[index++]);

			if (current.left!=null) {
				queue.add(current.left);
			}

			if (current.right!=null) {
				queue.add(current.right);
			}
		}
	}
}