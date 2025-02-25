/* Lab 3
 	Q6. Valid Parentheses Checker Given a string containing just the characters ()[]{}, determine if it is valid.
		Example:
		Input: "({[]})" → Output: true
		Input: "([)]" → Output: false 
 */

import java.util.Scanner;

public class BracketValidation
{
	 public static void main(String[] args) {
	      
		    Scanner sc=new Scanner(System.in);
		    System.out.print("Enter the string : ");
		    String str=sc.next();
		    String temp="";
		    for(int i=0;i<str.length();i++)
		    { char c =str.charAt(i);
		      if(c=='{'||c=='['||c=='(')
		      {
		         temp=temp+c;
		      }
		      else{
		        if(c=='}'||c==']'||c==')')
		      {  
		        int len=temp.length()-1;
		        if(len==-1)
		        {
		           System.out.println("false : Not valid brackets");
		           return;
		        }
		        char lst=temp.charAt(len);
		        if((c=='}'&&lst=='{')||(c==']'&&lst=='[')||(c==')'&&lst=='('))
		        {
		          temp= temp.substring(0,len);
		        }
		        else
		          {
		            System.out.println("false : Not valid brackets ");
		            return;
		          }
		      }
		    }
		    }
		    if(temp.length()==0)
		    System.out.println("true : valid brackets");
		  
		   }
}