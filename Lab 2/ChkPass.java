/*Lab 2
Q11. Wap to check the password strength(password should contain at least one capital, small alphabet, number and special character.*/

import java.util.Scanner;

class ChkPass 
{	
	public static boolean passChk(String pass){
		boolean Uppercase = false;
		boolean Lowercase = false;
		boolean number = false;
		boolean Spacial = false;
		for(int i=0; i<pass.length(); i++){
			char ch = pass.charAt(i);

			if(ch>='A' && ch <='Z'){
				Uppercase = true;
			}
			else if(ch>='a' && ch<='z'){
				Lowercase=true;
			}
			else if(ch>='0' && ch<='9'){
				number=true;
			}
			else{
				Spacial=true;
			}
		}
		  return Uppercase && Lowercase&& number&& Spacial&& pass.length()>=8;
	}

		public static void main(String[] args) 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your password: ");
		String pass=sc.nextLine();
		
		if(passChk(pass)){
			System.out.print("Strong password");
		}
		else{
			System.out.print("Weak password");
		}
		
		}	
}



