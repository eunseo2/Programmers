import java.util.*;

public class 전화번호목록 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Map<String,Integer> map = new HashMap<>();
        
        for(int i=0; i< phone_book.length; i++)
            map.put(phone_book[i],i);
            
        for(String str : phone_book){
            for(int i = 0; i < str.length(); i++){
                String value = str.substring(0, i);  
                
                if( map.containsKey( value ) ){
                    return false;
                }
            }
        }
        return answer;
    }
}

// import java.util.*;
// class Solution {
//     public boolean solution(String[] phone_book) {
//          Arrays.sort(phone_book);
        
//          for(int i=0; i<phone_book.length-1; i++){
//              for(int j=i+1; j<phone_book.length; j++){
                 
//                 if(phone_book[i].startsWith(phone_book[j])) {return false;} 
//                  if(phone_book[j].startsWith(phone_book[i])) {return false;}
//              }
//          }
//         return true;
//     }
// }
