import java.util.*;
public class 더맵게 {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;
        
        for(int scov : scoville){
            pq.offer(scov);
        }
        
        while(!pq.isEmpty()){    
            int x = pq.poll();
            if(x < K){
                if(!pq.isEmpty()){
                int y = pq.poll();
                int mix = x + (y*2);
                pq.offer(mix);
                answer++;
                }
            }else{
                return answer;
            }   
        }
        
        return -1;
    }
}
