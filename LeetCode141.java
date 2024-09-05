// 141. Linked List Cycle
//Easy
//Topics
//Companies
//Given head, the head of a linked list, determine if the linked list has a cycle in it.
//
//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
//
//Return true if there is a cycle in the linked list. Otherwise, return false.
//
//
//
//Example 1:
//
//
//Input: head = [3,2,0,-4], pos = 1
//Output: true
//Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
//Example 2:
//
//
//Input: head = [1,2], pos = 0
//Output: true
//Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
//Example 3:
//
//
//Input: head = [1], pos = -1
//Output: false
//Explanation: There is no cycle in the linked list.
//

public class LeetCode141 {
    private Node head = null;
    private static int size = 0;
    public static class Node {
        private int value;
        private Node next;

        public Node() {

        }
        public Node(int val) {
            this.value = val;
            this.next = null;
        }
        public Node(int val, Node next) {
            this.value = val;
            this.next = next;
        }

    }
    public void insertNewNode(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            size +=1;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size += 1;

    }
    public void displayLL() {
        if(head == null) {
            System.out.println("Empty List");
            return;
        }
        Node temp = head;
        if (temp.next == null){
            System.out.print(temp.value + " -> ");
        }else{
            while(temp != null){
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
        }
        System.out.print("END");
    }

    public boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
//                TO CALCULATE THE LENGTH AS WELL. WE CAN RETURN 0 IF THERE DOES NOT EXISTS ANY CYCLE.
                Node temp = slow;
                int length = 0;
                while (temp != fast) {
                    temp = temp.next;
                    length ++;
                }
                return true;
            }
        }
        return false;
    }


}
