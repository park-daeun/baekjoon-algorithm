import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Q1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String book;
        HashMap<String, Integer> hm = new HashMap<>();

        for(int i=0; i<n; i++){
            book = br.readLine();
            if(!hm.containsKey(book)){
                hm.put(book, 1);
            }
            else{
                hm.put(book, hm.get(book) + 1);
            }
        }

        List<Map.Entry<String,Integer>> entry = new LinkedList<>(hm.entrySet());
        entry.sort(new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> b1, Map.Entry<String, Integer> b2){
                if(b1.getValue() == b2.getValue()){
                    return b1.getKey().compareTo(b2.getKey());
                }
                else{
                    return b2.getValue() - b1.getValue();
                }
            }
        });

        System.out.println(entry.get(0).getKey());
    }
}