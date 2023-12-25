class Solution {
    public long solution(int w, int h) {
        
        long gcd = 0;
        
        long min = Math.min(w, h);
        
        for(int i=1; i<=min; i++){
            if(w % i == 0 && h % i ==0) {
                gcd = Math.max(gcd, i);
            }
        }
        
        
        return ((long) w * h) - ((w /gcd)  + (h /gcd) - 1) * gcd;
    }
}