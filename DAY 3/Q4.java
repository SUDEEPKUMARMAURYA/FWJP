/*Q4. Write a program to calculate and print the area of circle where the value of pi=3.14 and radius(input).*/

import java.util.Scanner;

class Q4
{
	public static void main(String args[])
	{	
		float pi=3.14f;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius : ");
		float r = sc.nextFloat();
		float area = pi*r*r;

		System.out.println("Area of circle = "+area + " sqr units");
	}
}