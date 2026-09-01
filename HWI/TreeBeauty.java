import java.util.ArrayList;

public class TreeBeauty {
public static void main(String[] args) {
    int n= 5;
    int[] par = {0,1,1,2,2};
    int[] arr = {2,3,6,12,27};
    System.out.println(get_ans(n, par, arr));

}
private static int get_ans(int n,int[] par,int[] arr){
   ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    for (int i=0;i<n;i++) {
        adj.add(new ArrayList<>());
    }
    for(int i=1;i<n;i++){
        int parent = par[i] - 1;
        adj.get(parent).add(i);
    }
    int count =0;
    dfs(adj,0);
    
    
}
private static void dfs(ArrayList<ArrayList<Integer>> adj,int i) {
        if(i==adj.size()){
            return;
        }
        for(int ngrb : adj.get(i)){
            
        }
}
}
