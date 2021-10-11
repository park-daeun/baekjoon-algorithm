import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1929 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, true); // 처음엔 모든 수가 소수(True)인 것으로 초기화
        arr[1] = false;

        // 에라토스테네스의 체 알고리즘
        for(int i=2; i<=Math.sqrt(n); i++){
            if(arr[i]){ // i가 소수인 경우(남은 수인 경우)
                // i를 제외한 i의 모든 배수를 지우기
                int j = 2;
                while(i*j <= n){
                    arr[i*j] = false;
                    j++;
                }
            }
        }

        // 구간 사이 모든 소수 출력
        StringBuilder sb = new StringBuilder();
        for(int i=m; i<=n; i++){
            if(arr[i]){
                sb.append(i + "\n");
            }
        }

        System.out.print(sb);
    }
}