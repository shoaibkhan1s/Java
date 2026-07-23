import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class topologicalSort {
  
public static void main(String[] args) {
    int[][] edges = {
    {3, 1},
    {2, 3},
    {5, 2},
    {4, 1},
    {4, 0},
    {5, 0}
};

 topoSort(6,edges);

}

private static void topoSort(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
        }

        boolean[] vis = new boolean[V];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < V; i++) {
            if(!vis[i]){
                dfs(i,adj,vis,s);
            }
        }
   //printing the stack
      while (!s.isEmpty()) {
        System.out.print(s.pop()+" ");
      }
}

private static void dfs(int node, List<List<Integer>> adj, boolean[] vis, Stack<Integer> s) {
    vis[node] = true;
    for(int num: adj.get(node)){
        if (!vis[num]) {
            dfs(num, adj, vis, s);
        }
    }
    s.push(node);
}
}
