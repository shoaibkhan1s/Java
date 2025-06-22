//leetcode 744
public class smallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'e';
        char ans = ceiling(arr,target);
        System.out.println(ans);
    }
    static char ceiling(char[] arr,char target) {
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
                return arr[mid];
            }

            //but what if target is greatet than the largest number in array then in this case no ceiling
            if(target>arr[arr.length-1]){
                return arr[0];
            }
        }

        /*return start because it is the ceiling of target number...because loop break when start<=end...*/

        return arr[start];
    }
}
