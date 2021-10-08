import java.io.*;

public class Q1003 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            int[][] d = new int[n+1][2];

            if(n==0){
                sb.append(1 + " " + 0 + "\n");
                continue;
            }
            else if(n==1){
                sb.append(0 + " " + 1 + "\n");
                continue;
            }

            d[0][0] = 1;
            d[0][1] = 0;
            d[1][0] = 0;
            d[1][1] = 1;
            
            for(int j=2; j<=n; j++){
                d[j][0] = d[j-1][0] + d[j-2][0];
                d[j][1] = d[j-1][1] + d[j-2][1];
            }

            sb.append(d[d.length-1][0] + " " + d[d.length-1][1] + "\n");
        }

        System.out.print(sb);
    }
}