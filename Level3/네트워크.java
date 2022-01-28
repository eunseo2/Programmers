import java.util.*;
class Solution {
    static boolean visited[] = new boolean[201];
    static int cnt = 0;
    
    public int solution(int n, int[][] computers) {
        
        for(int i=0; i<computers.length; i++){
            if(!visited[i]){
                bfs(i,computers);
            }
        }    
        return cnt;
    }
    
    public static void bfs(int i, int[][] computers){
        cnt++;
        visited[i] = true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        
        while(!q.isEmpty()){
            int now = q.poll();
            
            for(int h=0; h<computers.length; h++){
                if(now !=h && computers[now][h] == 1 && visited[h] == false){
                    q.offer(h);
                    visited[h] = true;
                }
            }
        }
    } 
}