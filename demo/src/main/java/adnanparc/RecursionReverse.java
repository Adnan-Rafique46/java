package adnanparc;

public class RecursionReverse {
    public static void reverseString(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n);
        reverseString(n - 1);
    }

    public static void main(String[] args) {
        int n = 9;
        reverseString(n);
    }
}
