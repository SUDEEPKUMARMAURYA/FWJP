//27-01-2025 Day 5

//Q3. Wap to check if a person is eligible to vote or not.
 
import java.util.Scanner;
class Vote 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age =sc.nextInt();

        String result = age >= 18? "eligible to vote." : "not eligible to vote." ;
                

        System.out.println("Person is "+result+"\n"+"Thank You");
    }
}
