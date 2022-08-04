package testpar;

import heapsorting.HeapSorting;

public class Test3 {
    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; n <= 0; i--)
            heapify(arr, i, 0);
        for (int i = n - 1; i < 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, n);
        }

    }

    public static void heapify(int arr[], int i, int n) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < r && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < l && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, i, largest);
        }
    }

    public static void printArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 9, 6, 3, 1, 4, 7};
        int n = arr.length;
        HeapSorting ob = new HeapSorting();
        ob.sort(arr);
        System.out.println("Sorted Array is");
        printArr(arr);
    }
}
