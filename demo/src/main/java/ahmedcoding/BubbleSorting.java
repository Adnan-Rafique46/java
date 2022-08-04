package ahmedcoding;

public class BubbleSorting {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {66, 99, 11, 22, 33, 44, 55, 66, 1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) ;
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        printArray(arr);

    }
}
