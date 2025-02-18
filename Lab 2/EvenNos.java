/*Lab 2
 Q1.2  Wap to print  even numbers(input number of elements from user).
	Enter number of elements : 5
	2  4 6 8 10*/

import java.util.Scanner;

class EvenNos {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of even numbers to print: ");
        int n = sc.nextInt();

        System.out.println("First " + n + " even numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print((2 * i) + " ");
        }
    }
}
