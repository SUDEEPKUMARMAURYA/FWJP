/*Lab 2
Q12. Wap to reverse a string and check whether it is palindrome or not.*/

import java.util.Scanner;

class ReveseStr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		String res = str;
		String s = "";
		
		for(int i = res.length()-1; i >=0 ; i--)
		{
			s = s + res.charAt(i); 	 
		}
		
		System.out.println("Reverse string: "+s);
		if(str.equals(s))
		{
			System.out.print(str+" is a Palindrome.");
		}
		else
		{
			System.out.print(str+" is not Palindrome.");
		}
		

	}
	
} 





