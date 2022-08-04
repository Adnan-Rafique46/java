package adnanparc;

public class ReverseStr {
    public static String reverseStr(String str) {
        if (str.length() == 1) {
            return str;
        }
        char currentChar = str.charAt(0);
        String nextString = reverseStr(str.substring(1));
        return nextString + currentChar;
    }

    public static void main(String[] args) {
        String str = "akdfjlkjfsdfk";
        String ans = reverseStr(str);
        System.out.println(ans);

    }
}
