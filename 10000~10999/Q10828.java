import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q10828 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            if(order.equals("pop")){
                if(stack.isEmpty()){
                    bw.write(-1 + "\n");
                }
                else{
                    bw.write(stack.pop() + "\n");
                }
            }
            else if(order.equals("size")){
                bw.write(stack.size() + "\n");
            }
            else if(order.equals("empty")){
                if(stack.isEmpty()){
                    bw.write(1 + "\n");
                }
                else{
                    bw.write(0 + "\n");
                }
            }
            else if(order.equals("top")){
                if(stack.isEmpty()){
                    bw.write(-1 + "\n");
                }
                else{
                    bw.write(stack.peek() + "\n");
                }
            }
            else{
                int x = Integer.parseInt(st.nextToken());
                stack.add(x);
            }
        }

        br.close();
        bw.flush();
        bw.close();
    } 
}