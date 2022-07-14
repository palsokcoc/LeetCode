package p0876;

public class MiddleOfTheLinkedList {

	// Keep two pointers such that while the first pointer moves two nodes, the second one moves only one
	// Since the second pointer moves with half the speed of the first one, it shows the middle node at the end.
	public ListNode middleNode(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		return slow;
	}
}
