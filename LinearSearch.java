import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
//        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
//        int target = 19;
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.println("Enter the Number of Elements you want in the array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of the Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter tthe Element You want to seacrh: ");
        int ele = sc.nextInt();


        int ans = linearSearch(arr, ele);
        System.out.println("The index of the Target Element is : " + ans);
    }
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            //check for the element at every index if it is matching then return index
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        // This line will be exectuted if no run statements are executed.
        return -1;
    }

}
