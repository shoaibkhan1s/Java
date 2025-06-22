//leetcode 410
//ask in amazon ang google
public class splitInArray
{
    public static void main(String[] args) {
        int[] arr= {7,2,5,10,8};
        int ans = splitArray(arr,2);
        System.out.println(ans);

    }

    static public int splitArray(int[] nums, int k) {
        int start =0;
        int end=0;
        for (int i=0;i<nums.length;i++){
            start = Math.max(start,nums[i]); // in the end of the loop this will give the maximum element in the array
            end+=nums[i]; // in the end of the loop you get sum of all the element in the array
        }

        //binary search
        while (start<end){
            //try for the middle as potential ans
            int mid = start+(end-start)/2;

            //calculate how manu pieces you can divide the array in this max sum(mid)
            int sum =0;
            int pieces=1;

            for(int num : nums){
                if(sum+num<=mid){
                    sum+=num;
                } else{
                    //you can not add this in this subarray, make new one means pieces++
                    // so you add this num in new subarray ,then sum = num
                    sum=num;
                    pieces++;
                }
            }

            if(pieces<=k){
                end=mid;
            } else{
                start=mid+1;
            }
        }
        return end; //here start =end
    }

}
