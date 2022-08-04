package bubblesorting;

public class BubbleSort {
    public static void printfunc(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //bubble sorting
        int arr[] = {48, 15, 232, 14};
        //bubble sorting
        for (int i = 0; i < arr.length - 1; i++) {
            //innner loop
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }


            }
        }

        printfunc(arr);
    }
}
