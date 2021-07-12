import java.util.*;
public class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        
        int max = 0;
        
        for(int value: truck_weights){
            while(true){
            if(q.isEmpty()){
                q.add(value);
                answer++;
                max += value;
                break;
            }else if(q.size() == bridge_length){
                max -= q.poll();
            }else{
                if(max + value > weight){
                    q.add(0);
                    answer++;
                }else{
                    q.add(value);
                    max += value;
                    answer++;
                    break;
                }
            }
          }
        }
        return answer + bridge_length;
    }
}
