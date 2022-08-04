package calcpower;

public class CalcPower {//calcPower

    public static int countPower(int x, int n) {
        if (n == 0) {//base case 1
            return 1;
        }
        if (x == 0) {//base case 2
            return 0;
        }
        if (n % 2 == 0) {//kaam alfa ki value ko find krny ka kaam
            return countPower(x, n - 1) * countPower(x, n / 2);
        } else return countPower(x, n - 2) * countPower(x, n - 2) * 2;

    }
       /* int xpower = countPower(x, n - 1);//kamm
        int power = x * xpower;
        return power;
    }*/

    public static void main(String[] args) {
        int x = 2, n = 5;//printvalue
        int ans = countPower(x, n);
        System.out.println(ans);
    }
}
