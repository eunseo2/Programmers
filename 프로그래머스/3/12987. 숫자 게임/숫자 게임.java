import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        
        int AIdx = 0;
        int BIdx = 0;
        int cnt = 0;

        while(AIdx < A.length && BIdx < B.length){
            if(A[AIdx] < B[BIdx]){
                cnt++;
                BIdx++;
                AIdx++;
                continue;
            }
            
            if(A[AIdx] > B[BIdx]){
                BIdx++;
                continue;
            }
            
            BIdx++;
        }
    
        
        
        return cnt;
    }
}