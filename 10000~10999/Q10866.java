import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q10866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String order;
        int x;

        LinkedList<Integer> deque = new LinkedList<>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            order = st.nextToken();

            if(order.equals("push_front")){
                x = Integer.parseInt(st.nextToken());
                deque.addFirst(x);
            }
            else if(order.equals("push_back")){
                x = Integer.parseInt(st.nextToken());
                deque.addLast(x);
            }
            else if(order.equals("size")){
                bw.write(deque.size() + "\n");
            }
            else if(order.equals("empty")){
                if(deque.isEmpty()){
                    bw.write(1 + "\n");
                }
                else{
                    bw.write(0 + "\n");
                }
            }
            else{
                if(deque.isEmpty()){
                    bw.write(-1 + "\n");
                }
                else{
                    if(order.equals("pop_front")){
                        bw.write(deque.removeFirst() + "\n");
                    }
                    else if(order.equals("pop_back")){
                        bw.write(deque.removeLast() + "\n");
                    }
                    else if(order.equals("front")){
                        bw.write(deque.getFirst() + "\n");
                    }
                    else{
                        bw.write(deque.getLast() + "\n");
                    }
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}