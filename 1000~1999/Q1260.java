import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.Collections;

public class Q1260 {
    // dfs 메서드 정의
    public static void dfs(LinkedList<Integer>[] graph, int v, boolean[] visited){
        // 현재 노드를 방문 처리
        visited[v] = true;
        System.out.print(v + " ");

        // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
        for(int i: graph[v]){
            if(!visited[i]){
                dfs(graph, i, visited);
            }
        }
    }

    // bfs 메서드 정의
    public static void bfs(LinkedList<Integer>[] graph, int v, boolean[] visited){
        // 큐 구현을 위해 Queue 사용
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        
        // 현재 노드를 방문 처리
        visited[v] = true;

        while(!queue.isEmpty()){
            // 큐에서 하나의 원소를 뽑아 출력
            v = queue.poll();
            System.out.print(v + " ");

            // 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
            for(int i: graph[v]){
                if(!visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정점 갯수
        int M = Integer.parseInt(st.nextToken()); // 간선 갯수
        int V = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점의 번호

        // 방문여부체크 배열
        boolean[] visited = new boolean[N+1];

        // 인접리스트 생성
        LinkedList<Integer>[] graph = new LinkedList[N+1];
        for(int i=0; i<=N; i++){
            graph[i] = new LinkedList<>();
        }

        // 양방향 간선 연결
        for(int j=0; j<M; j++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }
        br.close();

        // 방문 순서를 위해 오름차순 정렬
        for(int i=1; i<=N; i++){
            Collections.sort(graph[i]);
        }

        dfs(graph, V, visited);
        System.out.println();

        visited = new boolean[N+1]; // 초기화
        bfs(graph, V, visited);
    }
}