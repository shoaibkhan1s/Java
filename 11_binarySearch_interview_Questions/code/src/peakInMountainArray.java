//leetcode 852 and 162
public class peakInMountainArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,5,6,4,3,2};
       int ans = peak(nums);
        System.out.println(ans);
    }
    public static int peak(int[] arr){
         int start = 0;
         int end = arr.length-1;
         while(start<end){
             int mid = start + (end-start)/2;
             if(arr[mid]>arr[mid+1]){  //means you are in descending part...
                 end = mid;
             } else {  //means you are in ascending part...
                 start = mid+1;
             }

         }
         //in the end start==end are pointing to the largest number because of 2 checks above...
        //start and end are always trying to find max element in the above 2 checks...
        //hence when they are pointing to just one elment, that is the max one because that is what the checks say...
        //more elaboration : at every point of time for start and end, they have the best possible answer till that time...
        // and if we are saying that only one item is remaining, hence because of above line that is the best possible answer...

         return end; //or return start; because both are equal.
    }
}
