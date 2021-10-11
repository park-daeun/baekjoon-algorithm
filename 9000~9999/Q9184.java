import java.io.*;
import java.util.StringTokenizer;

public class Q9184 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][][] d = new int[21][21][21];

        for(int i=0; i<=20; i++){
            for(int j=0; j<=20; j++){
                for(int k=0; k<=20; k++){
                    if(i == 0 || j == 0 || k == 0){
                        d[i][j][k] = 1;
                    }
                    else if(i < j && j < k){
                        d[i][j][k] = d[i][j][k-1] + d[i][j-1][k-1] - d[i][j-1][k];
                    }
                    else{
                        d[i][j][k] = d[i-1][j][k] + d[i-1][j-1][k] + d[i-1][j][k-1] - d[i-1][j-1][k-1];
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == -1 && b == -1 && c == -1){
                break;
            }

            int ans;
            if(a <= 0 || b <= 0 || c <= 0){
                ans = 1;
            }
            else if(a>20 || b>20 || c>20){
                ans = d[20][20][20];
            }
            else{
                ans = d[a][b][c];
            }

            sb.append("w(" + a + ", " + b + ", " + c + ") = " + ans + "\n");
        }

        System.out.print(sb);
    }
}