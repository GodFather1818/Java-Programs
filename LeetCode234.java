// 234. Palindrome Linked List
//Easy
//Topics
//Companies
//Given the head of a singly linked list, return true if it is a
//palindrome
// or false otherwise.
//
//
//
//Example 1:
//
//
//Input: head = [1,2,2,1]
//Output: true
//Example 2:
//
//
//Input: head = [1,2]
//Output: false
//
//
//Constraints:
//
//The number of nodes in the list is in the range [1, 105].
//0 <= Node.val <= 9
//
//
//Follow up: Could you do it in O(n) time and O(1) space?


public class LeetCode234 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public boolean isPalindrome(ListNode head) {
//        Step 1: Finding the Middle of the Element.
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode rereverse = headSecond;

//      Now comapring both the halves.
      while (head!=null && headSecond != null) {
        if (head.val == headSecond.val) {
          head = head.next;
          headSecond = headSecond.next;
        }else {
          break;
        }
      }
      reverseList(rereverse);

      if (head == null || headSecond == null) {
        return true;
      }else {
        return false;
      }

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

























