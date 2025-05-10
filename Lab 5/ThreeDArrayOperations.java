/* Lab 

 	1. Write a Java program that demonstrates various operations on a 3D array: 
      -> 1. Initializing the 3D array with random values. 
      -> 2. Finding the maximum value in the array.  
      -> 3. Calculating the average of all elements. 
      -> 4. Displaying the array. 
 * 
 */
import java.util.Random;
import java.util.Scanner;


public class ThreeDArrayOperations {
		    
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        
		        int x = 3, y = 3, z = 3; 
		        
		        System.out.print("Do you want to enter custom dimensions? (yes/no): ");
		        String choice = sc.next().toLowerCase();
		        
		        switch (choice) {
		            case "yes":
		                System.out.print("Enter dimensions (x y z): ");
		                x = sc.nextInt();
		                y = sc.nextInt();
		                z = sc.nextInt();
		                break;
		            case "no":
		                System.out.println("Using default dimensions: 3x3x3");
		                break;
		            default:
		                System.out.println("Invalid input, using default dimensions: 3x3x3");
		        }
		        
		        int[][][] array = new int[x][y][z];
		        Random rand = new Random();

		        // 1. Initializing the 3D array with random values (0 to 99)
		        for (int i = 0; i < x; i++) {
		            for (int j = 0; j < y; j++) {
		                for (int k = 0; k < z; k++) {
		                    array[i][j][k] = rand.nextInt(100); 
		                }
		            }
		        }

		        // 2. Finding the maximum value in the array
		        int max = Integer.MIN_VALUE;
		        for (int[][] matrix : array) {
		            for (int[] row : matrix) {
		                for (int num : row) {
		                    if (num > max) {
		                        max = num;
		                    }
		                }
		            }
		        }

		        // 3. Calculating the average of all elements
		        int sum = 0, count = 0;
		        for (int[][] matrix : array) {
		            for (int[] row : matrix) {
		                for (int num : row) {
		                    sum += num;
		                    count++;
		                }
		            }
		        }
		        double average = (double) sum / count;

		        // 4. Displaying the 3D array
		        System.out.println("3D Array:");
		        for (int i = 0; i < x; i++) {
		            System.out.println("Table: " + (i + 1));
		            for (int j = 0; j < y; j++) {
		                for (int k = 0; k < z; k++) {
		                    System.out.print(array[i][j][k] + " ");
		                }
		                System.out.println();
		            }
		            System.out.println();
		        }

		        System.out.println("Maximum Value: " + max);
		        System.out.println("Average Value: " + average);
		        
		    }
		

	

}
