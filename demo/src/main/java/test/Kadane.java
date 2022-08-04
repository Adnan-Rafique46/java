package test;

public class Kadane {
    public static int max_ans(int arr[]) {
        int size = arr.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        if (max_so_far < 0) {
            max_so_far = 0;
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int arr[] = {2, 8, 5, 9, 4 - 5, -8, 9};
        System.out.println(max_ans(arr));
    }
}
