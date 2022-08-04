package subarray;

public class ReverseArr {
    public static void reverseArr(int arr[],int start,int end){
        int temp;
        while (start<end){
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
        }
    }
    public static void printArr(int arr[],int size){
        for (int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[]={2,5,6,8,9,11,12,23,25};
        printArr(arr,8);
        System.out.print("Reverse Array /n");
        reverseArr(arr,0,8);


    }
}
