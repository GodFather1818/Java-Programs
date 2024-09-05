//  GEEKS FOR GEEKS
//
//  Given two sorted arrays of size n and m respectively, find their union. The Union of two arrays can be defined as the common and distinct elements in the two arrays. Return the elements in sorted order.
//
//Example 1:
//
//Input:
//n = 5, arr1[] = {1, 2, 3, 4, 5}
//m = 5, arr2 [] = {1, 2, 3, 6, 7}
//Output:
//1 2 3 4 5 6 7
//Explanation:
//Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
//Example 2:
//
//Input:
//n = 5, arr1[] = {2, 2, 3, 4, 5}
//m = 5, arr2[] = {1, 1, 2, 3, 4}
//Output:
//1 2 3 4 5
//Explanation:
//Distinct elements including both the arrays are: 1 2 3 4 5.
//Example 3:
//
//Input:
//n = 5, arr1[] = {1, 1, 1, 1, 1}
//m = 5, arr2[] = {2, 2, 2, 2, 2}
//Output:
//1 2
//Explanation:
//Distinct elements including both the arrays are: 1 2.
//Your Task:
//You do not need to read input or print anything. Complete the function findUnion() that takes two arrays arr1[], arr2[], and their size n and m as input parameters and returns a list containing the union of the two arrays.
//
//Expected Time Complexity: O(n+m).
//Expected Auxiliary Space: O(n+m).

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class UnionOf2Arrays {

    public static void main(String[] args) {

//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = {1, 2, 3, 6, 7};
        int[] arr1 = {7, 8};
        int[] arr2 = {-8, 3, 8};

        ArrayList<Integer> temp = striversOptimalSolutionUnion(arr1, arr2);
        System.out.println(temp);

    }

    public static ArrayList findUnion(int[] arr1, int[] arr2) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            temp.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            temp.add(arr2[i]);
        }
//        int j=1;
        for (int i = 0; i < temp.size(); i++) {
            for (int j = i + 1; j < temp.size(); j++) {
                if (temp.get(i) == temp.get(j)) {
                    temp.remove(j);
                }
            }
        }
        Collections.sort(temp);
        return temp;
    }

    public static ArrayList striversBruteForceUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> st = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            st.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            st.add(arr2[i]);
        }

        for (int element : st) {
            union.add(element);
        }

        return union;

    }

    public static ArrayList striversOptimalSolutionUnion(int[] arr1, int[] arr2) {
        ArrayList<Integer> Union = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);

                }
                i++;
            } else {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);

                }
                j++;

            }

        }
        while (i < arr1.length) {
            if (Union.get(Union.size() - 1) != arr1[i]) {
                Union.add(arr1[i]);

            }
            i++;

        }
        while (j < arr2.length) {
            if (Union.get(Union.size() - 1) != arr2[j]) {
                Union.add(arr2[j]);

            }
            j++;
        }
        return Union;

    }
}
