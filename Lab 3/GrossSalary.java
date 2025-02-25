/* Lab 3
  Q2. Write a program to calculate the gross salary of a group of employees. Basic salary should be taken from the user. 
 If the basic salary is greater than 15000 ,HRA=20% and DA=60% will be given, else HRA=3000 and DA 70% will be given to the employee
Note:Input of basic salary will be taken from the keyboard. After calculating the salary of one employee, the program will ask for the user's choice as
int. If “-1” is entered then the loop will continue and the loop will exit for other int inputs.
 */
import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int op;
		do {	
				System.out.print("Enter the basic salary: ");
				int salary = sc.nextInt();
		
				double gs,hra,da;
				if(salary >15000){
						hra = (salary*0.20);
				        da =  (salary*0.60);
				}
				else {
					 hra = 3000;
					 da =  (salary*0.70);
				}
				gs = salary + hra + da;
				System.out.print("Gross Salary: "+ gs);		
			
				System.out.println();
			System.out.print("Enter -1 to continue or any other number to exit: ");;
			op = sc.nextInt();
		}while(op==-1);
		System.out.print("Loop terminated ! ");
	}

}
