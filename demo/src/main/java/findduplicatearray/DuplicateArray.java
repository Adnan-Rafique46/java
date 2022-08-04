package findduplicatearray;

import java.util.ArrayList;

public class DuplicateArray {
    public static void findDuplicates(int arr[], int len) {
        boolean ifPresent = false;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {

                    if (al.contains(arr[i])) {
                        break;
                    } else {
                        al.add(arr[i]);
                        ifPresent = true;
                    }
                }
            }
        }
        if (ifPresent == true) {

            System.out.print(al + " ");
        } else {
            System.out.print(
                    "No duplicates present in arrays");
        }
    }

    public static void main(String[] args) {
        int arr[] = {11, 11, 22, 22, 33, 34, 35, 36, 37, 38, 37, 3, 6, 6, 3, 66, 67, 99, 64};
        int n = arr.length;
        findDuplicates(arr, n);
    }
}


