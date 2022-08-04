package subarray;

public class Kadane {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 8, -1, -3, 4, 8};
        System.out.println(maxSubArraySum(arr));

    }

    static int maxSubArraySum(int arr[]) {

        int size = arr.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                if (max_so_far < 0)
                    max_so_far = 0;
            }
        }
        return max_so_far;

    }

}
