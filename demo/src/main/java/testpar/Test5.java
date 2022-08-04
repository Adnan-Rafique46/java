package testpar;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test5 {
    public static String sortedStr(String str) {
        char current[] = str.toCharArray();
        Arrays.sort(current);
        return new String(current);
    }

    public static void main(String[] args) {
        String str = "i love pakistan";
        String outputStr = sortedStr(str);
        System.out.println("InputStr" + str);
        System.out.println("OutputStr" + outputStr);
    }
}
