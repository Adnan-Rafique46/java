package test;

public class FirstAndLast {
    public static int first = -1;
    public static int last = -1;

    public static void first_LastOccurance(String str, char el, int idx) {
        if (str.length() == idx) {
            return;
        }
        char current = str.charAt(idx);
        if (str.charAt(idx) == el) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }

        }
        first_LastOccurance(str, el, idx + 1);


    }

    public static void main(String[] args) {
        String str = "adgffaaagah";
        char el = 'a';
        first_LastOccurance(str, el, 0);
        System.out.println("First Occurance" + first);
        System.out.println("last Occurance" + last);
    }
}
