import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q1764 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hm = new HashMap<>();
        String name;

        for(int i=0; i<n; i++){
            name = br.readLine();
            hm.put(name, 0);
        }

        int ans = 0;
        ArrayList<String> ans_name = new ArrayList<>();

        for(int i=0; i<m; i++){
            name = br.readLine();

            if(hm.containsKey(name)){
                ans++;
                ans_name.add(name);
            }
        }
        
        bw.write(ans + "\n");

        String[] ans_names = (String[]) ans_name.toArray(new String[ans_name.size()]);
        Arrays.sort(ans_names);

        for(String s:ans_names){
            bw.write(s + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
