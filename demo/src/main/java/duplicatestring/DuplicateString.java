package duplicatestring;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateString {

 /*   static void StringCount(String str) {
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
        while (tempString.hasNext()) {
            String temp = tempString.next();
            if (hm.get(temp) > 1) {
                System.out.println("THE WORD " + temp + " APPEARED " + hm.get(temp) + " no of times ");}}}*/
   /* static void StringCount(String str) {
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
        while (tempString.hasNext()) {
            String temp = tempString.next();
            if (hm.get(temp) > 1) {
                System.out.println(temp + hm.get(temp));
            }

        }


    }*/

    static void StringCount(String str) {
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
       /* Iterator<String> tempString = hm.keySet().iterator();
        while (tempString.hasNext()) {
            String temp = tempString.next();
            if (hm.get(temp) > 1) {
                System.out.println(temp + hm.get(temp));
            }
        }*/
        Iterator<String> tempString=hm.keySet().iterator();
        while (tempString.hasNext()){
            String temp= String.valueOf(tempString.hasNext());
            if (hm.get(temp)<1){
                System.out.println(temp + hm.get(temp));


            }
        }

    }
        public static void main (String[]args){


            StringCount("i am am am a java developer");
        }
    }
