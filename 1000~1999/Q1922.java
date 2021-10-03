import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q1922 {
    static int[] parent;

    static int find_parent(int x){
        if(parent[x] != x){
            parent[x] = find_parent(parent[x]);
        }
        return parent[x];
    }

    static void union_parent(int a, int b){
        a = find_parent(a);
        b = find_parent(b);

        if(b > a){
            parent[b] = a;
        }
        else{
            parent[a] = b;
        }
    }

    static class Edge{
        int node1;
        int node2;
        int cost;
        
        Edge(int node1, int node2, int cost){
            node1 = this.node1;
            node2 = this.node2;
            cost = this.cost;
        }
    }

    static class edgeComparator implements Comparator<Edge>{
        public int compare(Edge e1, Edge e2){
            if(e1.cost > e2.cost){
                return 1;
            }
            else{
                return -1;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        parent = new int[n+1];
        for(int i=1; i<=n; i++){
            parent[i] = i;
        }

        StringTokenizer st;
        Edge[] edges = new Edge[n+1];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            edges[i].node1 = a;
            edges[i].node2 = b;
            edges[i].cost = c;
        }

        Arrays.sort(edges, new edgeComparator());

        int res = 0;
        for(Edge edge: edges){
            if(find_parent(edge.node1) == find_parent(edge.node2)){
                union_parent(edge.node1, edge.node2);
                res += edge.cost;
            }
        }

        System.out.println(res);
    }
}