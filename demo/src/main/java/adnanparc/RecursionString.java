package adnanparc;

public class RecursionString {
    public static void recurionReverse(int n){
        if (n==0){
            return;
        }
        System.out.print(n);
        recurionReverse(n-1);
        return;
    }
    public static void main(String[] args) {
        int n=9;
        recurionReverse(n);

    }
}
