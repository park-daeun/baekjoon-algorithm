import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2252 {
    static int[] indegree; // 진입차수
    static ArrayList<Integer>[] graph; // 모든 간선 정보
    static int n;

    static void topology(){
        int[] result = new int[n]; // 알고리즘 수행 결과를 담을 배열
        Queue<Integer> queue = new LinkedList<>();

        // 처음 시작할 때는 진입차수가 0인 노드를 큐에 삽입
        for(int i=1; i<=n; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        // 큐가 빌 때까지 반복
        int num = 0;
        while(!queue.isEmpty()){
            int v = queue.poll();
            result[num++] = v;

            // 해당 원소와 연결된 노드들의 진입차수에서 1 빼기
            for(int i: graph[v]){
                indegree[i]--;
                // 새롭게 진입차수가 0이 되는 노드를 큐에 삽입
                if(indegree[i] == 0){
                    queue.add(i);
                }
            }
        }

        // 위상정렬을 수행한 결과 출력
        StringBuilder sb = new StringBuilder();
        for(int i: result){
            sb.append(i + " ");
        }
        sb.append("\n");

        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // n: 학생 수, m: 키를 비교한 회수
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 진입차수, graph 초기화
        indegree = new int[n+1];
        graph = new ArrayList[n+1];
        for(int i=1; i<=n; i++){
            graph[i] = new ArrayList<>();
        }

        // 모든 간선 정보를 입력받기
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b); // 정점 A에서 B로 이동 가능
            indegree[b]++; // 진입차수를 1 증가
        }

        topology();
    }
}