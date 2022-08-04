package binarysearching;

public class BainarySeraching {
    public static void main(String[] args) {
        int[] arr = {1, 22, 33, 44, 55, 66, 77, 88, 99};
        int item = 44;
        int li = 0;
        int hi = arr.length - 1;
        int mi = (li + hi) / 2;
        while (li <= hi) {
            if (arr[mi] == item) {
                System.out.println("this is break point" + mi);
                break;
            } else if (arr[mi] < item) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li + mi) / 2;
        }
        if (li > hi) {
            System.out.println("element not found");
        }
    }
}

