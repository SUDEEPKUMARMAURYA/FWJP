/* Lab 6
  1.Create a Java program that acts as a simple calculator.
 	The program should prompt the user to enter two numbers and an operator (+, -,*, /).
 	Perform the corresponding calculation based on the operator.
 	Handle potential exceptions, such as division by zero or invalid operator input.
 	Display the result or an appropriate error message.

 */



import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
           
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            
            System.out.print("Enter operator : ");
            char op = sc.next().charAt(0);
            
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            
            double result;
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Error: Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Error: Invalid operator.");
            }
            
            System.out.println("Result: " + result);
        } catch (Exception ae) {
            System.out.println(ae.getMessage());
        }
    }
}