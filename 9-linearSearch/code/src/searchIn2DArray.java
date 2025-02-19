import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
                {45,26,78},
                {15,42,36,89,90},
                {25,34,10},
                {11,16,18}
        };
        int target = 89;
        int[] ans = search(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        if(arr.length==0){
            return new int[] {-1,-1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
