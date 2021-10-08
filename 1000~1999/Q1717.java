import java.io.*;
import java.util.StringTokenizer;

public class Q1717 {
    static int[] parent;

    static int find_parent(int x){
        if(parent[x] != x){
            parent[x] = find_parent(parent[x]);
        }
        return parent[x];
    }

    static void union_parent(int a, int b){
        a = find_parent(a);
        b = find_parent(b);

        if(b > a){
            parent[b] = a;
        }
        else{
            parent[a] = b;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        parent = new int[n+1];
        for(int i=1; i<=n; i++){
            parent[i] = i;
        }

        int x, a, b;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if(x == 0){
                union_parent(a, b);
            }
            else{
                if(find_parent(a) == find_parent(b)){
                    sb.append("YES\n");
                }
                else{
                    sb.append("NO\n");
                }
            }
        }

        br.close();
        System.out.print(sb);
    }    
}