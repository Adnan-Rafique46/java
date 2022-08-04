package fabonaccisequence;

public class FabonacciSqunence {
    /*  public static void printNum(int a,int b,int n){
        if (n==0){
            return;
        }
        int c=a+b;
        System.out.print(c);
        printNum(b,c,n-1);

    }

    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        printNum(a,b,n-2);
    }*/
    public static void faboSeq(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c);
        faboSeq(b, c, n - 1);

    }

    public static void main(String[] args) {
        int a = 0, b = 1;
        int n = 7;
        faboSeq(a, b, n - 2);
    }


}
