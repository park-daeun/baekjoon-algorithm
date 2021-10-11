import java.io.*;
import java.util.StringTokenizer;

public class Q1978 {
    static boolean isPrime(int x){
        if(x < 2){
            return false;
        }

        for(int i=2; i<=Math.sqrt(x); i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int ans = 0;
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            
            if(isPrime(num)){
                ans++;
            }
        }

        System.out.println(ans);
    }
}