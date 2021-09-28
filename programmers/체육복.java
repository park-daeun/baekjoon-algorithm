public class 체육복 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int lost_reserve = 0;

        for(int l:lost){
            for(int i=0; i<reserve.length; i++){
                if(l == reserve[i]-1 || l == reserve[i]+1){
                    reserve[i] = 0;
                    answer++;
                    break;
                }
                else if(l == reserve[i]){
                    reserve[i] = 0;
                    lost_reserve++;
                    answer++;
                    break;
                }
            }
        }

        answer = answer + reserve.length - lost_reserve;

        return answer;
    }
    
    public static void main(String[] args){
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        System.out.println(solution(n, lost, reserve));
    }
}