import java.util.*;

public class DFS {

    public static void createGraph(ArrayList<ArrayList<Integer>> adj, int V) {

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

    // DFS Helper
    public static void dfsHelper(int node, ArrayList<ArrayList<Integer>> adj,
            boolean[] vis, ArrayList<Integer> list) {
            vis[node] = true;
            list.add(node);

        for (int neighbour : adj.get(node)) {
            if (!vis[neighbour]) {
                dfsHelper(neighbour, adj, vis, list);
            }
        }
    }

    // DFS Traversal
    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> list = new ArrayList<>();
        boolean[] vis = new boolean[adj.size()];

        dfsHelper(0, adj, vis, list);

        return list;
    }

    public static void main(String[] args) {

        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        createGraph(adj, V);

        ArrayList<Integer> ans = dfs(adj);

        System.out.println("DFS Traversal:");
        for (int node : ans) {
            System.out.print(node + " ");
        }
    }
}



// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;

// public class DFS {
// static public class Edge {
// int src;
// int dest;

// Edge(int s, int d) {
// this.src = s;
// this.dest = d;
// }
// }

// public static void createGraph(ArrayList<Edge> graph[]) {
// for (int i = 0; i < graph.length; i++) {
// graph[i] = new ArrayList<>();
// }

// graph[0].add(new Edge(0, 1));
// graph[0].add(new Edge(0, 2));

// graph[1].add(new Edge(1, 0));
// graph[1].add(new Edge(1, 3));

// graph[2].add(new Edge(2, 0));
// graph[2].add(new Edge(2, 4));

// graph[3].add(new Edge(3, 1));
// graph[3].add(new Edge(3, 4));
// graph[3].add(new Edge(3, 5));

// graph[4].add(new Edge(4, 2));
// graph[4].add(new Edge(4, 3));
// graph[4].add(new Edge(4, 5));

// graph[5].add(new Edge(5, 3));
// graph[5].add(new Edge(5, 4));
// graph[5].add(new Edge(5, 6));

// graph[6].add(new Edge(6, 5));

// }

// public static void dfs(ArrayList<Edge> graph[],int curr,boolean[] vis){
// System.out.print(curr + " ");
// vis[curr] = true;

// for(int i=0;i<graph[curr].size();i++){
// Edge e = graph[curr].get(i);
// if(!vis[e.dest]){
// dfs(graph, e.dest, vis);
// }
// }
// }

// public static void main(String[] args) {
// int V = 7;
// ArrayList<Edge> graph[] = new ArrayList[V];
// createGraph(graph);
// boolean[] vis = new boolean[V];
// dfs(graph, 0, vis);

// }

// }
