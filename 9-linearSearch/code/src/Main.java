//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {45,21,248421,487,123, 478,47,154,21,56};
        int target = 154;
        int ans = linearSearch(arr,target);
        System.out.println("element found at index : "+ans);
    }
    static int linearSearch(int[] num, int target){
        if (num.length==0){
            return -1;
        }
        for (int index = 0; index <num.length; index++) {
            int element = num[index];
            if (element==target) {
                return index;
            }
        }

        //this statement will execute when target element is not found in the array.
        return -1;
    }
}