/*Lab 2
Q13. Wap to count the number of characters in a string.*/

import java.util.Scanner;

class StrCount
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		
		int count = 0;
		for(int i = 0; i < str.length(); i++)
		{
			count++; 	 
		}
		
		System.out.println("Number of characters: "+count);

	}
	
} 





