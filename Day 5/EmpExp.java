//27-01-2025 Day 5

//Assignment 2.
 
import java.util.Scanner;
class EmpExp 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter experience in year: ");
		int exp =sc.nextInt();

		System.out.print("Enter salary in rupees: ");
		
		int salary = sc.nextInt();
		int sal1=salary + (salary*20)/100;
		int sal2=salary+(salary*10)/100;

        int result = exp > 20? sal1 : sal2 ;
                

        System.out.println("Experience : "+exp + "\n"+"Salary : "+result);
    }
}
