class Solution {
    public int solution(String dartResult) {
        int answer_arr[] = new int[3];
        int idx = 0;
        int intCnt = 0;
        
        for(int i=0; i<dartResult.length(); i++){
            char c = dartResult.charAt(i);
            int intC = c-'0';
            
            if(intC >=1 && intC<=9){
                answer_arr[idx] = intC;
                if(dartResult.charAt(i+1)-'0' == 0){
                    intC = 10;
                    i++;
                }
                answer_arr[idx] = intC;
                intCnt++;
            }else { // bonus & option
			switch(c) {
			case 'S' : // Single
				answer_arr[idx] = (int)Math.pow(answer_arr[idx], 1);
				idx++;
				break;
			case 'D' : // Double
				answer_arr[idx] = (int)Math.pow(answer_arr[idx], 2);
				idx++;
				break;
			case 'T' : // Triple
				answer_arr[idx] = (int)Math.pow(answer_arr[idx], 3);
				idx++;
				break;
			case '*' : // 스타상
				idx = idx - 2 < 0 ? 0 : idx - 2;
				while(idx < intCnt) {
					answer_arr[idx] = answer_arr[idx] * 2; 
					idx++;
				}
				break;
			case '#' : // 아차상
				answer_arr[idx-1] = answer_arr[idx-1] * (-1);
				break;
			}
		}
	}
	return answer_arr[0] + answer_arr[1] + answer_arr[2];
  }
                  
}