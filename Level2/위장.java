import java.util.*;


public class 위장 {
    public int solution(String[][] clothes) {
        int answer = 1;
            
        Map<String,Integer> map = new HashMap<>();
        
        for(int i=0; i< clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0)+1);
        }
        
        for(int value : map.values()){
            answer *= (value+1);
        }

        return answer-1;
    }
}
