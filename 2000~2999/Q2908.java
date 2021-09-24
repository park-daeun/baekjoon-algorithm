import java.io.*;
import java.lang.StringBuilder;

public class Q2908 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = br.readLine().split(" ");
        br.close();

        StringBuilder num1 = new StringBuilder(nums[0]);
        StringBuilder num2 = new StringBuilder(nums[1]);

        num1.reverse();
        num2.reverse();

        if(Integer.parseInt(num1.toString()) > Integer.parseInt(num2.toString())){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }
    }
}