import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11404 {
    static int INF = Integer.MAX_VALUE / 2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[][] graph = new int[n+1][n+1];
        for(int[] g: graph){
            Arrays.fill(g, INF);
        }

        for(int i=1; i<=n; i++){
            graph[i][i] = 0;
        }

        StringTokenizer st;
        int a, b, c;
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            graph[a][b] = Math.min(graph[a][b], c);
        }
        br.close();

        for(int k=1; k<=n; k++){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(graph[i][j] == INF){
                    sb.append("0 ");
                }
                else{
                    sb.append(graph[i][j] + " ");
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
