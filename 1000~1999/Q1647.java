import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q1647 {
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

        if(b>a){
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
            this.node1 = node1;
            this.node2 = node2;
            this.cost = cost;
        }
    }

    static class edgeComparator implements Comparator<Edge>{
        public int compare(Edge e1, Edge e2){
            return e1.cost - e2.cost;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // n: 집의 개수, m: 길의 개수
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // parent 초기화
        parent = new int[n+1];
        for(int i=1; i<=n; i++){
            parent[i] = i;
        }

        // 길 입력받기
        ArrayList<Edge> edges = new ArrayList<>();
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            edges.add(new Edge(a, b, c));
        }

        Collections.sort(edges, new edgeComparator());

        int res = 0;
        int max_cost = 0;
        for(Edge edge: edges){
            if((find_parent(edge.node1) != find_parent(edge.node2)) ){
                union_parent(edge.node1, edge.node2);
                res += edge.cost;
                if(max_cost < edge.cost){
                    max_cost = edge.cost;
                }
            }
        }

        System.out.println(res - max_cost);
    }
}