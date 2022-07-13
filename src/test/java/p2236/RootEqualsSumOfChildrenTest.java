package p2236;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RootEqualsSumOfChildrenTest {

	RootEqualsSumOfChildren solution;

	@BeforeEach
	void setUp() {
		solution = new RootEqualsSumOfChildren();
	}

	@Test
	public void test_CheckTree_True() {
		TreeNode left = new TreeNode(4, null, null);
		TreeNode right = new TreeNode(6, null, null);
		TreeNode root = new TreeNode(10, left, right);
		assertTrue(solution.checkTree(root));
	}

	@Test
	public void test_CheckTree_False() {
		TreeNode left = new TreeNode(4, null, null);
		TreeNode right = new TreeNode(6, null, null);
		TreeNode root = new TreeNode(11, left, right);
		assertFalse(solution.checkTree(root));
	}
}