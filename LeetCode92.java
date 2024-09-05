// 92. Reverse Linked List II
//Medium
//Topics
//Companies
//Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
//
//
//
//Example 1:
//
//
//Input: head = [1,2,3,4,5], left = 2, right = 4
//Output: [1,4,3,2,5]
//Example 2:
//
//Input: head = [5], left = 1, right = 1
//Output: [5]
//
//
//Constraints:
//
//The number of nodes in the list is n.
//1 <= n <= 500
//-500 <= Node.val <= 500
//1 <= left <= right <= n
//


public class LeetCode92 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode reverseLL2(ListNode head, int left, int right) {

        if (left == right) {
            return head;
        }
//        ----------------------Skip the first left-1 nodes -------------

        ListNode current = head;
        ListNode previous = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            previous = current;
            current = current.next;
        }
//        -----------------------Now we have reached till the sublist. Now we will only reverse the sublist. -------------
        ListNode last = previous;
        ListNode newEnd = current;
        ListNode next = current.next;

        for (int i = 0; current != null && i < right-left; i++) {
            current.next = previous;
            previous = current;
            current = next;
            if (next != null) {
                next = next.next;
            }

        }
        if (last != null) {
            last.next = previous;
        }else {
            head = previous;
        }
        newEnd.next = current;
        return head;


    }

}
