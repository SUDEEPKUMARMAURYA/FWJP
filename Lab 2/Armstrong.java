/*Lab 2
Q4. Wap to check the number is an armstrong number or not   
	eg 1^3+5^3+3^3=153*/

import java.util.Scanner;

public class Armstrong 
{
	public int countDigits(int num)  
	{
		int digits=0; 
		while(num!=0) 
		{
			digits++;
			num/=10;  
		}
		
		
		return digits;
	}
	
	public int calculatePower(int n, int p)
	{
		int result=1;
		for(int i=1;i<=p;i++)
		{
			result*=n;
		}
		
		return result;
	}
	public boolean checkArmstrong(int num)
	{
		int countDigits = countDigits(num); 
		int sum=0;
		for(int x=num;x!=0;x/=10) 
		{
			int digit = x%10; 
			int result = calculatePower(digit,countDigits);
			sum+=result;
		}

		if(sum == num)
			return true;			
		else
			return false;
	}
	
	public static void main(String[] args) 
	{
		Armstrong ad=new Armstrong();
	
		Scanner sc=new Scanner(System.in);
		
		
	
			System.out.println("Enter a number : ");
			int num=sc.nextInt();
			if(ad.checkArmstrong(num) == true)
				System.out.println(num+" is an Armstrong number");
			else
				System.out.println(num+" is not an Armstrong number");

		
	}	
}



