import java.util.*;

class Solution {
    static boolean[][] visited;
	static int[] landColMax;

	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};
    
    public int solution(int[][] land) {
        int answer = 0;
        
        visited = new boolean[land.length][land[0].length];
		landColMax = new int[land[0].length];


		for (int i = 0; i < land.length; i++) {
			for (int j = 0; j < land[i].length; j++) {
				if (!visited[i][j] && land[i][j] == 1) {
					bfs(i, j, land);
				}
			}
		}

		Arrays.sort(landColMax);

		return landColMax[land[0].length - 1];
    }
    
    public int bfs(int i, int j, int[][] land) {
		int cnt = 1;
		boolean cols[] = new boolean[land[0].length];
		Queue<Integer> queue = new LinkedList<>();
		queue.add(i);
		queue.add(j);

		while (!queue.isEmpty()) {
			int prevX = queue.poll();
			int prevY = queue.poll();
			visited[prevX][prevY] = true;
			if (!cols[prevY]) {
				cols[prevY] = true;
			}

			for (int k = 0; k < 4; k++) {
				int nextX = prevX + dx[k];
				int nextY = prevY + dy[k];

				if (nextX < 0 || nextY < 0 || nextX >= land.length || nextY >= land[0].length) {
					continue;
				}

				if (!visited[nextX][nextY] && land[nextX][nextY] == 1) {
					cnt++;
					visited[nextX][nextY] = true;
					queue.add(nextX);
					queue.add(nextY);

					if (!cols[nextY]) {
						cols[nextY] = true;
					}
				}
			}
		}

		for (int k = 0; k < cols.length; k++) {
			if (cols[k]) {
				landColMax[k] += cnt;
			}
		}

		return cnt;
	}
}