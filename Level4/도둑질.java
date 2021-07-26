public class 도둑질 {
    public int solution(int[] money) {
        int[] one = new int[money.length];
        int[] last = new int[money.length];
        
        one[0] = money[0];
        one[1] = money[0];
          
        last[1] = money[1];
        
        for(int i=2; i<last.length; i++){
            one[i] = Math.max(one[i-2]+money[i],one[i-1]);
            last[i] = Math.max(last[i-2]+money[i],last[i-1]);
        }
        
        return Math.max(one[money.length-2],last[money.length-1]);
    }
}
