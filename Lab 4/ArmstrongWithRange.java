/*Lab 3
 	Q1. Write a program to find out all the armstrong numbers within a given range using a method named printArmstrongNumber( int start, int end)
 	 by taking input from the user. The program should print the Armstrong number in a given range starting from “start” and ending with “end”. 
 	 Armstrong Number Example: 153 1
		3+5
		3+3
		3 =153 (Number which is equal
	to the sum of the cubes of its digits)
	Note: input should be taken from the keyboard. Use a loop to calculate the Armstrong number from “start” to “end”. Also use loops to calculate the
          cube of a number. Do not use the Math.pow() function.
  */

import java.util.Scanner;

public class ArmstrongWithRange {
		
	public static int CalDigit(int num) {
		
		int digit = 0;
		while(num!=0){
			digit++;
			num/=10;
		}
		return digit;
	}

	public static int CalPow(int base , int pow) {
		int power = 1;
		
		for(int i = 1; i <= pow; i++) {
			power = base * power;
		}
		return power;
	}
	
	public static boolean ArmstrongNumber(int num) {
		int sum = 0;
		int n = num;
		int pow = CalDigit(n);

			 while(n!=0) {
				 int dig = n % 10;
				 int ans = CalPow(dig,pow);
				 sum = sum + ans;
				 n/=10;
			 }
			 return sum == num;	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Start number: ");
		int st = sc.nextInt();
		System.out.print("Enter the End number: ");
		int e = sc.nextInt();
		
		System.out.println("All armstrong number from "+st+" to "+e+" : ");
		for(int i = st; i <= e; i++) {
			if(ArmstrongNumber(i)) {
				System.out.print(i+" ");
			}
			Scanner.close();
			
		}
	}
}
