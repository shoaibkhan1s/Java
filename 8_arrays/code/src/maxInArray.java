public class maxInArray {
    public static void main(String[] args) {
        int[] arr = {4,654,4,561,48,47,64,897};
        System.out.println(max(arr,1,4));
    }
    //code for maximum in whole array
//    static int max(int[] arr){
//        int max=arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }


    //code for maximum in a range
    static int max(int[] arr,int index1, int index2){
        int max=arr[index1];
        for (int i = index1; i <= index2; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
}
