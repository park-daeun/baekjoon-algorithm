import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1920 {
    static int[] A;

    static int binarySearch(int start, int end, int target){
        int mid;
        while(start <= end){
            mid = (start + end) / 2;

            if(A[mid] == target){
                return 1;
            }
            else if(A[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        A = new int[n];
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            sb.append(binarySearch(0, n-1, Integer.parseInt(st.nextToken())) + "\n");
        }

        System.out.print(sb);
    }
}