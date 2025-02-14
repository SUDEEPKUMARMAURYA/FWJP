/* Date- 10/02/2025
   Pattern Assignment -1 */

import java.util.Scanner;

class Pattern1
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row : ");
		int row = sc.nextInt();

		for(int i = 1; i <= row; i++)
		{
			for(int j = 1; j <=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}