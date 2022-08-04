package practiesesjava;

public class FirstAndLast {
    public static int first = -1;
    public static int last = -1;

    public static void findindexes(String str, char el, int idx) {
        if (idx == str.length()) {
            return;
        }
        if (str.charAt(idx) == el) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findindexes(str, el, idx + 1);
    }

    public static void main(String[] args) {
        String str = "adfaasfgah";
        char el = 'a';
        findindexes(str, el, 0);
        System.out.println("First Occurance" + first);
        System.out.println("Last Occurance" + last);

    }
}
