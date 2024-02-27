import java.util.Objects;

class Solution {
    public int solution(String[] board) {
        
        String boardMap[][] = new String[3][3];

		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++)
				boardMap[i][j] =String.valueOf(board[i].charAt(j));
		}

		int cntO = 0;
		int cntX = 0;

		for(int i=0; i<boardMap.length; i++){
			for(int j=0; j<boardMap.length; j++){
				if(Objects.equals(boardMap[i][j], "O")){
					cntO++;
				}else if(Objects.equals(boardMap[i][j], "X")){
					cntX++;
				}
			}
		}
        
        if (cntX - cntO > 0 || cntO - cntX > 1) {
            return 0;
        }
        
        boolean bingo_o = check("O", boardMap);
        boolean bingo_x = check("X", boardMap);
        
        
        if (bingo_o && cntX + 1 != cntO)
            return 0;
        
        if (bingo_x && cntX != cntO)
            return 0;

        return 1;
    }
    
    private boolean check(String target, String[][] map) {
        // 가로
        for(int i = 0; i<3; i++) {
            if (map[i][0].equals(target) && map[i][1].equals(target) && map[i][2].equals(target))
                return true;
        }
        
        // 세로
        for(int i = 0; i<3; i++) {
            if (map[0][i].equals(target) && map[1][i].equals(target) && map[2][i].equals(target))
                return true;
        }
        
        // 대각선
        if (map[0][0].equals(target) && map[1][1].equals(target) && map[2][2].equals(target))
            return true;
        
        if (map[2][0].equals(target) && map[1][1].equals(target) && map[0][2].equals(target))
            return true;
        
        return false;
    }

}