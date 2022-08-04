package adnanparc;

public class QuickSortParc {
    public static int partiation(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; i < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pidx = partiation(arr, low, high);
            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 4, 6, 9, 7, 12, 25};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");

        }
        System.out.println();

    }
}
