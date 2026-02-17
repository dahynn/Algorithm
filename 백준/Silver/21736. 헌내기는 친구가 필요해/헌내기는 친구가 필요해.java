import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static char[][] map;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static int N, M;
	static int doX, doY;
	static int cnt = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		StringBuilder sb = new StringBuilder();

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new char[N][M];
		visited = new boolean[N][M];
		cnt = 0;

		for (int i = 0; i < N; i++) {
			map[i] = br.readLine().toCharArray();
		}

		doX = 0;
		doY = 0;

		// 도연이의 위치
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 'I') {
					doX = i;
					doY = j;
				}
			}
		}


		bfs(doX, doY);

		sb.append(cnt == 0 ? "TT" : cnt);

		System.out.println(sb);

	}

	static void bfs(int x, int y) {

		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { doX, doY });
		visited[doX][doY] = true;

		while (!q.isEmpty()) {
			int[] curr = q.poll();

			for (int i = 0; i < 4; i++) {
				int nx = curr[0] + dx[i];
				int ny = curr[1] + dy[i];

				if (nx >= 0 && ny >= 0 && nx < N && ny < M && !visited[nx][ny] && map[nx][ny] != 'X') {

					if (map[nx][ny] == 'P')
						cnt++;

					visited[nx][ny] = true;
					q.add(new int[] { nx, ny });
				}
			}
		}

	}

}
