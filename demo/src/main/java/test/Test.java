package test;

public class Test {
    public static void subSuquance(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        subSuquance(str, idx + 1, newString + str.charAt(idx));
        subSuquance(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "ada";
        subSuquance(str, 0, "");

    }
}

