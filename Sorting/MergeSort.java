package Sorting;

public class MergeSort {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        // Base case: If the start index is greater than or equal to the end index, return
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // Sort the left part
        mergeSort(arr, mid + 1, ei); // Sort the right part
        merge(arr, si, mid, ei); // Merge the sorted parts
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // Iterator for left part
        int j = mid + 1; // Iterator for right part
        int k = 0; // Iterator for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from the left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted elements back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        print(arr); // Output should be: 2 3 5 6 8 9
    }
}
