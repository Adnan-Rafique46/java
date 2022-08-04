package ahmedcoding;

public class SeclectionSorting {
    public static void main(String[] args) {
        int arr[] = {11, 22, 33, 4, 5, 8, 9, 66, 33, 41, 25};
        int temp = 0, min = 0;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++) {
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
