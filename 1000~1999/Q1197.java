import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q1197 {
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
        int node1, node2, cost;
        Edge(int node1, int node2, int cost){
            this.node1 = node1;
            this.node2 = node2;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        ArrayList<Edge> edges = new ArrayList<>();

        int a, b, c;
        for(int i=0; i<e; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            edges.add(new Edge(a, b, c));
        }

        Collections.sort(edges, new Comparator<Edge>(){
            @Override
            public int compare(Edge e1, Edge e2){
                return e1.cost - e2.cost;
            }
        });

        parent = new int[v+1];
        for(int i=1; i<=v; i++){
            parent[i] = i;
        }

        int res = 0;
        for(Edge edge: edges){
            if(find_parent(edge.node1) != find_parent(edge.node2)){
                union_parent(edge.node1, edge.node2);
                res += edge.cost;
            }
        }

        System.out.print(res);
    }
}