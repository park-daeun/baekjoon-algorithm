import java.io.*;

public class Q1152 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().trim().split(" ");

        if(s[0].equals("")){
            System.out.println(0);
        }
        else{
            System.out.println(s.length);
        }
    }
}