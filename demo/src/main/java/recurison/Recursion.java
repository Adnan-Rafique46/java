package recurison;

public class Recursion {
    public static void printNum(int n){
        if (n==0){//base condition
            return;
        }
        System.out.print(n);//kaam our work
        printNum(n-1);
    }
    public static void main(String[] args) {
        int n=9;//given value
        printNum(n);
    }
  /*  public static void printNum(int n){
        if (n==6){
            return;
        }

        System.out.print(n);
        printNum(n+1);

    }

    public static void main(String[] args) {

        int n=1;
        printNum(n);
    }*/
}
