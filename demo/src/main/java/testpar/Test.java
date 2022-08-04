package testpar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void findDuplicStr(String str) {
        char current[] = str.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : current) {
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
        String str = "adnaansdanh";
        findDuplicStr(str);
    }

}


