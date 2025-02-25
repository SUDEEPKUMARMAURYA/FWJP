/* Lab - 4 
1.Write a Java program that takes an array of integers as input from the user and
then calculates the sum and average of the elements in the array. The program
should output the sum and average.*/

import java.util.Scanner;

class SumAvgArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter the elements of Array: ");
		for(int i = 0; i < size; i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("The Array: ");
		for(int i = 0; i < size; i++)
		{
			 System.out.print(arr[i] + " ");
		}
		System.out.println();

		// calculate the sum of array
		int sum = 0;
		for(int i = 0; i < size; i++)
		{
			sum+=arr[i];
		}
		
		//calculate the average of array

		float avg = sum/size;

		System.out.println("Sum of array elements: " +sum);
		System.out.println("Avg of array elements: " +avg);
		
		
	}
}
