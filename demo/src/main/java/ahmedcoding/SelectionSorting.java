package ahmedcoding;

public class SelectionSorting {
    public static void main(String[] args) {
        int arr[] = {34, 7, 2, 5, 8, 9, 6, 66, 88, 99};
        int min = 0, temp = 0;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;

                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
