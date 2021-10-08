import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.Collections;

public class Q10814 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<Member> arr = new ArrayList<>();

        for (int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            arr.add(new Member(Integer.parseInt(st.nextToken()), st.nextToken(), i));
        }

        Collections.sort(arr, new MemberComparator());

        StringBuilder sb = new StringBuilder();
        for(Member m: arr){
            sb.append(m.age + " " + m.name + "\n");
        }

        System.out.print(sb);
    }
}

class Member{
    int age;
    String name;
    int order;

    public Member(int age, String name, int order){
        this.age = age;
        this.name = name;
        this.order = order;
    }
}

class MemberComparator implements Comparator<Member>{
    @Override
    public int compare(Member m1, Member m2){
        if(m1.age == m2.age){
            if(m1.order > m2.order){
                return 1;
            }
            else{
                return -1;
            }
        }
        else if(m1.age > m2.age){
            return 1;
        }
        else{
            return -1;
        }
    }
}