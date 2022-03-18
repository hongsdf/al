package djk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Floydwarshall {
	public static int N; // ��� ����
	public static int E; // ���� ��
	// ��� �������� ��� ������ ����
	// Floyd warshall :2���� �迭�� �����
	public static int[][] board;
	public static int INF = 987654321;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());

		board = new int[N + 1][N + 1];
		// board �ʱ�ȭ
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= N; j++) {
				if (i == j)
					board[i][j] = 0;
				else
					board[i][j] = INF;
			}
		}

		// �����Է�
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			board[u][v] = cost; // �� ���� �Է�
		}

		Floyd();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void Floyd() {
		for (int k = 1; k <= N; k++) { // �߰������� �߽��� �ȴ�
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (board[i][j] > board[i][k] + board[k][j]) {
						board[i][j] = board[i][k] + board[k][j];
					}
				}
			}
		}

	}
}
