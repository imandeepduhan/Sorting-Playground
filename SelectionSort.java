/*
Approach:
This program implements the Selection Sort algorithm to sort an array in ascending order. 
In each iteration, the smallest element from the unsorted part of the array is selected 
and swapped with the first unsorted element. This process continues until the entire array becomes sorted. 
Selection Sort works by repeatedly finding the minimum element and placing it in its correct position.

Time Complexity: O(n^2) - two nested loops are used (for each element, we scan the remaining array)
Space Complexity: O(1) - sorting is done in place, requiring no extra memory
*/

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int indexOfMin, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            indexOfMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexOfMin]) {
                    indexOfMin = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[indexOfMin];
            arr[indexOfMin] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Size of Array : ");
        int n = input.nextInt();

        int nums[] = new int[n];
        System.out.print("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        selectionSort(nums);
        printArray(nums);
    }
}
