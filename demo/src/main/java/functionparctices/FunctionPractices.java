package functionparctices;

import javax.print.DocFlavor;
import java.util.Scanner;

public class FunctionPractices {

    public static void main(String[] args) {
        String name="adnan";
        int leng=name.length();
        String rev=" ";

        for (int i =leng-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println(name);
    }

}
