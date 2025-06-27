//leetcode 33
//ask in google and amazon
public class searchInRotatedSortedArr {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 10;
        int ans =  searchInRange(arr,target);
        System.out.println(ans);

    }
    static int searchInRange(int[] arr, int target){
        int peak = pivot(arr);
        int firstTry = search(arr,target,0,peak);
        if(firstTry !=-1){
            return firstTry;
        } else{
            return search(arr,target,peak+1,arr.length-1);
        }
    }
    static int search(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]> target){
                end = mid-1;
            } else if(arr[mid]<target){
                start=mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    // this will not work in case of duplicate values...
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            // 4 cases over here :
            //case 1
            if( mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }

            //case 2
            if( mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // case 3
            if(arr[start]>=arr[mid]){
                end = mid-1;
            }
            //case 4
            else{
                start = mid+1; //if mid is pivot then it will cought in caaes 1 or 2...
            }
        }
        return -1; // array is not sorted

    }

    //if array contains duplicates
    static int pivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            // 4 cases over here :
            //case 1
            if( mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }

            //case 2
            if( mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // case 3

        //arr[start] = arr[end] = arr[mid]
            if(arr[start]==arr[mid] && arr[end]==arr[mid]){
                //skip the duplicates
                //NOTE: what if these element at start and end were the pivot
                //check if start is pivot
                if(start < end && arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //check whether end is pivot
                if(end > start && arr[end]<arr[end-1]){
                    return end-1;
                }
                  end--;
            } 
            //left side is sorted, so pivot should be in right side...
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start = mid+1;
            }
            //case 4
            else{
              end =mid-1;
            }
        }
        return -1; // array is not sorted

    }
}
