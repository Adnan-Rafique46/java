package SortedStr;

public class RevArray {
    static class GFG {
        static void reverseArray(int arr[], int start, int end) {
            int temp;
            while (start < end) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;

            }
        }

        static void printArray(int arr[], int size) {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        }

        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 10};
            printArray(arr, 8);
            reverseArray(arr, 0, 8);
            printArray(arr, 7);


        }

    }
}