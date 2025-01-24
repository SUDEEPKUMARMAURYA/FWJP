/*Q6. Write a program to assign a value of 100.235 to a double variable and then convert it to int.*/

class Conv
{
	public static void main(String args[])
	{
		double a = 100.235d;
		int b = (int)a;
		
		System.out.println("Double value is "+ a);
		System.out.println("Integer value is "+ b);
	}
}