package countstrihg;

import java.util.HashMap;
import java.util.Iterator;

public class CountString {

    static void countString(String str) {
        HashMap<String, Integer> hm = new HashMap<>();
        String[] s = str.split(" ");
        for (String tempString : s) {
            if (hm.get(tempString) != null) {
                hm.put(tempString, hm.get(tempString) + 1);
            } else {
                hm.put(tempString, 1);
            }
        }
        System.out.println(hm);


        Iterator<String> tempString = hm.keySet().iterator();
        while (tempString.hasNext()) ;
        String temp = String.valueOf(tempString.hasNext());
        if (hm.get(temp) > 1) ;
        System.out.println(temp + hm.get(temp));
    }

    public static void main(String[] args) {
        countString("a,a,b,a");
    }

}
