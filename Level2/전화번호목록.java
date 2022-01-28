import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        Map<String,Integer> map = new HashMap<>();
        
        for(String phone : phone_book){
            map.put(phone,1);
        }
        
        for(String key : phone_book){
            for(int i=1; i<key.length(); i++){
                String str = key.substring(0,i);
                if(map.containsKey(str)) {
                    System.out.println(key + " " + str);
                    return false;
                }
            }
        }
        return true;
    }
}