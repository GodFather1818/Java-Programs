// 142. Linked List Cycle II
//Medium
//Topics
//Companies
//Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
//
//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
//
//Do not modify the linked list.
//
//
//
//Example 1:
//
//
//Input: head = [3,2,0,-4], pos = 1
//Output: tail connects to node index 1
//Explanation: There is a cycle in the linked list, where tail connects to the second node.
//Example 2:
//
//
//Input: head = [1,2], pos = 0
//Output: tail connects to node index 0
//Explanation: There is a cycle in the linked list, where tail connects to the first node.
//Example 3:
//
//
//Input: head = [1], pos = -1
//Output: no cycle
//Explanation: There is no cycle in the linked list.
//
//
//Constraints:
//
//The number of the nodes in the list is in the range [0, 104].
//-105 <= Node.val <= 105
//pos is -1 or a valid index in the linked-list.
//
//
//Follow up: Can you solve it using O(1) (i.e. constant) memory?

public class LeetCode142 {
    private ListNode head = null;
    private static int size = 0;
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;

        }
    }
    public int findLengthofCycle (ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
//                Calculating the length
                ListNode temp = slow;
                int counter = 0;
                do {
                    temp = temp.next;
                    counter ++;
                }while(temp != fast);
                return counter;
            }
        }
        return 0;

    }
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
//                Step 1. FIND THE LENGTH OF THE CYCLE.
                length = findLengthofCycle(slow);
                break;
            }

        }
//        NOW YOU GOT THE LENGTH OF CYCLE. NOW YOU FIND THE START OF THE CYCLE.
//        TO FIND THE START:
//        Step 2: Move ahead of the List by Length of the cycle times.
        ListNode first = head;
        ListNode second = head;
        while (length > 0) {
            second = second.next;
            length -- ;
        }
//      Step 3: Keep Moving the f, s forward. Once they meet together, that will be the start of the cycle.
        while (first != second) {
            first = first.next;
            second = second.next;
        }
        return second;
    }
//    public void insertNewNode(int val) {
//        LeetCode142 newNode = new LeetCode142();
//        newNode.insertNewNode(3);
//        newNode.insertNewNode(4);
//        newNode.insertNewNode(5);
//        newNode.insertNewNode(6);
//        if (head == null) {
//            head = newNode;
//            size +=1;
//            return;
//        }
//        LeetCode142 temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//        temp.next = newNode;
//        size += 1;
//
//    }

    public static void main(String[] args) {
        LeetCode142 node = new LeetCode142();


    }


}
