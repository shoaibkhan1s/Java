import java.util.ArrayList;
import java.util.List;

public class combinationSum {
public static void main(String[] args) {
    int[] candidates = {10,1,2,7,6,1,5};
    int target = 8;
    System.out.println(CombinationSum(candidates,target));
}
static public List<List<Integer>> CombinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
static private void helper(int index,int[] arr, int target, List<Integer> curr,List<List<Integer>> ans) {
    
if (target== 0) {
    ans.add(new ArrayList<>(curr));
    return;
}
    if (index == arr.length || target<0) {
        return;
    }

curr.add(arr[index]);
helper(index, arr, target-arr[index],curr, ans);
curr.remove(curr.size()-1);

helper(index+1, arr, target, curr,ans);


 }
}
