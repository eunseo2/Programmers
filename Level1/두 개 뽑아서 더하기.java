import java.util.HashSet;
import java.util.Arrays;


class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<numbers.length; i++){
            for (int j = i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        int  [] answer = new int[set.size()];
        
        int cnt = 0;
        for (int arr : set){
            answer[cnt++] = arr;
        }
        
        Arrays.sort(answer);
            
        return answer;
        
    }
}