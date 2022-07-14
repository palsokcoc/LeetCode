package p0876;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MiddleOfTheLinkedListTest {

	MiddleOfTheLinkedList solution;

	@BeforeEach
	void setUp() {
		solution = new MiddleOfTheLinkedList();
	}

	@Test
	public void test_MiddleNode_EmptyList() {
		ListNode actualMiddleNodeValue = solution.middleNode(null);
		assertNull(actualMiddleNodeValue);
	}

	@Test
	public void test_MiddleNode_SingleNode() {
		ListNode node1 = new ListNode(1);

		int actualMiddleNodeValue = solution.middleNode(node1).val;
		int expectedMiddleNodeValue = 1;
		assertEquals(expectedMiddleNodeValue, actualMiddleNodeValue);
	}

	@Test
	public void test_MiddleNode_OddNumberOfNodes() {
		ListNode node5 = new ListNode(5);
		ListNode node4 = new ListNode(4, node5);
		ListNode node3 = new ListNode(3, node4);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);

		int actualMiddleNodeValue = solution.middleNode(node1).val;
		int expectedMiddleNodeValue = 3;
		assertEquals(expectedMiddleNodeValue, actualMiddleNodeValue);
	}

	@Test
	public void test_MiddleNode_EvenNumberOfNodes() {
		ListNode node6 = new ListNode(6);
		ListNode node5 = new ListNode(4, node6);
		ListNode node4 = new ListNode(4, node5);
		ListNode node3 = new ListNode(3, node4);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);

		int actualMiddleNodeValue = solution.middleNode(node1).val;
		int expectedMiddleNodeValue = 4;
		assertEquals(expectedMiddleNodeValue, actualMiddleNodeValue);
	}
}