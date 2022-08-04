package recurison;

public class GFG {
  /*  public static void reversString(String str,int idx){
        if (idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reversString(str,idx-1);
    }

    public static void main(String[] args) {
        String str="abcd";
        reversString(str,str.length()-1);
    }*/
    static void reverseString(String str,int idx){
        if (idx==1){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseString(str,idx-1);
    }
  public static void main(String[] args) {
      String str="abcdefghijklmnopqurst";
      reverseString(str,str.length()-1);
  }
}
