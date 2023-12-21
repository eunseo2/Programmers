import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
            int answer = 0;
        
        int[] tangerineTypeSize = new int[10000001];
        
        for(int tangerineType : tangerine){
            tangerineTypeSize[tangerineType] +=1;
        }
        
        List<Integer> tangerineTypeList = new ArrayList<>();
        
        for(int tangerineType : tangerineTypeSize){
            
            tangerineTypeList.add(tangerineType);
        }
        
        Collections.sort(tangerineTypeList, Comparator.reverseOrder());
        
        
        for(int i= 0; i<tangerineTypeList.size(); i++){
            if(k <= 0) break;
             int size = tangerineTypeList.get(i);  
             k -= size;
             answer++;
        }
        

        return answer;
    }
}