import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
    public static int spanningTree(int V, int[][] edges) {
        // code here
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            adj.get(u).add(new int[] { v, w });
            adj.get(v).add(new int[] { u, w });
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int[] vis = new int[V];
        Arrays.fill(vis, 0);
        pq.add(new int[] { 0, 0 });
        int sum = 0;
        while (!pq.isEmpty()) {
            int[] a = pq.poll();
            int w = a[0];
            int node = a[1];
            if (vis[node] == 1) {
                continue;
            }
            vis[node] = 1;
            sum += w;
            for (int[] x : adj.get(node)) {
                int ngbr = x[0];
                int dis = x[1];
                if (vis[ngbr] == 1) {
                    continue;
                }
                pq.add(new int[] { dis, ngbr });
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int V = 9;

        int[][] edges = {
                { 0, 1, 4 },
                { 0, 7, 8 },
                { 1, 2, 8 },
                { 1, 7, 11 },
                { 2, 3, 7 },
                { 2, 8, 2 },
                { 2, 5, 4 },
                { 3, 4, 9 },
                { 3, 5, 14 },
                { 4, 5, 10 },
                { 5, 6, 2 },
                { 6, 7, 1 },
                { 6, 8, 6 },
                { 7, 8, 7 }
        };
        System.out.println(spanningTree(V, edges));
    }
}
