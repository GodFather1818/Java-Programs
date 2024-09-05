
// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//
//
//Example 1:
//
//
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
//Example 2:
//
//Input: l1 = [0], l2 = [0]
//Output: [0]
//Example 3:
//
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]

public class LeetCode2 {

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

        public static Node addTwoNumbers(Node list1, Node list2) {
            String number1 = "";
            String number2 = "";
             Node temp1 = list1;
             Node temp2 = list2;
             while(temp1.next != null){
                 number1 = Integer.toString(temp1.value) + number1;
                 temp1 = temp1.next;
             }
            while(temp2.next != null){
                number2 = Integer.toString(temp2.value) + number2;
                temp2 = temp2.next;
            }
            int final_ans = Integer.parseInt(number1) + Integer.parseInt(number2);
            Node ans = new Node();
            Node temp = ans;
            while(final_ans!=0) {
                temp.value = final_ans % 10;
                final_ans = final_ans / 10;
                temp = temp.next;
            }
            return ans;


        }
    void display(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    }






    public static void main(String[] args) {
        LeetCode2 list1 = new LeetCode2();
        LeetCode2 list2 = new LeetCode2();

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

//        Node ans = addTwoNumbers(list1, list2);


    }
}
