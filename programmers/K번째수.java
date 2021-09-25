import java.util.Arrays;

public class K번째수 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};

        for(int[] command: commands){
            int[] c = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(c);
            
            int n = answer.length;
            answer = Arrays.copyOf(answer, n+1);
            answer[n] = c[command[2]-1];
        }

        return answer;
    }

    public static void main(String[] args){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}; 

        System.out.println(Arrays.toString(solution(array, commands)));
    }
}