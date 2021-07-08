import java.util.*;

public class 기능개발 {
    public  List<Integer> solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        int day = 0;
            
        for(int i=0; i<progresses.length; i++){
            day = (100-progresses[i]) % speeds[i]==0?
                  (100-progresses[i]) / speeds[i] :
                  (100-progresses[i]) / speeds[i]+1;
            q.offer(day);
        }
        System.out.println(q);
        int preday = q.poll();
        int cnt = 1;

        while(!q.isEmpty()){
             int curday = q.poll();
             if(preday >= curday){
                 cnt++;
             }else{
                answer.add(cnt);
                preday = curday;
                cnt = 1;  
             }
        }
        answer.add(cnt);
        
        return  answer;
    }
}
