import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q1766 {
    static int n; // 문제의 수
    static int[] indegree;
    static ArrayList<Integer>[] graph;

    static void topology(){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] result = new int[n];

        for(int i=1; i<=n; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        int num = 0;
        while(!queue.isEmpty()){
            int v = queue.poll();
            result[num++] = v;

            for(int i: graph[v]){
                indegree[i]--;

                if(indegree[i] == 0){
                    queue.add(i);
                }
            }
        }

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

        // n: 문제의 수, m: 문제 정보 수
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // indegree, graph 초기화
        indegree = new int[n+1];
        graph = new ArrayList[n+1];
        for(int i=0; i<=n; i++){
            graph[i] = new ArrayList<>();
        }

        // m개의 정보 받기
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            indegree[b]++;
        }

        topology();
    }
}