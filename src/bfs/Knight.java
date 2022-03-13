package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// ��,��,��,�� �̵��ϴ� ������� 

// ���ο� �̵� ��� ����
// ŷ�� ��� �ּ� Ƚ��

public class Knight {
	static class knight {
		int x, y, dist;

		public knight(int x, int y, int dist) {
			this.x = x;
			this.y = y;
			this.dist = dist;
		}
	}

	// ü����
	public static int R;
	public static int C;

	public static char[][] chess;
	public static boolean[][] visited;

	private static final char KNIGHT_START = 'S'; // ���� ��ġ
	private static final char KNIGHT_BLOCK = 'X'; // ������ ����
	private static final char KNIGHT_END = 'E'; // ŷ��ġ

	public static int[] dx = { -1, -2, -2, -1, 1, 2, 2, 1 };
	public static int[] dy = { -2, -1, 1, 2, 2, 1, -1, -2 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		chess = new char[R][C];
		visited = new boolean[R][C];
		for (int i = 0; i < R; i++) {
			String str = br.readLine(); // SXOOO 1��
			for (int j = 0; j < C; j++) {
				char c = str.charAt(j); // SXOOO���� �����̴� ������ S,X ,O, O, O
				chess[i][j] = c;
			}
		}
		
		
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print(chess[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (chess[i][j] == KNIGHT_START) {
					bfs(i, j);

				}
			}
		}

	}

	private static void bfs(int r, int c) {
		Queue<knight> q = new LinkedList<>();
		int dist = 1;
		q.add(new knight(r, c, dist));
		while (!q.isEmpty()) {
			knight curr = q.poll();
			int row = curr.x; //���縻�� ��ǥ
			int col = curr.x; //���縻�� ��ǥ
			dist = curr.dist; // ���縻�� �̵��� Ƚ��(ó�� ������ 1,
			// q�� �׿����� ��ť�Ǹ� �׽����� dist +1

			// ���� ��ǥ �湮���� üũ
			if(visited[row][col]) continue;
			visited[row][col] = true;

//			 
			for (int i = 0; i < 8; i++) {
				int nr = row + dx[i];
				int nc = col + dy[i];

				// ���� üũ, ��Ȯ��
				if (nr < 0 || nr > R - 1 || nc < 0 || nc > C - 1 || chess[nr][nc] == KNIGHT_BLOCK) continue;
				// �湮���� Ȯ��, �� Ȯ��

				// ���� ���� ���
				if (chess[nr][nc] == KNIGHT_END) {
					System.out.println(dist);
					return;
				}
				
				if(!visited[nr][nc]) { 
					q.add(new knight(nr, nc, dist+1)); // ���ο� ��ǥ�� �߰�

				}

			}

		}
		// �߰����� ���ϸ�
		System.out.println(-1);

	}
}
