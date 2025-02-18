/*Lab 2
Q9. Wap to calculate the sum of first 10 natural numbers*/

import java.util.Scanner;

class SumNatural{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the starting number : ");
		int num=sc.nextInt();
		
		int sum=0;
		for(int i=num;i<=num+10;i++){
			sum=sum+i;
		}
		System.out.println("Sum of first 10 natural no= "+sum);
		
		
	}
}