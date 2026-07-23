import java.util.*;

public class BFS {

    public static void createGraph(ArrayList<ArrayList<Integer>> adj, int V) {

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

       
        adj.get(0).add(1);
        adj.get(0).add(2);

        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(1).add(4);

        adj.get(2).add(0);
        adj.get(2).add(4);

        adj.get(3).add(1);

        adj.get(4).add(1);
        adj.get(4).add(2);
    }

    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] vis = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        vis[0] = true;

        while (!q.isEmpty()) {
            int node = q.remove();
            bfs.add(node);

            for (int neighbour : adj.get(node)) {
                if (!vis[neighbour]) {
                    vis[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }

        return bfs;
    }

    public static void main(String[] args) {

        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        createGraph(adj, V);

        ArrayList<Integer> ans = bfs(adj);

        System.out.println("BFS Traversal:");
        for (int node : ans) {
            System.out.print(node + " ");
        }
    }
}

















// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;

// public class BFS {
//     static public class Edge {
//         int src;
//         int dest;

//         Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 3));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 4));

//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 4));
//         graph[3].add(new Edge(3, 5));

//         graph[4].add(new Edge(4, 2));
//         graph[4].add(new Edge(4, 3));
//         graph[4].add(new Edge(4, 5));

//         graph[5].add(new Edge(5, 3));
//         graph[5].add(new Edge(5, 4));
//         graph[5].add(new Edge(5, 6));

//         graph[6].add(new Edge(6, 5));

//     }

//     public static void bfs(ArrayList<Edge> graph[], int V) {
//         Queue<Integer> q = new LinkedList<>();
//         boolean vis[] = new boolean[V];

//         q.add(0);

//         while (!q.isEmpty()) {
//             int curr = q.remove();

//             if (vis[curr] == false) {

//                 System.out.print(curr + " ");
//                 vis[curr] = true;

//                 for (int i = 0; i < graph[curr].size(); i++) {
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }

//     public static void dfs(ArrayList<Edge> graph[],int V,boolean[] vis){
        
//     }

//     public static void main(String[] args) {
//         int V = 7;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         bfs(graph, V);
//     }

// }
