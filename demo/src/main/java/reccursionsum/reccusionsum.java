package reccursionsum;

public class reccusionsum {
   /* public static void sumCalc(int i,int n,int sum){
        if (i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sumCalc(i+1,n,sum);
    }

    public static void main(String[] args) {

    }*/
    public static void countsum(int n){
        if (n==0){
            return;
        }
        System.out.print (n);
        countsum(n-1);
    }


    public static void main(String[] args) {
        int n=15;
        countsum(n);

    }
}
