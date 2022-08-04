package minmaxpair;

public class ArrayMinMax {
    static class Pair {
        int max;
        int min;

    }

    public static Pair getMinMax(int arr[], int n) {
        Pair minmax = new Pair();
        int i;
        if (n == 1) {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }
        if (arr[0] < arr[1]) {
            minmax.max = arr[1];
            minmax.min = arr[0];
        } else


            minmax.max = arr[0];
        minmax.min = arr[1];
        for (i = 2; i < n; i++) {

            if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            } else if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            }
        }
        return minmax;
    }

    public static void main(String[] args) {
        int arr[] = {12, 22, 33, 44, 444, 5555};
        int arr_Size = 6;
        Pair minmax = getMinMax(arr, arr_Size);
        System.out.println(minmax.min);
        System.out.println(minmax.max);
    }
}
