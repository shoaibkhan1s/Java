public class Main{
    public static void main(String[] args) {
        //array must be sorted in ascending or descending order...
        int[] num = {2,4,8,11,48,57,81,745};
        int target = 81;
        System.out.println(binary(num,target));

    }

    //return index if element found..
    //return -1 if element not found...
    static int binary(int[] arr, int target){
        int start = 0;
        int end= arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (target<arr[mid]) {
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }
            else {
                //element found means target=mid;
                return mid;
            }
        }
        //return -1 if element not found
        return -1;
    }
}