/*Q4. Write a program to add an integer variable having value 5 and a double variable having value 6.2.*/

 class Idsum {
    public static void main(String[] args) {
     
        int a = 5;
	  double b = 6.2;
	  double sum = a+b;
	  int sum1 = a+(int)b;

      
        System.out.println("int a = "+ a);
	  System.out.println("double b = "+ b);
        System.out.println("The sum of int type = " + sum1+"\n");
	  System.out.println("The sum of double type = " + sum);
        
        
    }
}
