package adnanparc;

public class SeclectionSort {
    public static void main(String[] args) {
        int arr[] = {22, 5, 66, 5, 22, 69, 69};
        int min = 0, temp = 0;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {

                }
                min = j;

            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
