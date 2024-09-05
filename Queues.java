import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    public Queues() {
        this(DEFAULT_SIZE);
    }
    public Queues(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length ;
    }
    public boolean isEmpty() {
        return end == 0;
    }
    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }
    public boolean deleteItem() {

        if(isEmpty()) {
            return false;
        }
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end --;
        return true;
    }
    public void displayQueue() {
        System.out.print("[ ");
        for (int i = 0; i < end-1; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.print(data[end] + " ]");
    }




    public static void main(String[] args) {
//        Inbuilt Queues Example
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);


        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);

        Queues queue1 = new Queues(5);

        boolean ans = queue1.insert(3);
        boolean ans1 = queue1.insert(4);
        boolean ans2 = queue1.insert(5);
        boolean ans3 = queue1.insert(6);
        boolean ans4 = queue1.insert(8);

        boolean removedItem = queue1.deleteItem();

        queue1.displayQueue();



    }






}
