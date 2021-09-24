import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q2606 {
    public static void bfs(LinkedList<Integer>[] graph, int v, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);

        visited[v] = true;
        int n = 0;

        while(!queue.isEmpty()){
            v = queue.poll();

            for(int i: graph[v]){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                    n++;
                }
            }
        }

        System.out.println(n);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        // graph 만들기
        LinkedList<Integer>[] graph = new LinkedList[N+1];
        for(int i=0; i<=N; i++){
            graph[i] = new LinkedList<>();
        }

        // visited 만들기
        boolean[] visited = new boolean[N+1];

        // 양방향 간선 입력
        StringTokenizer st;
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        // graph 정렬
        for(int i=1; i<=N; i++){
            Collections.sort(graph[i]);
        }

        // bfs
        bfs(graph, 1, visited);
    }
}