package factoralparacties;

public class FactorialPrint {
    public static int printFactorial(int x, int n) {
        if (x == 1) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        int Fact_Num = printFactorial(x, n - 1);
        int fact_N = n * Fact_Num;
        return fact_N;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = printFactorial(x, n);
        System.out.println(ans);

    }
}
