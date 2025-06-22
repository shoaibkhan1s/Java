public class floorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18,20,22};
        int target = 17;
        int ans = floor(arr,target);
        System.out.println(ans);
    }
    static int floor(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            //return target if it is found...
            if (target>arr[mid]) {
                start =mid+1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }

            //but what if target is smaller than the smallest number in array then in this case no floor...
/*            if(target<arr[0]){
                return -1;
            }  we don't need this because 'end' become -1 */
        }

        /*return start because it is the ceiling of target number...because loop break when start<=end...*/

        return arr[end];
    }

}

