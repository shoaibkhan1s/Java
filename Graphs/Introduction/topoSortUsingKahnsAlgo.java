import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class topoSortUsingKahnsAlgo {
    public static void main(String[] args) {
      int V = 6;
      int[][]  edges = {
        {1, 3},
        {2, 3},
        {4, 1},
        {4, 0},
        {5, 0},
        {5, 2},
    };
    ArrayList<Integer> list = topoSort(V,edges);
    System.out.println("TopoSort : " + list);
    }

    public static ArrayList<Integer> topoSort(int V, int[][] edges){
        List<List<Integer>> adj = new ArrayList<>();
        int[] inDeg = new int[V];
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            inDeg[v]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < inDeg.length; i++) {
            if(inDeg[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        while (!q.isEmpty()) {
            int rem = q.remove();
            res.add(rem);
            for(int ngbr:adj.get(rem)){
                inDeg[ngbr]--;
                if(inDeg[ngbr]==0){
                    q.add(ngbr);
                }
            }
        }
        return res;
    }
}
