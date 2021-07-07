import java.util.*;


class 크레인인형뽑기게임 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int move : moves){
            for(int i=0; i< board.length; i++){
                if(board[i][move-1]!=0){
                    
                    if(stack.size()>=1 && stack.peek()== board[i][move-1]){
                        stack.pop();
                        answer+=2;
                    }else{
                      stack.push(board[i][move-1]);  
                    }
            
                    board[i][move-1] =0; 
                    break;
                }
            }
        }
        return answer;
    }
    
}
