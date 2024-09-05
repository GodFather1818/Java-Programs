//
//Code
//
//
//        Testcase
//        Test Result
//        Test Result
//        206. Reverse Linked List
//        Easy
//        Topics
//        Companies
//        Given the head of a singly linked list, reverse the list, and return the reversed list.
//
//
//
//        Example 1:
//
//
//        Input: head = [1,2,3,4,5]
//        Output: [5,4,3,2,1]
//        Example 2:
//
//
//        Input: head = [1,2]
//        Output: [2,1]
//        Example 3:
//
//        Input: head = []
//        Output: []
//
//
//        Constraints:
//
//        The number of nodes in the list is the range [0, 5000].
//        -5000 <= Node.val <= 5000
//
//
//        Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?

public class LeetCode206 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


//    public void reverseLLRecursion(ListNode node) {
//        if (node == tail) {
//            head = tail;
//        }
//        reverseLLRecursion(node.next);
//
//        tail.next = node;
//        tail = node;
//        tail.next = null;
//
//    }

//    Inplace Reversal Of Linked List
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
}






