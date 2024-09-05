// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
//
//
//
//Example 1:
//
//
//Input: head = [1,1,2]
//Output: [1,2]


public class LeetCode83 {

    private Node head = null;
    private static class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }
    public void duplicates() {
        Node node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            }else {
                node = node.next;
            }
        }
    }

    public void displayLL() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Empty List");
            return;
        }
        if (temp.next == null){
            System.out.print(temp.val + " -> ");
        }else{
            while(temp != null){
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
        }
        System.out.print("END");

    }
    public void insertNewNode(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public static void main(String[] args) {
        LeetCode83 newNode = new LeetCode83();
        newNode.insertNewNode(33);
        newNode.insertNewNode(34);
        newNode.insertNewNode(34);
        newNode.insertNewNode(35);
        newNode.insertNewNode(36);
        newNode.insertNewNode(36);
        newNode.insertNewNode(37);
        newNode.displayLL();
        System.out.println();
        System.out.println("After Removing Duplicates: ");
        newNode.duplicates();
        newNode.displayLL();

    }


}
