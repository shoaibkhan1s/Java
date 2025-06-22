//ask in amazon
//infinite array means avoid use of arr.length function
public class infiniteArray {
    public static void main(String[] args) {
        int[] nums = {1,2,4,8,9,10,12,15,16,18,20,25,28,29,30,32,34,35,38,39,50,60,70,80,90,100};
        System.out.println(ans(nums,16));
    }
    static int ans(int[] arr,int target){
        //first find the range
        //first start with the box of size 2;
        int start = 0;
        int end =1;
        while(target>arr[end]){
            int newStart = end+1; //this is my new start
            //double the box size
            //end = previous end + sizeofbox*2
            end = end+ (end-start+1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if (target>arr[mid]) {
                start = mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;
            } else{
                return mid;
            }

        }
        return -1;

    }

}
