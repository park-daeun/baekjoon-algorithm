import java.util.HashMap;

public class 완주하지못한선수 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> parti_hash = new HashMap<>();
        for(String p: participant){
            if(parti_hash.containsKey(p)){
                int i = parti_hash.get(p);
                parti_hash.put(p, i+1);
            }
            else{
                parti_hash.put(p, 1);
            }
        }

        HashMap<String, Integer> com_hash = new HashMap<>();
        for(String c: completion){
            if(com_hash.containsKey(c)){
                int i = com_hash.get(c);
                com_hash.put(c, i+1);
            }
            else{
                com_hash.put(c, 1);
            }
        }

        for(String p: parti_hash.keySet()){
            if(!com_hash.containsKey(p)){
                answer = p;
                break;
            }

            if(parti_hash.get(p) != com_hash.get(p)){
                answer = p;
                break;
            }
        }
        
        return answer;
    }

    public static void main(String[] args){
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(solution(participant, completion));
    }
}