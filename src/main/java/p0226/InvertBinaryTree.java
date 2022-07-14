package p0226;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InvertBinaryTree {

	public TreeNode invertTree(TreeNode root) {
		if (root == null)  {
			return null;
		} else {
			TreeNode originalLeft = root.left;
			root.left = root.right;
			root.right = originalLeft;
			invertTree(root.left);
			invertTree(root.right);
			return root;
		}
	}


	public TreeNode arrayToBinaryTree(int[] values, int i) {
		if (values == null || values.length == 0 || i >= values.length) {
			return null;
		}

		if (i > values.length / 2) {
			return new TreeNode(values[i]);
		} else {
			TreeNode left = arrayToBinaryTree(values, (i * 2) + 1);
			TreeNode right = arrayToBinaryTree(values, (i * 2) + 2);
			return new TreeNode(values[i], left, right);
		}
	}

	public int[] binaryTreeToArray(TreeNode treeNode) {
		List<Integer> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		result.add(treeNode.val);
		queue.add(treeNode);
		while(!queue.isEmpty()) {
			TreeNode node = queue.poll();

			if (node.left != null) {
				result.add(node.left.val);
				queue.add(node.left);
			}

			if (node.right != null) {
				result.add(node.right.val);
				queue.add(node.right);
			}
		}

		return result.stream().mapToInt(Integer::valueOf).toArray();
	}
}