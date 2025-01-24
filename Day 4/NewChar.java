/*Q3. Write a program to add 32 to the ASCII value of a character and print the equivalent character.*/

import java.util.Scanner;


 class NewChar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); 

        int av = (int) ch;
	  int sum=av+32;
	  char nc= (char)sum;
        System.out.println("The new charecter is " + nc);
        
    }
}
