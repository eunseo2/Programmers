import java.util.*;
public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int value: reserve){
            set2.add(value);
        }
        
        for(int value: lost){
           if(set2.contains(value))
                set2.remove(value);
            else 
                set1.add(value);
        }
          
   
        HashSet<Integer> Remove = new HashSet<>();
        for (Integer value : set1) 
                Remove.add(value);
        
        for(int value: Remove){
            if(set2.contains(value-1)){
                set1.remove(value);
                set2.remove(value-1);
            }else if(set2.contains(value+1)){
                set1.remove(value);
                set2.remove(value+1);
            }
        }
    
        
        return n- set1.size();
    }
}
