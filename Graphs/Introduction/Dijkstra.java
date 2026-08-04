import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
	public static ArrayList<Integer> dijkstra(int V, int[][] edges, int src) {
		
		List<List<int[]>> adj = new ArrayList<>();
		for (int i = 0; i<V; i++) {
			adj.add(new ArrayList<>());
		}
		for (int[] edge: edges) {
			int sr = edge[0];
			int des = edge[1];
			int wt = edge[2];
			adj.get(sr).add(new int[] {des, wt});
			adj.get(des).add(new int[] {sr, wt});
		}
		ArrayList<Integer> res = new ArrayList<>();
		// marks all node infinity except source node
		for (int i = 0; i < V; i++) {
			res.add(Integer.MAX_VALUE);
		}
		res.set(src, 0);
		
		PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
		pq.add(new int[] {0, src});
		
		while (!pq.isEmpty()) {
			int[] a = pq.poll();
			int w = a[0];
			int node = a[1];
			if(w>res.get(node))
			       continue;
			for (int[] arr : adj.get(node)) {
				int dis = arr[1];
				int ngbr = arr[0];
				if (w + dis>=res.get(ngbr))
					continue;
				
				res.set(ngbr, w + dis);
				pq.add(new int[] {res.get(ngbr), ngbr});
			}
		}
		
		return res;
		
	}
    public static void main(String[] args) {
       int V = 3;
       int[][] edges = {{0, 1, 1}, {1, 2, 3}, {0, 2, 6}};
       int src = 2;
       System.out.println(dijkstra(V, edges, src));
    }
}
