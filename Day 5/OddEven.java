//27-01-2025 Day 5

//Q8. Wap to check whether a number is even or odd.
 
import java.util.Scanner;
class OddEven 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num =sc.nextInt();

        	String result = num%2==0 ? "even" : "odd" ;
                

        	System.out.println("'"+num+"'"+" is a "+result+" number.");
    }
}
