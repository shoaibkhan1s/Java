//leetcode 1095
public class searchInMountainArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr,target);
        System.out.println(ans);
    }
  static   int search(int[] arr, int target){
     int peak = peak(arr);
     //here first we check in ascending part of the array
     int firstTry = orderAgnosticBS(arr,target,0,peak);
     if(firstTry!=-1){
         return firstTry;
     }
     //if element is not found
     //then we check in descending part of array
     int secondTry = orderAgnosticBS(arr,target,peak+1,arr.length);
     return secondTry;


    }

   static int orderAgnosticBS(int[] arr,int target, int start,int end){
        if(arr[start]<arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }else{
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                   end = mid-1;
                } else {
                    return mid;
                }
            }

        }
        return -1;

    }

   static int peak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            } else{
                start = mid+1;
            }
        }
        return start;
    }

}
