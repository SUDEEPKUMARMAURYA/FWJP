/* Date- 10/02/2025
   Pattern Assignment -2 */

import java.util.Scanner;

class Pattern2
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row : ");
		int row = sc.nextInt();

		for(int i = 1; i <= row; i++)
		{
			for(int j = i; j <=row; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}