import java.util.*;

class Solution {
    
    class Pair {
        int cur;
        int depth;
        
        Pair(int cur, int depth){
            this.cur = cur;
            this.depth = depth;
        }
    }
    
    static int answer = 0;

    public int solution(int[] numbers, int target) {
        bfs(numbers[0],numbers,target);
        return answer;
    }
    
    public void bfs(int num, int[] numbers, int target){
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(num,0));
        q.offer(new Pair(-num,0));
        
        while(!q.isEmpty()){
            Pair p = q.poll();
            if(p.depth == numbers.length-1){
                if(p.cur == target){
                    answer++;
                    }
                continue;
                }
            
            q.offer(new Pair(p.cur+numbers[p.depth+1], p.depth+1));
            q.offer(new Pair(p.cur-numbers[p.depth+1], p.depth+1));    
        }
    }
    
}