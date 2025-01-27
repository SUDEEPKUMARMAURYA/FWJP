//27-01-2025 Day 5

/*Q9. 1. Check whether the character is alphabet or not
      2. If character is alphabet then check if it is in lower case or upper case
	3. If it is in upper case then convert it into lower case
	4. Check if it is vowel or not.*/
 
import java.util.Scanner;
class Multichk 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter charecter: ");
		char ch =sc.next().charAt(0);
		
		boolean lower = (ch>='a' && ch <= 'z');
		boolean upper =  (ch>='A' && ch <= 'Z');
		boolean Alpha = upper || lower ;

		String result =  Alpha ? upper ? toLowerCase() :"Lower case.":"" ;
		//char result2 =  upper ? toLowerCase(ch): ch ;
        	//String result3 = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') ? "vowel." : "not vowel" ;
                

        	System.out.println("'"+ch+"'"+" is alphabet : "+Alpha);
		System.out.println("'"+ch+"'"+" is in "+result);
		//System.out.println("'"+ch+"'"+" --> "+result2);
		//System.out.println("'"+ch+"'"+" is  "+result3);
    }
}
