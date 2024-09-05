public class LengthOfListCycle {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
          val = x;
          next = null;
      }
  }

  public int findLengthofCycle (ListNode head) {
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        int counter = 0;
        while(pointer1 != pointer2) {
            pointer1 = pointer1.next;
            counter ++;
        }
        return counter;
  }


}
