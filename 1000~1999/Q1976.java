import java.io.*;
import java.util.StringTokenizer;

public class Q1976 {
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

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n: 도시의 수, m: 여행 계획에 속한 도시들의 수
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        // parent
        parent = new int[n+1];
        for(int i=1; i<=n; i++){
            parent[i] = i;
        }

        // 도시 연결 정보
        StringTokenizer st;
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());

            for(int j=1; j<=n; j++){
                int x = Integer.parseInt(st.nextToken());

                if(x == 1){
                    union_parent(i, j);
                }
            }
        }

        // 여행 계획
        st = new StringTokenizer(br.readLine());
        int city1 = Integer.parseInt(st.nextToken());
        boolean isPossible = true;
        
        for(int i=1; i<m; i++){
            int city2 = Integer.parseInt(st.nextToken());

            if(find_parent(city1) != find_parent(city2)){
                isPossible = false;
                break;
            }
        }

        if(isPossible){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}