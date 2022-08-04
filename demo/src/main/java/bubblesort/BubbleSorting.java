package bubblesort;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {10, 50, 20, 30, 5};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j + 1];


                }
            }
        }

    }
}
