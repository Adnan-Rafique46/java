package ahmedcoding;

import java.util.ArrayList;

public class FindDuplicateArray {
    // Java implementation of the
    // above approach
    // Function to find the Duplicates,
    // if duplicate occurs 2 times or
    // more than 2 times in
    // array so, it will print duplicate
    // value only once at output
    static void findDuplicates(int arr[], int len) {
        // initialize ifPresent as false
        boolean ifPresent = false;
        // ArrayList to store the output
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    // checking if element is
                    // present in the ArrayList
                    // or not if present then break
                    if (al.contains(arr[i])) {
                        break;
                    }
                    // if element is not present in the
                    // ArrayList then add it to ArrayList
                    // and make ifPresent at true
                    else {
                        al.add(arr[i]);
                        ifPresent = true;
                    }
                }
            }
        }
        // if duplicates is present
        // then print ArrayList
        if (ifPresent == true) {
            System.out.print(al + " ");
        } else {
            System.out.print("No duplicates present in arrays");
        }
    }

    // Driver Code
    public static void main(String[] args) {

        int arr[] = {11, 11, 22, 22, 33, 34, 35, 36, 37, 38, 37, 3, 6, 6, 3, 66, 67, 99, 64};
        int n = arr.length;

        findDuplicates(arr, n);
    }
}

