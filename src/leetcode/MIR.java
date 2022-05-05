package leetcode;

import java.util.*;

public class MIR {
	public static int n,m;
	public static int dx[] = {-1,1,0,0};
	public static int dy[] = {0,0,-1,1};
	public static int[][] board;
	public static boolean visit[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		board = new int[n][m];
		visit = new boolean[n][m];
		for(int i = 0; i<n; i++) {
			String s = sc.next();
			for(int j = 0; j<m; j++) {
				board[i][j] = s.charAt(j) -'0';
			}
		}
		bfs(0,0); //������
		// ���� ���������� 4,5�� �ƴ϶� 0,5��� ���������� ���� �����ָ� �ȴ�.
		System.out.println(board[0][5]);
		// System.out.println(board[n-1][m-1]);
		
	}

	private static void bfs(int r, int c) {
		Queue<int[]> q =new LinkedList<>();
		q.add(new int[] {r,c});

		visit[r][c] = true;
		while(!q.isEmpty()) {
			int[] curr = q.poll();
			int x = curr[0];
			int y = curr[1];

			for(int i = 0; i <4; i++) {
				int nr = x + dx[i];
				int nc = y + dy[i];
				if(nr < 0 || nr > n-1 || nc < 0 || nc > m-1 ) continue;
				if(!visit[nr][nc] && board[nr][nc] == 1) {
					board[nr][nc] = board[x][y] +1;
					q.add(new int[] {nr,nc});
					visit[nr][nc] = true;
				}
			}
		}
		
	}
}
