import java.util.Arrays;

public class selectionSort {
public static void main(String[] args) {
    int[]arr = {4,3,2,1,0};
    sort(arr, 0, arr.length-1, 0);
    System.out.println(Arrays.toString(arr));
}
static void sort(int[]arr,int start,int end,int max){
    if (end==0) {
        return;
    }
    if(start<=end){
        if (arr[start]>arr[max]) {
            sort(arr, start+1, end, start);
        }else{
            sort(arr, start+1, end, max);
        }
    }else{
        int temp = arr[max];
        arr[max] = arr[end];
        arr[end] = temp;
        sort(arr, 0, end-1, 0);

    }
}
}
