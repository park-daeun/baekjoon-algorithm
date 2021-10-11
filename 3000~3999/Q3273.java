import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q3273 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] A = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int x = Integer.parseInt(br.readLine());

        int start = 0;
        int end = n-1;
        int count = 0;
        while(start < end){
            int sum = A[start] + A[end];
            if(sum == x){
                count++;
                start++;
                end--;
            }
            else if(sum > x){
                end--;
            }
            else{
                start++;
            }
        }

        System.out.println(count);
    }   
}