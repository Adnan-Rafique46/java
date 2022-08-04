package practices;

public class JavaPrac {
    public static int factCalc(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n==0){
            return 1;
        }
        int factNumb = factCalc(x, n - 1);
        int factN = n * factNumb;
        return factN;
    }

    public static void main(String[] args) {
        int x=2,n=5;
        int ans=factCalc(x,n);
        System.out.println(ans);
    }
}
