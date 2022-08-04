package testpar;

import heapsorting.HeapSorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }
        findSubset(n - 1, subset);
        subset.add(n);
        findSubset(n - 1, subset);
        subset.remove(subset.size() - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        findSubset(n, new ArrayList<>());
    }
}
