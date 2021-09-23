import java.io.*;
import java.util.PriorityQueue;

public class Q1927 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        for(int i=0; i<n; i++){
            int x = Integer.parseInt(br.readLine());

            if(x == 0){
                if(pQueue.isEmpty()){
                    bw.write(0 + "\n");
                }
                else{
                    bw.write(pQueue.poll() + "\n");
                }
            }
            else{
                pQueue.add(x);
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}