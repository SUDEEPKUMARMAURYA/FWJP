//27-01-2025 Day 5

//Q6. Wap to print pass or fail according to marks.
 
import java.util.Scanner;
class StuStatus 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter obtain marks: ");
		int om =sc.nextInt();
		
		System.out.print("Enter total marks: ");
		int tm =sc.nextInt();

		float per = om*100/tm;

        	String result = per>=33?"pass.":"fail" ;
                

        	System.out.println("Student "+result);
    }
}
