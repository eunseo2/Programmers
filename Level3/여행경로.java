import java.util.*;

public class 여행경로 {
    boolean[] visited;
    ArrayList<String> answers;
    
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        answers = new ArrayList<String>();
        int count =0;
        dfs(count,"ICN","ICN",tickets);
        Collections.sort(answers);
        String[] answer = answers.get(0).split(" ");
        return answer;
    }
    
    public void dfs(int count, String start, String answer, String[][]tickets ){

        if(count == tickets.length){
            answers.add(answer);
            return;
        }
        for(int i=0; i< tickets.length; i++){
            if(!visited[i] && tickets[i][0].equals(start)){
                visited[i]=true;
                dfs(count+1, tickets[i][1], answer+ " "+tickets[i][1], tickets);    
                visited[i]=false;

            }
        }
        return;
    }
}
