/* Date- 10/02/2025
   Pattern Assignment -9 */

import java.util.Scanner;

class Pattern9
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row : ");
		int row = sc.nextInt();

		for(int i = 1; i <=row; i++)
		{
			for(int j = 1; j <=row+i-1; j++)
			{
				if(j>=row-i+1 && j<=row+i-1){
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}



		
	