import java.util.ArrayList;

public class BellmanFord {
    public static ArrayList<Integer> bellmanFord(int V, int[][] edges, int src) {

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            res.add(Integer.MAX_VALUE);
        }
        res.set(src, 0);

        for (int i = 0; i < V - 1; i++) {
            for (int[] edge : edges) {
                int s = edge[0];
                int d = edge[1];
                int w = edge[2];

                if (res.get(s) != Integer.MAX_VALUE && res.get(d) > w + res.get(s)) {
                    res.set(d, w + res.get(s));
                }
            }

        }
        for (int[] edge : edges) {
            int s = edge[0];
            int d = edge[1];
            int w = edge[2];
            if (res.get(s) != Integer.MAX_VALUE && res.get(d) > w + res.get(s)) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(-1);
                return list;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] edges = { { 1, 3, 2 }, { 4, 3, -1 }, { 2, 4, 1 }, { 1, 2, 1 }, { 0, 1, 5 } };
        int src = 0;
        System.out.println(bellmanFord(V, edges, src));
    }
}
