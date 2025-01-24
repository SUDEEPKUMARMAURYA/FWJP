/*Q2. Print the ASCII value of the character inputted by user*/

import java.util.Scanner;

 class Ascii {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); 


        int av = (int) ch;
        System.out.println("The ASCII value of '" + ch + "' is " + av);
        
        
    }
}
