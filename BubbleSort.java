/*
Defination --> Bubble Sort is a simple sorting algorithm that repeatedly compares and swaps adjacent elements if they are in the wrong order. This process continues until the entire array is sorted.

Time Complexity:
Best Case: O(n)
Average Case: O(n^2)
Worst Case: O(n^2)

Space Complexity: O(1)
*/
import java.util.*;
public class BubbleSort {
    public static void printArray(int[] arr) {
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter " + size + " elements :");
        for(int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int length = arr.length;
        System.out.print("Original Array : ");
        printArray(arr);
        bubbleSort(arr);
        System.out.print("Sorted Array : ");
        printArray(arr);
    }
}
