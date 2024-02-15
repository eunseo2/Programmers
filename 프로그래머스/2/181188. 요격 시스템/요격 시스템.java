import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 1;
        
        Arrays.sort(targets, (o1, o2) -> o1[0] - o2[0]);

		int start = targets[0][0];
		int end = targets[0][1];

		for (int i = 1; i < targets.length; i++) {
			int nextX = targets[i][0];
			int nextY = targets[i][1];
            
            
//             System.out.println("start : " + start);
//             System.out.println("end : " + end);
            
            
//             System.out.println("nextX : " + nextX);
//             System.out.println("nextY : " + nextY);

			if (nextX < end) {
				// start = Math.max(start, nextX);
				end = Math.min(end, nextY);
			} else {
				answer++;
				start = nextX;
				end = nextY;
			}
		}

        
        return answer;
    }
}