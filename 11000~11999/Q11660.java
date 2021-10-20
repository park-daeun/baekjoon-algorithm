import java.io.*;
import java.util.StringTokenizer;

public class Q11660 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] d = new int[n+1][n+1];
        int sum = 0;
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<=n; j++){
                if(j == 0){
                    d[i][j] = sum;
                    continue;
                }
                int num = Integer.parseInt(st.nextToken());
                sum += num;
                d[i][j] = sum;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int ans = 0;
            for(int j = x1; j<=x2; j++){
                ans += d[j][y2] - d[j][y1-1];
            }
            sb.append(ans + "\n");
        }

        System.out.print(sb);
    }
}