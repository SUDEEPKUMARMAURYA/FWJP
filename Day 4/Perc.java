/*Q7. write a program to find the percentage of marks. Input marks and total marks.*/

import java.util.Scanner;

class Perc
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the obtain marks: ");
		int om = sc.nextInt(); 
		
		System.out.print("Enter the total marks: ");
		int to = sc.nextInt();

		int per = om * 100;
		float perc = per/to;

		System.out.println("Obtain marks = "+ om);
		System.out.println("Total marks = "+ to);
		System.out.println("Percentage = "+ perc);
	}
}