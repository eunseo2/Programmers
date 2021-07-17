import java.util.*;
public class 입국심사 {
    public long solution(int n, int[] times) { 
        Arrays.sort(times);
        long start = 0;
        long end = (long)n*times[times.length-1];
        
        return binarySearch(times, n, start, end);
    }
    
    public long binarySearch(int[]times,int n, long start, long end){
        long answer =0;
        while(start <= end){
            long mid = (start+end)/2;
            long sum=0;
            
            for(int i=0; i<times.length; i++){
                sum += mid/times[i];
            }
            if (sum < n) { 
                start = mid + 1;
            } else { 
                end = mid - 1;
                answer = mid;
            }
        }
        return answer;
    }
}
