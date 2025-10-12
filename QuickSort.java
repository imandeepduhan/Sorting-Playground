/*
Quick Sort is a Divide and Conquer algorithm.
It works by selecting a pivot element (in this code, the last element).
Then it partitions the array so that:
    - Elements smaller than pivot are on the left side.
    - Elements greater than pivot are on the right side.
After partitioning, the same process is applied recursively
to the left and right subarrays until the array is fully sorted.

Time Complexity:
- Best Case: O(n log n)
- Average Case: O(n log n)
- Worst Case: O(n^2)  (when the array is already sorted or reverse sorted)

Space Complexity:
- O(log n)  (due to recursive function calls)
*/

import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] arr, int st, int ed) {
        if (st < ed) {
            int pivIndex = partition(arr, st, ed);
            quickSort(arr, st, pivIndex - 1);  // left half
            quickSort(arr, pivIndex + 1, ed);  // right half
        }
    }

    public static int partition(int[] arr, int st, int ed) {
        int idx = st - 1;
        int pivot = arr[ed];

        for (int j = st; j < ed; j++) {
            if (arr[j] <= pivot) {
                idx++;
                int temp = arr[j];
                arr[j] = arr[idx];
                arr[idx] = temp;
            }
        }

        idx++;
        int temp = arr[ed];
        arr[ed] = arr[idx];
        arr[idx] = temp;

        return idx;
    }

    public static void printArray(int[] arr) {
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = input.nextInt();
        int[] nums = new int[n];

        System.out.print("Enter elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        quickSort(nums, 0, nums.length - 1);
        System.out.println("Sorted Array:");
        printArray(nums);
    }
}
