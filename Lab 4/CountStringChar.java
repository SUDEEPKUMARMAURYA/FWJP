/* Lab 3
   Q5. WAP to count the number of lower case characters, upper case characters, numbers and special characters in a String.
 */

import java.util.Scanner;

public class CountStringChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
		int lc = 0;
		int uc = 0;
		int num = 0;
		int sch = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >='A' && ch <= 'Z') {
				uc++;
			}
			else if(ch >='a' && ch <= 'z') {
				lc++;
			}
			else if(ch >='0' && ch <= '9') {
				num++;
			}
			else {
				sch++;
			}
		}
		System.out.println("Total lower charecters: "+lc);
		System.out.println("Total upper charecters: "+uc);
		System.out.println("Total Number: "+num);
		System.out.println("Total spacial charecters: "+sch);
	}

}
