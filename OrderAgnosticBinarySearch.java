public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int target = 5;
        int[] arr2 = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target2 = -18;
        System.out.println("The index of the Target Number is: " + orderAgnostic(arr2, target2));
    }
    public static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = false;
        if(arr[start] < arr[end]){
            isAsc = true;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
