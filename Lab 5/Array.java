
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.print("Enter the elements of Array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array: ");
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		int min = arr[0];
		int max = arr[0];
		for(int i = 0; i < size; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("Largest no in Array: "+max);
		System.out.println("Smallest no in Array: "+min);

	}

}
