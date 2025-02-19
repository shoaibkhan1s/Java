public class findMin {
    public static void main(String[] args) {
        int[] nums = {4,6544,7,44,-5,4,4,-8,45};
        System.out.println(min(nums));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
