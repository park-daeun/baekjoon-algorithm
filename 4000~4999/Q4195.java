import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q4195 {
    static HashMap<String, Integer> friend_hash;
    static int[] parent;
    static int[] num_of_friend;

    static int find_parent(int x){
        if(parent[x] != x){
            parent[x] = find_parent(parent[x]);
        }
        return parent[x];
    }

    static int union_parent(int a, int b){
        a = find_parent(a);
        b = find_parent(b);

        if(b > a){
            parent[b] = a;
            num_of_friend[a] += num_of_friend[b];
            return num_of_friend[a];
        }
        else if(a > b){
            parent[a] = b;
            num_of_friend[b] += num_of_friend[a];
            return num_of_friend[b];
        }

        return num_of_friend[a];
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // t: 테스트케이스 개수
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<t; i++){
            // f: 친구 관계 수
            int f = Integer.parseInt(br.readLine());
            friend_hash = new HashMap<>();
            num_of_friend = new int[f*2 + 1];

            // parent
            parent = new int[f*2 +1];
            for(int k=0; k<=f*2; k++){
                parent[k] = k;
                num_of_friend[k] = 1;
            }

            int num = 0;
            for(int j=0; j<f; j++){
                st = new StringTokenizer(br.readLine());
                String f1 = st.nextToken();
                String f2 = st.nextToken();
                
                if(!friend_hash.containsKey(f1)){
                    friend_hash.put(f1, num++);
                }

                if(!friend_hash.containsKey(f2)){
                    friend_hash.put(f2, num++);
                }

                int k = union_parent(friend_hash.get(f1), friend_hash.get(f2));

                sb.append(k + "\n");
            }
        }

        br.close();
        System.out.print(sb.toString());
    }
}