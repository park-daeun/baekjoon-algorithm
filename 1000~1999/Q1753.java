import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q1753 {
    static int INF = Integer.MAX_VALUE;
    static ArrayList<Edge>[] graph;
    static int[] distance;
    static int v;

    static class Edge{
        int node;
        int dist;
        Edge(int node, int dist){
            this.node = node;
            this.dist = dist;
        }
    }

    static void dijkstra(int start){
        distance[start] = 0;
        PriorityQueue<Edge> queue = new PriorityQueue<>((o1, o2) -> o1.dist - o2.dist);
        queue.add(new Edge(start, 0));

        Edge edge;
        int now, dist;
        while(!queue.isEmpty()){
            edge = queue.poll();
            now = edge.node;
            dist = edge.dist;

            if(distance[now] < dist){
                continue;
            }

            for(Edge e: graph[now]){
                int cost = e.dist + dist;

                if(distance[e.node] > cost){
                    distance[e.node] = cost;
                    queue.add(new Edge(e.node, cost));
                }
            }
        }
        
        return;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());

        graph = new ArrayList[v+1];
        distance = new int[v+1];
        Arrays.fill(distance, INF);

        for(int i=1; i<=v; i++){
            graph[i] = new ArrayList<>();
        }

        int a, b, c;
        for(int i=0; i<e; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            graph[a].add(new Edge(b, c));
        }

        dijkstra(k);

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=v; i++){
            if(distance[i] == INF){
                sb.append("INF\n");
            }
            else{
                sb.append(distance[i] + "\n");
            }
        }

        System.out.print(sb);
    }    
}