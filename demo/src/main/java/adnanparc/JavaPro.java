package adnanparc;

public class JavaPro {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = i; j < high; j++) {
            if (arr[i] < pivot) {
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
            int pidx = partition(arr, low, high);
            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 8, 7, 99, 66, 50};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
