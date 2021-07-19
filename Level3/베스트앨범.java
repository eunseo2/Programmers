import java.util.*;
public class 베스트앨범 {
    public List<Integer> solution(String[] genres, int[] plays) {
        List<Integer> answers = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        
        for(int i=0; i< genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i],0)+plays[i]);
        }
        
        List<String> list= new ArrayList<>(map.keySet());
        
        Collections.sort(list, (s1,s2)->(map.get(s2).compareTo(map.get(s1))));
       
        for(String key: list){
            Map<Integer,Integer> play = new HashMap<>();
            for(int i=0; i<genres.length; i++){
                if(key.equals(genres[i])){
                    play.put(i,plays[i]);
                }
            }
            List<Integer> keyList = new ArrayList<>(play.keySet());
            keyList.sort((s1,s2)-> play.get(s2).compareTo(play.get(s1)));
            
            int j = 0;
            for(Integer k: keyList){
                if(j>1){
                    break;
                }
                answers.add(k);
                j++;
            }
            
        }
        
        return answers;
    }
}
