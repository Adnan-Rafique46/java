package factorilacalc;

public class FactorialCalc {

  /*  public static int factCalc(int x, int n) {
        if (n == 0) {//base case1
            return 1;
        }
        if (x == 0) {//base case 2
            return 0;
        }
        int fact_Num = factCalc(x, n - 1);//kaam
        int factN = n * fact_Num;
        return factN;
    }

    public static void main(String[] args) {

        int x = 2, n = 5;
        int ans = factCalc(x, n);
        System.out.println(ans);
    }*/

    public static int facNum(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int fact_Num = facNum(x, n - 1);
        int fac_N = n * fact_Num;
        return fac_N;

    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = facNum(x, n);
        System.out.println(ans);
    }
}