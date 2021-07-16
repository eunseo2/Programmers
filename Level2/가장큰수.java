import java.util.*;


public class 가장큰수 {
    public String solution(int[] numbers) {
	    String str_numbers[] = new String[numbers.length];
        String answer = "";
        
        for(int i=0; i<str_numbers.length; i++) {
		str_numbers[i] = String.valueOf(numbers[i]);
	        }
        

        Arrays.sort(str_numbers, (s1,s2) -> (s2+s1).compareTo(s1+s2));
        
        if(str_numbers[0].startsWith("0")){
           return "0";
        }else{
            for(int i=0; i<str_numbers.length; i++){
            answer += str_numbers[i];
          }
            
        }
        return answer;
    }  
}
