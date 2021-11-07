import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Q16562 {
    static Integer[] parent;
    static int[] cost;

    static int find_parent(int x){
        if(parent[x] != x){
            parent[x] = find_parent(parent[x]);
        }
        return parent[x];
    }

    static void union_parent(int a, int b){
        a = find_parent(a);
        b = find_parent(b);

        if(cost[b] > cost[a]){
            parent[b] = a;
        }
        else{
            parent[a] = b;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // n: 학생 수, m: 친구 관계 수, k: 가지고 있는 돈
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // cost 초기화
        st = new StringTokenizer(br.readLine());
        cost = new int[n+1];
        for(int i=1; i<=n; i++){
            cost[i] = Integer.parseInt(st.nextToken());
        }

        // parent 초기화
        parent = new Integer[n+1];
        for(int i=1; i<=n; i++){
            parent[i] = i;
        }

        // union 연산 (친구 관계)
        ArrayList<Integer>[] friendship = new ArrayList[m];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            union_parent(a, b);
            friendship[i] = new ArrayList<Integer>();
            friendship[i].add(a);
            friendship[i].add(b);
        }

        for(ArrayList<Integer> f: friendship){
            union_parent(f.get(0), f.get(1));
        }

       // 비용 계산
       HashMap<Integer, Integer> hm = new HashMap<>();
       for(int i=1; i<=n; i++){
           if(!hm.containsKey(parent[i])){
               hm.put(parent[i], cost[i]);
           }
           else{
               if(hm.get(parent[i]) > cost[i]){
                   hm.put(parent[i], cost[i]);
               }
           }
       }

       int total = 0; // 총 비용
       for(int c: hm.values()){
           total += c;
       }

       if(total > k){
           System.out.println("Oh no");
       }
       else{
           System.out.println(total);
       }
    }    
}