import java.io.*;
import java.util.StringTokenizer;

public class Q2003 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 수열 A
        int[] A = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int interval_sum = 0;
        int end = 0;

        // start를 차례대로 증가시키며 반복
        for(int start=0; start<n; start++){
            // end를 가능한 만큼 이동시키기
            while(interval_sum < m && end < n){
                interval_sum += A[end];
                end++;
            }

            // 부분합이 m일 때 카운트 증가
            if(interval_sum == m){
                count++;
            }

            interval_sum -= A[start];
        }
        System.out.println(count);
    }
}