import java.io.*;
import java.util.StringTokenizer;

public class Q11659 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 수의 개수 N과 합을 구해야 하는 횟수 M
        st = new StringTokenizer(br.readLine()); // 5 3
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] d = new int[n+1];
        int sum = 0;
        st = new StringTokenizer(br.readLine()); // N개의 수 5 4 3 2 1
        for(int i=1; i<=n; i++){
            int num = Integer.parseInt(st.nextToken());
            sum += num;
            d[i] = sum;
        }

        // 합을 구해야 하는 구간 i와 j
        StringBuilder sb = new StringBuilder();
        for(int k=0; k<m; k++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            sb.append(d[j] - d[i-1] + "\n");
        }

        System.out.print(sb);
    }
}