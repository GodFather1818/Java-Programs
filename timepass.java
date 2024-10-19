import java.util.*;
public class timepass {
        public static String strongString(int input1, String input2) {
            int n = input2.length();
            int guests = input1;

            // Calculate the base size of each string
            int baseSize = n / guests;
            int extraChars = n % guests;

            List<String> distributedStrings = new ArrayList<>();
            int start = 0;

            // Distribute the characters to guests
            for (int i = 0; i < guests; i++) {
                int currentSize = baseSize + (extraChars > 0 ? 1 : 0);
                distributedStrings.add(input2.substring(start, start + currentSize));
                start += currentSize;
                if (extraChars > 0) extraChars--;
            }

            // Sort the strings lexicographically
            Collections.sort(distributedStrings);

            // Return the last string, which is lexicographically the largest
            return distributedStrings.get(distributedStrings.size() - 1);
        }

        public static void main(String[] args) {
            // Test case 1
            int guests1 = 3;
            String inputStr1 = "good";
            String result1 = strongString(guests1, inputStr1);
            System.out.println("Strongest String (Test 1): " + result1); // Output: gd

            // Test case 2
            int guests2 = 4;
            String inputStr2 = "abacadae";
            String result2 = strongString(guests2, inputStr2);
            System.out.println("Strongest String (Test 2): " + result2); // Output: baaaa
        }
}
