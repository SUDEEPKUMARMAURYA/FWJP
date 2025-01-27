//27-01-2025 Day 5

//Q7. Wap to check whether a character is vowel or not.
 
import java.util.Scanner;
class Vowelchk 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter charecter: ");
		char v =sc.next().toLowerCase().charAt(0);

        	String result = (v=='a'||v=='e'||v=='i'||v=='o'||v=='u') ? "vowel." : "not vowel" ;
                

        	System.out.println("'"+v+"'"+" is a "+result);
    }
}
