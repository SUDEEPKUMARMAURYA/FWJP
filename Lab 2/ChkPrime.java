/*Lab 2
Q8. Wap to check whether a number is prime or not*/

import java.util.Scanner;

class ChkPrime 
{
	public static boolean isPrime(int num){
		if(num<=1){
			return false;
		}
		for(int i=2; i*i<=num; i++){
		if(num%i==0){
			return false;
		}
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
	
		if(isPrime(num)){
			System.out.println(num+" is a prime number.");
		}
		else{
			System.out.println(num+" is not a pri,e number.");
		}
		
		
	}	
}



