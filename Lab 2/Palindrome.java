/*Lab 2
Q6. Wap to check whether a number is palindrome or no When a  number is equals to its reverse number, then it is a palindrome number.  (for)*/

import java.util.Scanner;

class Palindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		
		int n = num; 
		int digit=0;
		int res=0;
		for(; n!=0; n/=10){
			digit=n%10;
			res=digit+res*10;
		}
		System.out.println("Number = "+num+"\n"+"Reverse = "+res);
		if(num==res){
			System.out.println("'"+num+"'"+" is a palindrome number.");
		}
		else{
			System.out.println("'"+num+"'"+" is not a palindrome number.");
		}
		
	}
}