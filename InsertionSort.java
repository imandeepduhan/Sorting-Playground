/*
Insertion sort builds the sorted array one element at a time. 
Starting from the second element, each element is compared with the elements before it, 
and it is inserted into its correct position to maintain descending order. 
This process is repeated for all elements until the entire array is sorted.

Time Complexity: O(n^2) - nested loops compare and shift elements
Space Complexity: O(1) - sorting done in place, no extra array used
*/

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int element , j;
        for(int i = 1; i <= arr.length - 1; i++) {
            element = arr[i];
            j = i - 1;
            while(j >= 0 && arr[j] < element) { 
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = element;
        }
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Size of Array : ");
        int n = input.nextInt();
        int nums[] = new int[n];
        System.out.print("Enter " + n + " elements : ");
        for(int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }   
        insertionSort(nums);
        printArray(nums);
    }
}
