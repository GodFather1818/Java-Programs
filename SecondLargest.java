import java.util.ArrayList;
import java.util.List;

public class SecondLargest {
    public static int print2largest(ArrayList<Integer> arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i < arr.size(); i++) {

            if(arr.get(i) > largest) {
                secondLargest = largest;
                largest = arr.get(i);
            }else if(arr.get(i) < largest && arr.get(i) > secondLargest) {
                secondLargest = arr.get(i);
            }

        }

        return secondLargest;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int answer = print2largest(list);
        System.out.println(answer);

    }
}
