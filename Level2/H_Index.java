import java.util.*;

public class H_Index {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        
        for(int i=0; i<citations.length; i++){
            System.out.print(citations[i]);
        }
        
        int answer = citations[citations.length-1];
        
        while(true){
            int cnt =0;
            for(int value: citations){
                if(value >= answer){
                    cnt++;
                }
            }
        
            if(cnt >= answer){
                return answer;
            }else{
                answer -=1;
            }   
        }

    }  
}
