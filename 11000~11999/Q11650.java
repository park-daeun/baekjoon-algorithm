import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.Comparator;


public class Q11650 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        ArrayList<Point2> arr = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr.add(new Point2(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        StringBuilder sb = new StringBuilder();
        Collections.sort(arr, new ConditionComparator2());
        
        for(Point2 a:arr){
            sb.append(a.x + " " + a.y + "\n");
        }

        System.out.print(sb);
    }
}

class Point2{
    int x;
    int y;

    public Point2(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class ConditionComparator2 implements Comparator<Point2>{
    @Override
    public int compare(Point2 p1, Point2 p2){
        if(p1.x > p2.x){
            return 1;
        }
        else if(p1.x == p2.x){
            if(p1.y > p2.y){
                return 1;
            }
            else{
                return -1;
            }
        }
        else{
            return -1;
        }
    }
}