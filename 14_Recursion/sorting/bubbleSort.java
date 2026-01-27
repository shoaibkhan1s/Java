import java.util.Arrays;

public class bubbleSort {
public static void main(String[] args) {
    int[]arr = {4,3,2,1};
    sort(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
}

static void sort(int[]arr,int start,int end){
    if (end==0) {
        return;
    }
    if (start<end) {
        if(arr[start]>arr[start+1]){
            int temp = arr[start];
            arr[start] = arr[start+1];
            arr[start+1] = temp;
            sort(arr, start+1, end);
        }else{
            sort(arr, start+1, end);
        }
    }
    else{
        sort(arr, 0, end-1);
    }
}
}
