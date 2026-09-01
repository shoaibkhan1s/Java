import java.util.ArrayList;
import java.util.HashMap;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,3,4,4,4,5,5,5,5,5};      
        System.out.println(sort(arr));  
    }
    private static int[] sort(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0) +1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a));
        int[] ans = new int[arr.length];
        int index =0;
        for(int num : list){
            int count = map.get(num);
            while (count>0) {
                ans[index++] = num;
                count--;
            }
        }
        return ans;
    }
}
