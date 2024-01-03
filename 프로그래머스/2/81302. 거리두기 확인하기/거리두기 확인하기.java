import java.util.*;

class Solution {
    static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};
	static boolean safe = true;
    
    public List<Integer> solution(String[][] places) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < places.length; i++) {
			String arr[][] = new String[5][5];
			for (int j = 0; j < places.length; j++) {
				for (int k = 0; k < 5; k++) {
					arr[j][k] = String.valueOf(places[i][j].charAt(k));
				}

			}

			safe = checkManhattenArea(arr);

			if (safe) {
				answer.add(1);
			} else {
				answer.add(0);
			}

		}
        
        return answer;
    }
    
    private boolean checkManhattenArea(String[][] arr) {
		for (int q = 0; q < 5; q++) {
			for (int w = 0; w < 5; w++) {
				if (arr[q][w].equals("P")) {
					if (!bfs(q, w, arr)) {
						return false;
					}
				}
			}
		}

		return true;
	}

	public boolean bfs(int i, int j, String[][] arr) {
		boolean visited[][] = new boolean[5][5];

		Queue<Integer> queue = new LinkedList<>();
		queue.add(i);
		queue.add(j);
		queue.add(0);
		visited[i][j] = true;

		while (!queue.isEmpty()) {
			int prevX = queue.poll();
			int prevY = queue.poll();
			int depth = queue.poll();

			for (int k = 0; k < 4; k++) {
				int nextX = prevX + dx[k];
				int nextY = prevY + dy[k];

				if (nextX < 0 || nextY < 0 || nextX >= arr.length || nextY >= arr.length) {
					continue;
				}

				if (visited[nextX][nextY] || arr[nextX][nextY].equals("X")) {
					continue;
				}

				if (arr[nextX][nextY].equals("P") && depth + 1 <= 2) {
					return false;
				}

				queue.add(nextX);
				queue.add(nextY);
				queue.add(depth + 1);
				visited[nextX][nextY] = true;
			}
		}

		return true;
	}
}