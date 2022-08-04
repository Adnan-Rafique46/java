package adnanparc;

public class FactNum {
    public static int factNum(int x,int n){
        if (n==0||x==0){
            return 1;
        }
        int fac_Num=factNum(x,n-1);
        int fac_N=n*fac_Num;
        return fac_N;
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans=factNum(x,n);
        System.out.println(ans);
    }
}
