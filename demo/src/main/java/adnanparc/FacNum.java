package adnanparc;

public class FacNum {
    public static int printFacNum(int x, int n) {
        if (x == 0 || n == 0) {
            return 1;
        }
        int fac_N = printFacNum(x, n - 1);
        int fac_Num = n * fac_N;
        return fac_Num;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = printFacNum(x, n);
        System.out.println(ans);

    }
}
