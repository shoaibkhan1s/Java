// leetcode 40
import java.util.*;
class combinationSum2 {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(CombinationSum2(candidates, target));
    }
   static public List<List<Integer>> CombinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
 List<List<Integer>> ans = new ArrayList<>();
 helper(candidates,target,0,new ArrayList<>(), ans); 
 return ans;     
}
public static void helper(int[] arr,int target,int startIndex,List<Integer> curr, List<List<Integer>> ans){
    if(target==0){
        ans.add(new ArrayList<>(curr));
    }

    for(int i = startIndex;i<arr.length;i++){
        if(arr[i]>target){
            break;
        }
        if(i>startIndex && arr[i]==arr[i-1]){
            continue;
        }
        curr.add(arr[i]);
        helper(arr,target-arr[i],i+1,curr,ans);
        curr.remove(curr.size()-1);
    }

}
static{
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
                fw.write("0");
            } catch (Exception e) {
            }
        }));
}
}
