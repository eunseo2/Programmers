import java.util.*;


public class 주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> s = new Stack<>();
        
        for(int i=0; i<prices.length; i++){
            while(!s.empty() && prices[s.peek()] > prices[i]){                
                answer[s.peek()] = i - s.peek();
                s.pop();
            }           
            s.push(i);    
        }
        
        while(!s.empty()){
            answer[s.peek()] = prices.length-s.peek()-1;
            s.pop();
        }
        
        return answer;
    }
}
