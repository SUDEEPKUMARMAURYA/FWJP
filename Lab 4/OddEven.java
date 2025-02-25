/*Lab 3
   Q3. Write a program to count and print the total number of odd and even numbers from user inputs. Program will ask for 
   user inputs in a loop. Loop will terminate if -1 is entered as input.
 */


import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Count Odd Even on given range ");
		
		int choice = -1;
		int even = 0;
		int odd = 0;
		
		while(true) {
		System.out.print("Enter the Start Point: ");
		int start = sc.nextInt();
		System.out.print("Enter the End Point: ");
		int end = sc.nextInt();
		
		for(int i = start; i <= end; i++) {
			if(i%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Total even number from "+start+" to "+end+" = "+even);
		System.out.println("Total odd number from "+start+" to "+end+" = "+odd);
		
		
		 System.out.println();
         
		 System.out.print("Press -1 to terminate the loop : ");
         choice = sc.nextInt();
         
         if (choice == -1) {
        	 System.out.print("Loop terminated ! ");
             break;
         }
		}
	}
}
