package minmaxnumber;

public class MinMaxNumber {
    /* Class Pair is used to return two values from getMinMax() */
    public static class Pair {
        int min;
        int max;
    }

    public static Pair getMinMax(int arr[], int n) {
        Pair minmax = new Pair();
        int i;
        /*If there is only one element then return it as min and max both*/
        if (n == 1) {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }
        /* If there are more than one elements, then initialize min
    and max*/
        if (arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }
        for (i = 2; i < n; i++) {
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }
        return minmax;
    }

    /* Driver program to test above function */
    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 14, 15};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
    }
}
