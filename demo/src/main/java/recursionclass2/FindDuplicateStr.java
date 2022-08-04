package recursionclass2;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateStr {
    public static void findDuplicateStr(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] currentChar = str.toCharArray();
        for (char c : currentChar) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);

            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String str = "adkfjlkjsmm";
        findDuplicateStr(str);

    }
}
