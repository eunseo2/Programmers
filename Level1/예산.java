import java.util.*;

public class 예산 {
    public int solution(int[] d, int budget) {
        
        Arrays.sort(d);
        int answer = 0;
        
        for(int money : d){
            if(budget - money >=0){
                budget -= money;
                answer++;
            }
        }
        
        return answer;
    }
}
