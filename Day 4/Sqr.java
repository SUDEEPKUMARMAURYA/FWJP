/*Q5. Write a program to find the square of the double number.*/

import java.util.Scanner;

 class Sqr {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a no: ");
        double d = sc.nextDouble(); 
	  double sqr = d*d;
        System.out.println("The Square value of " + 'd' + " is " + sqr);
        
        
    }
}
