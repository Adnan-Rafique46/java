package adnanparc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Parctices {
    public static void findDuplicateString(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }else {
                map.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer>entry:map.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+ " " + entry.getValue());
            }else {
                System.out.println("String are found in the list");
            }
        }

    }

    public static void main(String[] args) {
        String str = "i love java progarmming";
        findDuplicateString(str);

    }
}
