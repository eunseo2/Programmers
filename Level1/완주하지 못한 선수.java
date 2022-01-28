import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> check = new HashMap<>();
        
        for(String p : participant){
            if(check.containsKey(p)){
                check.put(p,check.get(p)+1); 
            }else{
                check.put(p,1);
            }
        }
        
        for(String c : completion){
            if(check.containsKey(c)){
                check.put(c,check.get(c)-1);
            }
        }
           
        String answer = "";
        
        for(String key : check.keySet()){
            if(check.get(key) ==1) answer += key;
        }
      
        return answer;
    }
}