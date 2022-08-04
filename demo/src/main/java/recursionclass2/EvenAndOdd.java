package recursionclass2;

public class EvenAndOdd {
    public static void pritnArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 9;
        int arr[] = {1, 2, 3, 4, 5, 6, 9, 8, 7};
        int evenSize = 0;
        int oddSize = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                evenSize++;
            else
                oddSize++;

        }
        int k = 0, j = 0;
        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                even[k++] = arr[i];
            else
                odd[j++] = arr[i];
        }
        System.out.println("Even Array contain:");
        pritnArr(even);
        System.out.println("Odd Array contain:");
        pritnArr(odd);
    }
}
