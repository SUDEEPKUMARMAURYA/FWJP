/*Lab 2
Q5  :  wap to reverse digits of a number like 1243   will become 3421. (for)*/

import java.util.Scanner;

class Reverse{
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
	}
}