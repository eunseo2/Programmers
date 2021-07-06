import java.util.*;

class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> map = new HashMap<>();
  
            
        for(String key : participant){
            
            if(!map.containsKey(key))
                map.put(key,1);
            else{
               map.put(key,map.get(key)+1);
            }
        }
        
        for(String key: completion){
            map.put(key, map.get(key)-1);
        }
        
        for(String key : map.keySet()){
            if(map.get(key) ==1) answer = key;
        }


        return answer;
    }
}