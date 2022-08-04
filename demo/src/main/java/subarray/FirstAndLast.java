package subarray;

public class FirstAndLast {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char el) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
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
        findOccurance(str, idx + 1, el);
    }

    public static void main(String[] args) {
        String str = "adkfaaffgah";
        char el = 'a';
        findOccurance(str, 0, 'a');
        System.out.println("First Occurance " + first);
        System.out.println("Last Occurance " + last);
    }
}
