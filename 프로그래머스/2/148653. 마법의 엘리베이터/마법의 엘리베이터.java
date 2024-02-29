class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while(storey > 0){
			int onesPlace = storey % 10;
			storey /= 10;

			if(onesPlace < 5){
				answer += onesPlace;
			}else if(onesPlace >5){
				answer +=  10 - onesPlace;
				storey+=1;
			}

			if(onesPlace == 5){
				int tensPlace = storey  % 10;
				if(tensPlace >= 5){
					storey += 1;
					answer += 10 - onesPlace;
				}else {
					answer += onesPlace;
				}
			}

		}
        
        return answer;
    }
}