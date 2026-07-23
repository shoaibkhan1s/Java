import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static public class Edge{
        int src;
        int dest;
        int weight;

        Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1,10));

        graph[1].add(new Edge(1, 2,-1));
        graph[1].add(new Edge(1, 3,5));

        graph[2].add(new Edge(2, 1,-1));
        graph[2].add(new Edge(2, 3,1));

        graph[3].add(new Edge(3, 1,5));
        graph[3].add(new Edge(3, 2,1));
        

    }
    
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        for(int i=0 ; i < graph[1].size() ; i++){
            Edge e = graph[1].get(i);
            System.out.println(e.dest + " with weight " + e.weight);
        }


    }
}
