package ahmedcoding;

public class AhmedWork {

    public static void main(String[] args) {
        System.out.println("my name is ahmad");
        System.out.println("we are four family mamber");
        System.out.println("i have one sister");
        System.out.print("my sister name is armish");
        System.out.println("");
        int arr[] = {14, 25, 86, 96, 2, 65, 44, 4, 7, 2,};
        int temp = 0, min = 0;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[min]) {
                    min = j;

                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;


        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
