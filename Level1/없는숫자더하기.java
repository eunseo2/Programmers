import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int[] check = {0,1,2,3,4,5,6,7,8,9};
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        
        for(int num : numbers){
            list.add(num);
        }
        
        for(int num : check){
            if(!list.contains(num)){
                answer += num;
            }
        }
        
        return answer;
    }
}