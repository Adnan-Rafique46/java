package ahmedcoding;

public class MergeSorting {
    public static void conqure(int arr[], int mid, int si, int ei) {
        int merged[] = new int[ei - si + 1];
        int idx1 = si;
        int inx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && inx2 <= ei) {
            if (arr[idx1] <= arr[inx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[inx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (inx2 <= ei) {
            merged[x++] = arr[inx2++];
        }
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + ei / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conqure(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = {11, 11, 22, 55, 88, 99, 6, 6, 3};
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
    }
}
