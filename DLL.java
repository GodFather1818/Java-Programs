public class DLL {







    private Node head = null;


    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(5);
        list.insertFirst(10);
        list.insertFirst(15);
        list.insertFirst(20);
        list.insertFirst(25);

        System.out.print("Forward Display of the Doubly Linked List: ");
        list.displayDLL();
        System.out.println();
        System.out.print("Backward Display of the Doubly Linked List: ");
        list.displayReverse();

    }



    private class Node {
        int value;
        Node next;
        Node prev;


        public Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
            this.prev = null;
        }
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
//        Node temp;
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        node.prev = null;
        head.prev = node;
        head = node;
    }

    public void displayDLL(){
        Node temp = head;
        if (temp.next == null){
            System.out.print(temp.value + " -> ");
        }else{
            while(temp != null){
//            System.out.println(temp);
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
        }

        System.out.print("END");
    }
    public void displayReverse() {
        Node temp = head;
//        Traversing till the end.

        if (temp.next == null){
            System.out.println(temp.value + " -> ");
        }else {
            while(temp.next != null) {
                temp = temp.next;
            }
        }
//         Reached at the last Node

        if (temp.prev == null) {
            System.out.println(temp.value + "  ->");
        }else {
            while (temp!= null) {
                System.out.print(temp.value + " -> ");
                temp = temp.prev;
            }
        }
        System.out.print("START");
    }


}
