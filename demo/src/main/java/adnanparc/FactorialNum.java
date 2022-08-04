package adnanparc;

public class FactorialNum {
    public static int factorial(int x, int n) {
        if (x == 0 || n == 0) {
            return 1;
        }

        int fact_Num = factorial(x, n - 1);
        int fac_N = n * fact_Num;
        return fac_N;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = factorial(x,n);
        System.out.println(ans);

    }
}
