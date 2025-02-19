public class searchInRange {
    public static void main(String[] args) {
        int[] num = {4,54,798,45,2465,564,12,1456};
        int target = 45;
        int ans = search(num,target,2,6);
        System.out.println(ans);
    }
    static int search(int[] arr,int target,int start,int end){
        if (arr.length==0){
            return -1;
        }
        for (int index = start; index <=end ; index++) {
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        //execute when element not found
        return -1;
    }
}
