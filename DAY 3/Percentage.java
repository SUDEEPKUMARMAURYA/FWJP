/*Q3. Write a program to calculate and print the percentage of total
 marks where students has scored 430 markes out of 500.*/

class Percentage
{	
	public static void main(String args[])
	{
		int OM=430;
		int TM=500;
		int c=OM*100;
		double per=c/TM;
		
		

		System.out.println("Obtain Marks = "+OM);
		System.out.println("Total Marks = "+TM);
		System.out.println("Percentage = "+per+" %");
		
	}
}