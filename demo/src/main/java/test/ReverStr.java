package test;

public class ReverStr {
    public static String reverseStr(String str) {
        if (str.length() == 1) {
            return str;
        }
        char current = str.charAt(0);
        String nextString = reverseStr(str.substring(1));
        return nextString + current;
    }

    public static void main(String[] args) {
        String str = "asfldsjfklaasdk";
        String ans = reverseStr(str);
        System.out.println(ans);

    }
}
