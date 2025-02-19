public class maxIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
                {45,26,78},
                {15,42,36,89,90},
                {25,34,10},
                {11,16,18}
        };

        System.out.println(max(nums));
    }
    static int max(int[][] arr){
        int ans = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (ans<arr[row][col]){
                    ans = arr[row][col];
                }
            }
        }
        return ans;
    }
}
