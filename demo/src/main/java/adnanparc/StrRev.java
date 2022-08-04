package adnanparc;

import java.util.Map;

public class StrRev {

    public static String reverseStr(String str){
        if (str.length()==1){
            return str;
        }
        char currentChar=str.charAt(0);
        String nextChar=reverseStr(str.substring(1));
        return currentChar+nextChar;

    }
    public static void main(String[] args) {
        String str="adkfjlm";
        String reverse=reverseStr(str);
        System.out.println(reverse);
    }
}