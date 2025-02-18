/*Lab 2
Q10. Wap to print the multiplication table of a number given by user*/

import java.util.Scanner;

class Table{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the starting number : ");
		int num=sc.nextInt();
		
		int mul=1;
		System.out.println("Table of "+num);
		for(int i=1;i<=10;i++){
			mul=num*i;
		System.out.println(num+"x"+i+"= "+mul);
		}
		
		
		
	}
}