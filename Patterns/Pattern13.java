/* Date- 10/02/2025
   Pattern Assignment -13 */

import java.util.Scanner;

class Pattern13
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row : ");
		int row = sc.nextInt();

		for(int i = 1; i <=row; i++)
		{
			for(int j = 1; j <=2*row; j++)
			{
				if(j>i && j<=2*row-i){
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}



		
	