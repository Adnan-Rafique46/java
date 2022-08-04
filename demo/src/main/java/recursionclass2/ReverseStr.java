package recursionclass2;

public class ReverseStr {

    public static String reverseStr(String str) {
        if (str.length() == 1) {
            return str;
        }
        char current = str.charAt(0);
        String next_Char = reverseStr(str.substring(1));
        return current + next_Char;
    }

    public static void main(String[] args) {
        String str = "adfkjdsfahh";
        String revrse = reverseStr(str);
        System.out.println(revrse);
    }
}

