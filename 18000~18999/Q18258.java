import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q18258 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        Queue<Integer> queue = new LinkedList<>();
        int last = 0;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            String order = st.nextToken();

            if(order.equals("pop")){
                if(queue.isEmpty()){
                    bw.write(-1 + "\n");
                }
                else{
                    bw.write(queue.poll() + "\n");
                }
            }
            else if(order.equals("size")){
                bw.write(queue.size() + "\n");
            }
            else if(order.equals("empty")){
                if(queue.isEmpty()){
                    bw.write(1 + "\n");
                }
                else{
                    bw.write(0 + "\n");
                }
            }
            else if(order.equals("front")){
                if(queue.isEmpty()){
                    bw.write(-1 + "\n");
                }
                else{
                    bw.write(queue.peek() + "\n");
                }
            }
            else if(order.equals("back")){
                if(queue.isEmpty()){
                    bw.write(-1 + "\n");
                }
                else{
                    bw.write(last + "\n");
                }
            }
            else{
                int x = Integer.parseInt(st.nextToken());
                queue.add(x);
                last = x;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
