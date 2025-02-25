/* Lab 3
 Q4. Wap to perform some operations by giving user options to perform each operation.
    1. check prime number
	2. check Armstrong number
	3. print fibonacci series
	4. check even number
	5. exit
 */

import java.util.Scanner;

public class MultiOpration {
	public static boolean PrimeChk(int num) {
		if(num==0 || num==1) {
			return false;
		}
		for(int i = 2; i*i < num; i++ ) {
			if(num%i!=0) {
				return true;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	public static void Even(int num) {
		if(num % 2 == 0) {
			System.out.println(num+" is an Even number.");
		}
		else {
			System.out.println(num+" is not Even number.");
		}
	}
	
	public static void Fibonacci(int num) {
		int a = 0;
		int b = 1;
		
		System.out.println("Fibonacci Series: ");
		System.out.print(a+" "+b+" ");
		for(int i = 0; i<=num; i++ ) {
			int sum = a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
		
	}
	
	public static int DigitCal(int num) {
		
		int count = 0;
		while(num!=0){
			count++;
			num = num/10;
		}
		return count;
	}
	
	public static int PowCal(int base, int pow) {
		
		int res = 1;
		for(int i =1; i <=pow; i++) {
			res = base * res;
		}
		return res;
	}
	
	public static int Armstrong(int num) {
		int sum = 0;
		int pow = DigitCal(num); // 3 for 153
		
		while(num!=0) {
			int digit = num % 10; // 3
			int ans = PowCal(digit,pow);
			sum = sum + ans ;
			num = num/10;
		}
		return sum;
	}
	
	

	public static void main(String[] args) {
		int op;
		Scanner sc = new Scanner(System.in);	
			
		
		while(true) {
			
			System.out.println("1. Check prime number.");
			System.out.println("2. Check Armstrong number.");
			System.out.println("3. Print fibonacci series");
			System.out.println("4. Check even number");
			System.out.println("0. Exit");
			System.out.println();
			System.out.println("Select your option");
			op = sc.nextInt();
			
			switch(op) {
				case 1:	
					System.out.print("Enter a number: ");
					int num = sc.nextInt();
					
					boolean res = PrimeChk(num);
					if(res) {
						System.out.println(num+" is a prime number.");
					}
					else {
						System.out.println(num+" is not a prime number.");
					}
					System.out.println();
					System.out.println("=========================>>");
					break;
				
				case 2:
					System.out.print("Enter a number: ");
					int n = sc.nextInt();
					
					int rest = Armstrong(n);
					if(rest == n) {
						System.out.println(n+" is an Armstrong number.");
					}
					else {
						System.out.println(n+" is not an Armstrong number.");
					}
					
					System.out.println();
					System.out.println("=========================>>");
					break;
				case 3:
					System.out.print("Enter a number: ");
					int no = sc.nextInt();
					
					Fibonacci(no);
					System.out.println();
					System.out.println("=========================>>");
					break;
				case 4:
					System.out.print("Enter a number: ");
					int numb = sc.nextInt();
					
					Even(numb);
					System.out.println();
					System.out.println("=========================>>");
					break;
				case 0:
					System.out.println("Exit !");
					return;
				default:
					System.out.println("Invalid selection try again !");
			}
			
			
		}
	}

}
