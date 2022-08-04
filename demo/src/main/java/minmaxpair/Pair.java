package minmaxpair;

public  class Pair {
    public static class PairMinMax {
        int min;
        int max;
    }

    public static PairMinMax getMinMax(int arr[],int n){
       PairMinMax minmax=new PairMinMax();
       int i;
       if (n==1){
           minmax.min=arr[0];
           minmax.max=arr[0];
           return minmax;
       }
        if (arr[0]<arr[1]){
            minmax.min=arr[1];
            minmax.max=arr[0];
        }else {
            minmax.min=arr[0];
            minmax.max=arr[1];
        }
        for (i=2;i<n;i++){
            if (arr[i]> minmax.max){
                minmax.max=arr[i];
            }else if (arr[i]< minmax.min){
                minmax.min=arr[i];
            }
        }
        return minmax;
    }

    public static void main(String[] args) {
        int arr[]={100,30,6000,15,2,6,4,9,8,7};
        int size=10;
        PairMinMax minMax=getMinMax(arr, arr.length);
        System.out.println(minMax.max);
        System.out.println(minMax.min);
    }
}