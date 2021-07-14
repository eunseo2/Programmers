import java.util.*;

public class 네트워크 {
    static boolean[] visited;
    
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                System.out.print(i);
                bfs(computers,i);
                answer++;
            }
        }
        return answer;

        

    }
    
    public void bfs(int[][]computers,int node){
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(node);
        
        visited[node] = true;
        
        while(!q.isEmpty()){
            int x = q.poll();
            
            for(int i=0; i<computers.length; i++){
                if(!visited[i] && x!=i && computers[x][i] == 1){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
    
}

//dfs 풀이법
// class Solution {
    
//     static boolean[] visited;
//     public int solution(int n, int[][] computers) {
//         int answer = 0;
//         visited= new boolean[n];
//         for(int i=0; i<n; i++){
//             if(!visited[i]){
//                 dfs(n,computers,i);
//                 answer++;   
//             }
//         }
//         return answer;
//     }
    
//     public void dfs(int n, int[][]computers, int node){  
//         visited[node] = true;
        
//         for(int i=0; i<n; i++){
//             if(!visited[i]&& i!= node && computers[node][i]==1){
//                 dfs(n,computers,i);
//             }
//         }
//     }
// }