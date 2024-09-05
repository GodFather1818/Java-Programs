import java.util.Scanner;

public class LinearSearchInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String string = sc.nextLine();
        System.out.println("Enter the Target Character: ");
        char target = sc.next().charAt(0);
        boolean ans = search(string, target);
        System.out.println(ans);
    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
