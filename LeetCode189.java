import java.util.Arrays;

public class LeetCode189 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotateArray(arr, 3);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        leftRotate(arr2, 3);
        System.out.println(Arrays.toString(arr2));
    }
    public static void reverseArray (int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }
    public static void rotateArray(int[] arr, int k) {

        k = k % arr.length;
        reverseArray(arr, 0, k);
        reverseArray(arr, k+1, arr.length-1);
        reverseArray(arr, 0, arr.length-1);
    }
    public static void leftRotate(int[] arr, int k) {
        k = k % arr.length;
        int[] temp = new int[k];
        
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        for (int i = k; i <arr.length ; i++) {
            arr[i-k] = arr[i];
        }

        for (int i = arr.length-k; i < arr.length; i++) {
            arr[i] = temp[i-arr.length+k];
        }

    }

}
