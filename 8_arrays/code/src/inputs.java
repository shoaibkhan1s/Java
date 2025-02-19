import java.util.Arrays;
import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[] = new int[5];

        for (int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        //foreach loop
//        for (int num : arr){
//            System.out.println(num); //here num is each element of array.
//        }

        //another method of printing array :
        System.out.println(Arrays.toString(arr));
    }
}
