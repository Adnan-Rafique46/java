package reverseString;

public class ReversString {


    public static void main(String[] args) {
      /*  String name="adnan";
        int leng=name.length()-1;
        String rev="";
        for (int i=leng-1;i<=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);*/
        String name="adnan";
        int leng=name.length();
        String rev="";
        for (int i =leng-1;i>=0 ; i--){
            rev=rev+name.charAt(i);

        }
        System.out.println(rev + name);
       /* public class StringFormatter {
            public static String reverseString(String str){
                StringBuilder sb=new StringBuilder(str);
                sb.reverse();
                return sb.toString();
            }
        }*/

    }

    }

