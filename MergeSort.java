/*
Merge Sort is a Divide and Conquer algorithm.
The array is divided into two halves recursively until each part contains only one element.
Then, these halves are merged in a sorted manner to produce the final sorted array.

1️⃣ Divide – The array is split into two halves (left and right).
2️⃣ Conquer – Each half is sorted recursively using mergeSort().
3️⃣ Combine – The two sorted halves are merged together in sorted order.

Time Complexity: O(n log n) — at each level we merge n elements, and there are log n levels.
Space Complexity: O(n) — temporary list is used during the merge process.
*/

import java.util.*;

public class MergeSort {
    public static void mergeSort(List<Integer> list, int st, int end) {
        if (st < end) {
            int mid = st + (end - st) / 2;

            mergeSort(list, st, mid); // left half
            mergeSort(list, mid + 1, end); // right half

            merge(list, st, end, mid);
        }
    }

    public static void merge(List<Integer> list, int st, int end, int mid) {
        List<Integer> temp = new ArrayList<>();
        int i = st, j = mid + 1;

        while (i <= mid && j <= end) {
            if (list.get(i) <= list.get(j)) {
                temp.add(list.get(i));
                i++;
            } else {
                temp.add(list.get(j));
                j++;
            }
        }

        while (i <= mid) {
            temp.add(list.get(i));
            i++;
        }

        while (j <= end) {
            temp.add(list.get(j));
            j++;
        }

        for (int idx = 0; idx < temp.size(); idx++) {
            list.set(idx + st, temp.get(idx));
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 31, 35, 8, 32, 17));
        mergeSort(list, 0, list.size() - 1);

        System.out.println(list);
    }
}
