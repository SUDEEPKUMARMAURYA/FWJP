//27-01-2025 Day 5

//Q4.
 
import java.util.Scanner;
class TernaryDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two value: ");

		int a =sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a>b ? "A is greater : " : "B is greater : ");

		int result = a>b ? a-b : b-a;

		System.out.println("Result : "+result);
	}
}