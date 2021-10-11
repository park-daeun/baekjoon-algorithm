import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2470 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] data = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            data[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(data);
        
        int start = 0;
        int end = n-1;
        int sum;
        int min = Math.abs(data[start] + data[end]);

        int data1 = data[start];
        int data2 = data[end];

        while(start < end){
            //System.out.print(start + " " + end + "\n");
            sum = data[start] + data[end];
            if(sum == 0){
                data1 = data[start];
                data2 = data[end];

                break;
            }
            else if(Math.abs(sum) <= min){
                data1 = data[start];
                data2 = data[end];
                min = Math.abs(data1 + data2);
            }

            if(sum > 0){
                end--;
            }
            else{
                start++;
            }
        }

        System.out.print(data1 + " " + data2 + "\n");
    }
}