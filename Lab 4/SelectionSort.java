// lab 4 que-2 

import java.util.Scanner;



public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        selectionSort(arr);
   
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
 public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
           
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
   
