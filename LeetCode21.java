// Merge Two Sorted Linked List.
// You are given the heads of two sorted linked lists list1 and list2.
//
//Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//Return the head of the merged linked list.
//
//
//
//Example 1:
//
//
//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]
//Example 2:
//
//Input: list1 = [], list2 = []
//Output: []
//Example 3:
//
//Input: list1 = [], list2 = [0]
//Output: [0]
//
//
//Constraints:
//
//The number of nodes in both lists is in the range [0, 50].
//-100 <= Node.val <= 100
//Both list1 and list2 are sorted in non-decreasing order.


public class LeetCode21 {


    private  Node head = null;
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


//    public static LeetCode21 mergeSortedList (LeetCode21 list1, LeetCode21 list2) {
//
//        Node first = list1.head; // Node f = first.head;
//        Node second = list2.head; // Node s = second.head;
//        LeetCode21 ans = new LeetCode21(); //  LL ans = new LL();
//
//        while (first != null && second != null) { // while(f != null && s!= null) {
//            if (first.value < second.value) { // if(f.value < s.value) {
//                ans.insertNewNode(first.value); //  ans.insertNewNode(f.value);
//                first = first.next; // f = f.next;
//            }else { //  }else {
//                ans.insertNewNode(second.value); // ans.insertNewNode(s.value);
//                second = second.next; // s = s.next;
//            }
//        }
//        while(first != null) { // while (f!=null) {
//            ans.insertNewNode(first.value); // ans.insertNewNode(f.value);
//            first = first.next; // f = f.next;
//        }
//
//        while (second != null) { //  }while(s!=null) {
//            ans.insertNewNode(second.value); // ans.insertNewNode(s.value);
//            second = second.next; // s = s.next;
//        }
//        return ans; // return ans;
//    }
//  This entire program is written for returning an entire list. Now if you want to return only the head node you will write:

    public static Node mergeTwoLists(Node list1, Node list2) {
        Node first = list1;
        Node second = list2;
        Node mergedHead = new Node();
        Node current = mergedHead;

        while (first != null && second != null) {
            if (first.value < second.value) {
                current.next = first;
                first = first.next;
            } else {
                current.next = second;
                second = second.next;
            }
            current = current.next; // Move current pointer forward
        }

        // Append remaining nodes if any
        if (first != null) {
            current.next = first;
        }
        if (second != null) {
            current.next = second;
        }

        return mergedHead.next; // Return the head of the merged list (skip the dummy node)
    }



    public static void main(String[] args) {
        LeetCode21 list1 = new LeetCode21();
        LeetCode21 list2 = new LeetCode21();


        list1.insertNewNode(1);
        list1.insertNewNode(2);
        list1.insertNewNode(3);

        list2.insertNewNode(2);
        list2.insertNewNode(3);
        list2.insertNewNode(6);
        list2.insertNewNode(7);

        list1.displayLL();
        System.out.println();
        list2.displayLL();
        System.out.println();
        Node ans = mergeTwoLists(list1.head, list2.head);
        System.out.println(ans);



    }


}
