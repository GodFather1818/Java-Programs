public class LL {

    private Node head = null;
    private Node tail = null;
    private int size;

    private static class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
//        System.out.println(node.next);
    }

    public void displayLL(){
//        System.out.println(head.value);
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
//        System.out.println(head.value);
        System.out.print("END");
    }

    public void insertNewNode(int val){

//        if (tail == null) {
//            insertFirst(val);
//            return;
//        }
//        Node newNode = new Node(val);
//        newNode.next = null;
//        tail.next = newNode;
//        tail = newNode;
//        size++;
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

    public static LL merge (LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while(f != null && s!= null) {
            if(f.value < s.value) {
                ans.insertNewNode(f.value);
                f = f.next;
            }else {
                ans.insertNewNode(s.value);
                s = s.next;
            }
        }
        while (f!=null) {
            ans.insertNewNode(f.value);
            f = f.next;
        }while(s!=null) {
            ans.insertNewNode(s.value);
            s = s.next;
        }

        return ans;


    }


//    Inserting using Recursion
    public void insertRec(int value, int index) {
            head = insertRec(value, index, head);
    }
    private Node insertRec(int value, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(value, node);
            System.out.println(temp.value);
            return temp;
        }
        node.next = insertRec(value, index--, node.next);
        System.out.println(node);
        return node;
    }

    public void insertAtLoc(int val, int insertedValue){
//
        Node node = new Node(val);
        Node temp = head;

        while(temp.next.value != insertedValue){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public void deleteFirst() {
//        Node temp = head;
        head = head.next;
    }
    public void deleteLast() {
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    public void deleteAtLoc(int val) {
        Node temp = head;
        while(temp.next.value != val){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }


    public void duplicates() {
        Node node = head;
        while(node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
            }else {
                node = node.next;
            }
        }
    }


    public int findIndex(int val) {
        Node temp = head;
        int index = 0;

        if (temp.value == val) {
            return index;
        }

        while (temp != null && temp.value != val) {
            if (temp.next == null) {
                return 0;
            }
            temp = temp.next;
            index += 1;

            if (temp.next == null) {
                if (temp.value == val){
                    return index;
                }
                return -1;
            }
        }

        return index;

//
//
//        while(temp != null && temp.value != val) {
//
////            index = 0;
//            temp = temp.next;
//            index += 1;
////            if (temp.value == val) {
////                return index;
////            }
//        }
//        return index;
    }





    public static void main(String[] args) {
        LL list1 = new LL();
        LL list2 = new LL();
//        list.insertFirst(3);
////        System.out.println();
//        list.insertNewNode(99);
//        list.insertFirst(4);
//        list.insertFirst(14);
//        list.insertFirst(7);
//        list.insertFirst(7);
//        list.insertNewNode(99);
//        list.insertNewNode(67);
//        list.insertAtLoc(33, 67);
//        list.insertAtLoc(18, 14);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertFirst(5);
//        list.insertFirst(6);
//        list.insertFirst(7);
//        list.insertFirst(7);
//        list.insertFirst(8);
//        list.insertFirst(9);
//        list.displayLL();
//        System.out.println();
//        System.out.println("After Removing Duplicates: ");
//        list.duplicates();

//        System.out.println(list.findIndex(67));
//        list.deleteFirst();
//        list.deleteLast();
//        list.deleteAtLoc(14);

        list1.insertNewNode(1);
        list1.insertNewNode(2);
        list1.insertNewNode(3);
        list1.displayLL();
        System.out.println();
        list2.insertNewNode(2);
        list2.insertNewNode(3);
        list2.insertNewNode(4);
        list2.insertNewNode(5);
        list2.displayLL();
        System.out.println();
        LL ans = merge(list1, list2);
        System.out.println();
        ans.displayLL();

//        list.insertRec(88, 4);

//        list.displayLL();
    }
}
