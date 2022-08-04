package recursion3;

public class Test2 {
    public static String removeDuplicateString(String str, int idx, boolean present[]) {
        if (idx == str.length()) {
            return "";
        }
        char current = str.charAt(idx);
        if (present[current - 'a']) {
            return removeDuplicateString(str, idx + 1, present);
        } else {
            present[current - 'a'] = true;
            return current + removeDuplicateString(str, idx + 1, present);
        }
    }

    public static void main(String[] args) {
        String str = "adnanrafiquearain";
        boolean present[] = new boolean[str.length()];
        System.out.println(removeDuplicateString(str, 0, present));

    }
}
