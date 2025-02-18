/*Lab 2
Q3. Wap to calculate the number of digits in a number(while)
	3484  =  4 digit*/

import java.util.Scanner;

class NoCount
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int digit= sc.nextInt();
		
		int n = digit;
		int count = 0;
		while(n!=0)
		{
			n=n/10;
			count++;
				
		}
		System.out.print("Number: "+digit+" ==>> Total digit : "+count);
	}
}