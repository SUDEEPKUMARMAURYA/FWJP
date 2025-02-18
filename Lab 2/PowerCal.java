/*Lab 2
Q4. Wap to calculate the power of a variable if the number 
and exponent value is given by the user    ( do while)  
eg 2^3=8*/

import java.util.Scanner;

class PowerCal{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();	

		System.out.print("Enter the exponent: ");
		int exp=sc.nextInt();

		int ans=1;
		int pow=exp;
		do{
			ans=ans*num;
			pow--;	
		}
		while(pow>0);
		System.out.print("Number: "+num+"^"+exp+" --> Anwer= "+ans);

	}
}