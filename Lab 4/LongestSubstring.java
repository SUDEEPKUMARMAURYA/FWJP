import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstring {
    public static String longestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int start = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }
            map.put(s.charAt(right), right);
            
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }
        
        return s.substring(start, start + maxLength);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        String longestSubstr = longestSubstring(input);
        System.out.println("Longest substring without repeating characters: " + longestSubstr);
        System.out.println("Length of longest substring: " + longestSubstr.length());
    }
}
