package geekforgeekstring;

import java.util.ArrayList;

public class RemoveConsecutiveCharacters {
    public String removeConsecutiveCharacter(String s) {
        String str = "";
        ArrayList<Character> al = new ArrayList<>();
        al.add(s.charAt(0));
        int k = 0;
        for (int i = 1; i < s.length(); i++) {

            if (al.get(k) == s.charAt(i)) {

            } else {
                al.add(s.charAt(i));
                k++;

            }
        }
        for (int i = 0; i < al.size(); i++) {
            str = str + al.get(i);
        }
        return str;
    }

}
