//27-01-2025 Day 5

//Q5. Wap to check whether a number is negative or positive or zero..
 
import java.util.Scanner;
class CheckNum 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num =sc.nextInt();

        String result = num>0? "positive number.":num<0 ?"negative number.":"zero" ;
                

        System.out.println("'"+num+"'"+" is a "+result+"\n"+"Thank You");
    }
}
