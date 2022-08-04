package minmaxpair;

public class GFG {
    static class Pair{
        int max;
        int min;
        public static Pair getMinMax(int arr[],int n){
            Pair minmax=new Pair();
            int i;
            if (n==1){
                minmax.min=arr[0];
                minmax.max=arr[0];
                return minmax;
            }
            if (arr[0]<arr[1]){
                minmax.max=arr[0];
                minmax.min=arr[1];
            }else
                minmax.min=arr[1];
                minmax.max=arr[0];
                for (i=2;i<n;i++){
                    if (arr[i]< minmax.max){
                        minmax.max=arr[i];
                    }else if (arr[i]>minmax.min){
                        minmax.min=arr[i];
                    }
                }
                return minmax;
        }
    }

    public static void main(String[] args) {
        int arr[]={12,15,25,36,2222};
        int size_arr=5;
        Pair minmax=Pair.getMinMax(arr,size_arr);
        System.out.println(minmax.max);
        System.out.println(minmax.min);
    }
}
