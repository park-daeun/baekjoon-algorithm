import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            String s = br.readLine();
            if(!arr.contains(s)){
                arr.add(s);
            }
        }

        Collections.sort(arr, new WordComparator());

        StringBuilder sb = new StringBuilder();
        for(String a:arr){
            sb.append(a + "\n");
        }

        System.out.print(sb);
    }
}

class WordComparator implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){
        if(s1.length() > s2.length()){
            return 1;
        }
        else if(s1.length() == s2.length()){
            return s1.compareTo(s2);
        }
        else{
            return -1;
        }
    }
}