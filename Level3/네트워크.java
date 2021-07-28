import java.util.*;

public class 네트워크 {
    static boolean[] visited;
    
    
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        
        int answer = 0;
        for(int i=0; i<n; i++){
            if(!visited[i]){
                 bfs(i,computers,visited,n);
                 answer++;
            }
        }
        
        return answer;
    }
    
    public static void bfs(int start, int[][]computers, boolean[]visited, int n){
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(start);
        visited[start] = true;
        
        while(!q.isEmpty()){
            int x = q.poll();

            for(int i=0; i<n; i++){
                if(!visited[i] && computers[x][i] == 1 ){
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