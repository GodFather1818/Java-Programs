import java.util.ArrayList;

public class IntersectionOf2Arrays {
    public static ArrayList striverOptimalSolution(int[] arr1, int[] arr2) {
        ArrayList<Integer> intersectionArray = new ArrayList<>();

        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                i++;
            }else if(arr1[i] > arr2[j]) {
                j++;
            }else {
                intersectionArray.add(arr1[i]);
                i++;
                j++;
            }
        }
        return intersectionArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {4, 7, 6, 7, 8, 9};
        ArrayList<Integer> temp = striverOptimalSolution(arr, arr2);
        System.out.println(temp);
}
}
