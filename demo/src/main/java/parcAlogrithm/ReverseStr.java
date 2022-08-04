package parcAlogrithm;

public class ReverseStr {
    public static String reverseStr(String str) {
        if (str.length() == 1) {
            return str;
        }
        char current = str.charAt(0);
        String nextCurrent = reverseStr(str.substring(1));
        return current + nextCurrent;

    }

    public static void main(String[] args) {
        String str = "adfgaacah";
        String ans = reverseStr(str);
        System.out.println(str);
    }
}
