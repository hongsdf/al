package Search;

import java.util.*;

// ���� �ʿ� (ctrl + ����Ű ����)
public class CardImportant {
	public static void main(String[] args) {
		Solution m = new Solution();
		int r = 1;
		int c = 0;
		int board[][] = new int[][] { { 1, 0, 0, 3 }, { 2, 0, 0, 0 }, { 0, 0, 0, 2 }, { 3, 0, 1, 0 } };
		int ans = m.solution(board, r, c);
		System.out.println(ans);
	}
}

class Solution {
	int Board[][]; // �ʵ�
	static final int INF = 987654321;

	class Point {

		Point(int x, int y, int t) {
			this.x = x;
			this.y = y;
			this.cnt = t;
		}

		int x, y, cnt; // ��, ��, ���� Ƚ��(�� ���������� ���� Ƚ�� : ���� �� �������� ���� ���� ���� Ƚ������)
	}

	static final int dx[] = { -1, 1, 0, 0 };
	static final int dy[] = { 0, 0, -1, 1 };

	public int bfs(Point src, Point to) { // Point src : ������, Point to : ������
		boolean[][] visited = new boolean[4][4];
		Queue<Point> q = new LinkedList<Point>();
		q.add(src); // src : Point ��ü
		while (!q.isEmpty()) {
			Point curr = q.poll();
			// ���� �������� 4���� ������
			if (curr.x == to.x && curr.y == to.y)
				return curr.cnt; // ������ ���������� ���� ���� Ƚ���� ����

			for (int i = 0; i < 4; i++) { // ����Ű 4���� ��ĭ�̵�
				int nr = curr.x + dx[i];
				int nc = curr.y + dy[i];
				if (nr < 0 || nr > 3 || nc < 0 || nc > 3)
					continue;
				if (!visited[nr][nc]) {
					visited[nr][nc] = true;
					q.add(new Point(nr, nc, curr.cnt + 1));// ���� ���� Ƚ�� + 1
				}
				// ���� ��ĭ�̵��� �����ϰ� +  4���� �ȿ� ctrlŰ ���� 
				// ctrl + ����Ű
				// �ִ� �ѹ��� 2���� ���� �ִ�.(*�ִ� Ƚ�� ã��*)
				for (int m = 0; m < 2; m++) {
					// 4������ ��ĭ ����ġ(���� ��ġ)
					if (Board[nr][nc] != 0)
						break; // ī�尡 ���� ��ġ�� ���� o
					// ������ �ʰ��ϸ� ���� ���� ��ġ : nr , nc�� ���� *��ĭ���� �̵��� ��ǥ*����
					// ctrl�� ������ �� �ִ� �� �Ǵ�

					if (nr + dx[i] < 0 || nr + dx[i] > 3 || nc + dy[i] < 0 || nc + dy[i] > 3)
						break;

					// ���� �ɸ��� ���� ���ٸ� ���� �ִ�. 
					nr += dx[i];
					nc += dy[i];
				}

				// ctrl�� ���� �Ǹ� Ȯ��
				if (!visited[nr][nc]) {
					visited[nr][nc] = true;
					q.add(new Point(nr, nc, curr.cnt + 1));
				}

			}

		}
		return INF;

	}

	// ������ ���� �޼���
	int Permute(Point src) {
		// 1���� ���� 2���� ���� Ƚ�� �� 2���� ���� 1���� ���� Ƚ���� �ٸ���
		// �׸��� 2���� 1���� ���ؼ��� 1[0] �� �����ϰ� 1[1]���� �Ͷ� 1[1]�� ���� 1[0]�� ���� Ƚ���� �ٸ���
		// �׷��� ���� Ž���� ������ ���� �ּ� ���� �����ϴ� ����
		int ret = INF;
		for (int num = 1; num <= 6; num++) {
			List<Point> card = new ArrayList<Point>();

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (Board[i][j] == num) {
						// �ش� num�� ī�带 ã���� card ����Ʈ�� �����Ѵ�(�� ��ȣ�� 2��)
						card.add(new Point(i, j, 0)); // ó�� ī�带 ã�°� 1,2,3 �� � �ͺ��� ��������
					}
				}
			}

			// ��ã������ ã�� �� ���� ����
			if (card.isEmpty()) {
				continue;

			}

			// ã�Ҵٸ� ������ -> ù��° + �ι�° ������ -> �ι�° + ù��° ��
			// +2 : �ΰ��� ī�带 ������ �ൿ cnt += 2
			int one = bfs(src, card.get(0)) + bfs(card.get(0), card.get(1)) + 2; // ������

			int two = bfs(src, card.get(1)) + bfs(card.get(1), card.get(0)) + 2; // ����

			// 2���� ī�带 Ȯ�� ������ ������ ǥ�� card.get(0)�� ��ǥ �� card.get(1)�� ��ǥ �� ��������Ѵ�.
//			for (int i = 0; i < 2; i++) {
//				Board[card.get(i).x][card.get(i).y] = 0;
//			}

			Board[card.get(0).x][card.get(0).y] = 0;
			Board[card.get(1).x][card.get(1).y] = 0;

			// ��� �Լ��� ���� 1��~3�� �����ϰ� + ���� ������ ī���� ����� ������ �� �������� (����)
			// �������϶� ���� num ����
//			ret = Math.min(ret, one + Permute(card.get(1)));
//			System.out.println(ret);
			// �����϶� ���� num ����
//			ret = Math.min(ret, two + Permute(card.get(0)));

			ret = Math.min(ret, one + Permute(card.get(1)));
			ret = Math.min(ret, two + Permute(card.get(0)));

			// ī�� �ٽ� ���� �ֳĸ�? 1��ī�带 �����ϰ� 2��ī�带 �����ϴ� �ͺ��� 2��ī�带 ���� �����ϰ� 1��ī�带 �����ϴ� ���� �����Ҽ� ��
			// �����Ƿ� ��� ��쿡 ���� ������,���������� �����ؾ��Ѵ�.

//			for (int i = 0; i < 2; i++) {
//				Board[card.get(i).x][card.get(i).y] = num;
//			}
			// ���� �� �� ���� ���� �� �ش�.
			Board[card.get(0).x][card.get(0).y] = num;
			Board[card.get(1).x][card.get(1).y] = num;

			if (ret == INF)
				return 0;
		}
		return ret;

	}

	public int solution(int[][] board, int r, int c) {
		Board = board;

		return Permute(new Point(r, c, 0)); // �ּ� ����� ���´�
	}

}