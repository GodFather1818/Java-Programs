//143. Reorder List
//Medium
//Topics
//Companies
//You are given the head of a singly linked-list. The list can be represented as:
//
//L0 → L1 → … → Ln - 1 → Ln
//Reorder the list to be on the following form:
//
//L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
//You may not modify the values in the list's nodes. Only nodes themselves may be changed.
//
//
//
//Example 1:
//
//
//Input: head = [1,2,3,4]
//Output: [1,4,2,3]
//Example 2:
//
//
//Input: head = [1,2,3,4,5]
//Output: [1,5,2,4,3]
//
//
//Constraints:
//
//The number of nodes in the list is in the range [1, 5 * 104].
//1 <= Node.val <= 1000




public class LeetCode143 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = middleNode(head);
        ListNode headFirst = head;
        ListNode headSecond = reverseList(mid);

        while (headFirst != null && headSecond != null){
            ListNode temp1 = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp1;

            temp1 = headSecond.next;
            headSecond.next = headFirst;
            temp1 = temp1;
        }

//        ListNode
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode present = head;
        ListNode next = (present != null) ? present.next : null;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;

            }
        }
        return prev;

    }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {
            if (fast.next == null ){
                return slow;
            }
            if (fast.next.next == null) {
                return slow.next;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}



























