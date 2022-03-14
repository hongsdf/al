package djk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class dijkatra_review {
	public static int N, E, start; // ��� ����, ��������, ���۳��
	public static int board[][]; // ������� ǥ��
	public static int d[]; // ��� �������� ��� ���������� �ѹ��� �Ÿ�(���ͽ�Ʈ�� �ٽ�)
	public static boolean visited[]; // ��� �湮���� üũ
	public static int INF = 987654321;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(br.readLine());
		board = new int[N + 1][N + 1];
		d = new int[N + 1];
		visited = new boolean[N + 1];
		// board �迭 �ʱ�ȭ �ִ밪����(�ּڰ��� ã�� ����)
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (i == j)
					board[i][j] = 0;
				else
					board[i][j] = INF;
			}
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken()); // u����
			int v = Integer.parseInt(st.nextToken()); // v��
			int cost = Integer.parseInt(st.nextToken());
			// �ܹ��� �׷���
			board[u][v] = cost;
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

		dijk(start); // ���ͽ�Ʈ�����

		for (int i = 1; i <= N; i++) {
			if (d[i] == INF)
				System.out.println("INF");
			else
				System.out.println(d[i]);
		}

	}

	public static void dijk(int start) {
		// ���ÿ� q�� ��ť�� �Ǿ��ٸ� ����ũ��� �����Ѵ�
		// [0] : ����ȣ , [1] :����ũ��
		PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> (a[1] - b[1])); // [0] :��� ��ȣ, [1] : ����ũ��, ����ũ�⺰��
		// d[] �迭 �ʱ�ȭ : ó������ ��� �ִ밪���� �ʱ�ȭ�ϰ� �����Ѵ� ���
		for (int i = 1; i <= N; i++) {
			d[i] = INF;
		}
		q.offer(new int[] { start, 0 }); 
		d[start] = 0;  // ���������� �ڱ��ڽŰ��� �Ÿ� 0

		while (!q.isEmpty()) {
			int curr[] = q.poll();
			int idx = curr[0];
			if (visited[idx]) continue;
			visited[idx] = true;
			for (int i = 1; i <= N; i++) { // ��� ������ ����Ǿ������� ������ �ȴ�.
				// d[] : ������������ Ư���������� �ٷ� �̵��� �Ÿ�
				// d[i] : ���۳�忡�� i�������� �ٷ� �̵��� �Ÿ�
				// d[idx]:���۳�忡�� �߰�����(idx)���� �̵� + board[idx][i] : �߰��������� ������������ �Ÿ�
				if (d[i] > d[idx] + board[idx][i]) {
					d[i] = d[idx] + board[idx][i];
					q.offer(new int[] {i, d[i] });
				} 
			}
		}
	}
}
