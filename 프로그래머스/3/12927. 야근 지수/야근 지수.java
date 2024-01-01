import java.util.*;

class Solution {
    PriorityQueue<Long> queue = new PriorityQueue<>(Collections.reverseOrder());
    
    public long solution(int n, int[] works) {
        
        for(long work : works){
            queue.add(Long.valueOf(work));
        }
        
        while(!queue.isEmpty()){        
            if(n == 0) break;
            
            long work = queue.poll();
            
            if(work > 0){
                queue.add(work - 1);
                n--;
            }
        }
        
        
        long answer = 0;
        
        while(!queue.isEmpty()){
            long work = queue.poll();
            
            if(work > 0){
                answer += work * work;
            }
        }
        return answer;
    }
}