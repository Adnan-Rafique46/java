package adnanparc;

import java.util.ArrayList;

public class ParcJava {
    public static void printString(int arr[],int leg){
        boolean ifPresent=true;
        ArrayList<Integer> al=new ArrayList<Integer>();
        for (int i=0;i<=leg-1;i++){
            for (int j=i+1;j<=leg;j++){
                if (arr[i]==arr[j]){
                    if (al.contains(i)){
                        break;
                    }else {
                        al.add(i);
                        ifPresent=true;
                    }
                }
            }
            if (ifPresent==true){
                System.out.println(al+" ");
            }else {
                System.out.println("Array are not found in the list");
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={11,22,33,44,55,66,88,55,44,33,22};
        int n= args.length;
        printString(arr,n);
    }
}
