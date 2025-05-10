/* Lab 2
 
 	2.Write a Java program that performs addition of two matrices. The program should use a 2D array of wrapper class objects (e.g., Integer) 
 	for the matrix elements. Take two matrices as input, perform the addition operation, and display the resulting matrix.
 */



import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        
        Integer[][] matrix1 = new Integer[r][c];
        Integer[][] matrix2 = new Integer[r][c];
        Integer[][] resultMatrix = new Integer[r][c];

       
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

       
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

       
        System.out.println("Result Matrix after Addition:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

     
    }
}
