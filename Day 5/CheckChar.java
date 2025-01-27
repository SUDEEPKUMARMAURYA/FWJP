//27-01-2025 Day 5

//Q4. Wap to check whether  a character is in lower case or upper case.
 
import java.util.Scanner;
class CheckChar 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a charecter: ");
		char ch =sc.next().charAt(0);

        String result = (ch >= 65 && ch<=90)? "upper case." : "lower case." ;
                

        System.out.println("'"+ch+"'"+" is "+result+"\n"+"Thank You");
    }
}
