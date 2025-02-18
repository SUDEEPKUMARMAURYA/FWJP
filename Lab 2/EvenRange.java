/*Lab 2
 Q1. Wap to print all even no from the given nos.*/
 
import java.util.Scanner;

public class EvenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting of the range: ");
        int st  = sc.nextInt();
        System.out.print("Enter the ending of the range: ");
        int end = sc.nextInt();

        System.out.println("Even numbers in the given range:");
        for (int n = st; n <= end; n++) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }

    }
}
