/* Lab 3
 Q9. Check for Palindrome Write a function to check if a given string is a palindrome (reads the same forward and backward).
	Example:
		Input: "madam" → Output: true
		Input: "hello" → Output: false
 */
import java.util.Scanner;

public class StrPalindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		
		String res = str.toLowerCase();
		String s ="";
		for(int i = res.length()-1; i >=0; i--) {
			 s = s + res.charAt(i);
		}
		
		if(res.equals(s)) {
			System.out.print("Palindrom: "+true);
		}
		else {
			System.out.print("Palindrom: "+false);
		}
		
	}

}
