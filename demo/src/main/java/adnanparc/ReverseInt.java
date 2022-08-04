package adnanparc;

public class ReverseInt {
    public static void reverseInt(int n){
        if (n==0){
            return;
        }
        System.out.print(n);
        reverseInt(n-1);

    }

    public static void main(String[] args) {
        int n=9;
        reverseInt(n);
    }
}
