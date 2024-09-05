public class CLL {


    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertBefore(4);
        list.insertBefore(5);
        list.insertBefore(6);
        list.insertBefore(7);
        list.insertBefore(8);
        list.displayCLL();


    }

    Node head = null;
    Node tail = null;
    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertBefore(int val) {
        Node node = new Node(val);
        if (head == null && tail == null) {
            head = node;
            tail = node;
            return;
        }
        Node temp = head;
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void displayCLL() {
        Node temp = head;
        if(temp != null) {
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }while(temp != head);
        }

        System.out.print("HEAD");
    }

}
