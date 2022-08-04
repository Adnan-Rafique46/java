package adnanparc;

import java.util.ArrayList;

public class DuplicateArr {
    public static void printDupliArr(int arr[], int leg) {
        boolean isPresent = true;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < leg - 1; i++) {
            for (int j = i + 1; j < leg; j++) {
                if (arr[i] == arr[j]) {
                    if (al.contains(i)) {
                        break;
                    } else {
                        al.add(i);
                        isPresent = true;
                    }
                }
            }
        }
        if (isPresent == true) {
            System.out.println(al + "");
        } else {
            System.out.println("Array are not found in the list");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 8, 5, 6, 9, 3, 4};
        int n = arr.length;
        printDupliArr(arr, n);
    }
}
