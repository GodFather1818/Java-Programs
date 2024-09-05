// 148. Sort List
//Medium
//Topics
//Companies
//Given the head of a linked list, return the list after sorting it in ascending order.
//
//
//
//Example 1:
//
//
//Input: head = [4,2,1,3]
//Output: [1,2,3,4]
//Example 2:
//
//
//Input: head = [-1,5,3,4,0]
//Output: [-1,0,3,4,5]
//Example 3:
//
//Input: head = []
//Output: []
//
//
//Constraints:
//
//The number of nodes in the list is in the range [0, 5 * 104].
//-105 <= Node.val <= 105
//
//
//Follow up: Can you sort the linked list in O(n logn) time and O(1) memory (i.e. constant space)?

public class LeetCode148 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode SortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = SortList(head);
        ListNode right = SortList(mid);

        return mergeTwoLists(left, right);


    }




    public ListNode mergeTwoLists (ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while( list1 != null && list2 != null ){
            if (list1.val < list2.val) {
                tail.val = list1.val;
                list1 = list1.next;
                tail = tail.next;
            }
            if (list2.val < list1.val) {
                tail.val = list2.val;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        while(list1.next!=null) {
            tail.val = list1.val;
            tail = tail.next;
            list1 = list1.next;
        }
        while(list2.next != null) {
            tail.val = list2.val;
            tail = tail.next;
            list2 = list2.next;
        }
        return dummyHead.next;
    }
    public ListNode getMid (ListNode head) {
        ListNode midPrev = null;
        while (head!=null && head.next != null) {
            midPrev = (midPrev == null) ? head: midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }



}
