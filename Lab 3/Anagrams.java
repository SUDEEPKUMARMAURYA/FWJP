/* Lab - 8
 	Q8. Check if Two Strings are Anagrams Write a program to check if two strings are anagrams (contain the same characters in a different order).
		Example:
		Input: "listen", "silent" → Output: true
 */

import java.util.Scanner;

public class Anagrams {
  
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);

  System.out.println("enter string 1 : ");
  String str1=sc.nextLine();
  System.out.println("enter string 2 : ");
  String str2=sc.nextLine();

  int arr[]=new int[26];
  int i=0;
  while(i<str1.length()&&i<str2.length())
  {  int ind1=str1.charAt(i)-'a';
     arr[ind1]++;
     int ind2=str2.charAt(i)-'a';
     arr[ind2]--;
     i++;
  }

  for(int j=0;j<26;j++)
  {
     if(arr[j]!=0)
     {
       System.out.println("false : strings are not anagrams");
       return ;
     }

  }
  System.out.println("true : string are anagrams ");

  

}

}