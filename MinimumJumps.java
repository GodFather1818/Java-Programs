public class MinimumJumps {
    public static void main(String[] args) {
        int[] arr = {0, 10, 20};
        System.out.println(minJumps(arr, arr.length));
    }
    public static int minJumps(int[] arr, int n) {

        if(arr[0] == 0) {
            return -1;
        }
        int i = 0;
        int countJump = 0;
        while(i != arr.length - 1 && i < arr.length) {
            int jump = arr[i];
            i = i + jump;
            countJump++;
        }
        return countJump;
    }
}
