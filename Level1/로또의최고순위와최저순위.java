import java.util.*;

class Solution {
    public List<Integer> solution(int[] lottos, int[] win_nums) {
        List<Integer> answer = new ArrayList<>();
        
        List<Integer> win_list = new ArrayList<>();
        for(int win_num : win_nums){
            win_list.add(win_num);
        }
        
        int min=0;
        int zero_cnt = 0;
        
        for(int lotto : lottos){
            if(win_list.contains(lotto)){
                min++;
            }else if(lotto == 0){
                zero_cnt++;
            }
        }
        
        
        int max = min+zero_cnt;
        
        answer.add(is_rank(max));
        answer.add(is_rank(min));
        
        
        return answer;
    }
    
    static public int is_rank(int num){
        int rank = 0;
        switch(num){
            case 6 -> rank=1; 
            case 5 -> rank=2; 
            case 4 -> rank=3; 
            case 3 -> rank=4; 
            case 2 -> rank=5; 
            default -> rank =6; 
        }
        
        return rank;
    }
}