package arrayquestions;

import java.util.ArrayList;

public class FindDuplicateArray {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,4,5,6,6};
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i:arr){
            if (!ans.contains(i)){
                ans.add(i);
            }
        }

        for (int i:ans){
            System.out.print(i+" ");
        }
    }

}
