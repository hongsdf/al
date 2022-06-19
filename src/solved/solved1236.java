package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solved1236 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char board[][] = new char[n][m];
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				board[i][j] = str.charAt(j);
			}
		}

		// ����
		// ���� �� ���Ǹ鼭 x�� �����ϸ� continue;
		// ������ ������ ���� ������ cnt+=1
		
		// ������ ROW, COL�� ���� 2���� ������ �����ϰ� ���� �ִ밪���� ����Ѵ�.
		// ����: �� ,��� ���� �ּҰ��� �ٸ��� �ϳ��� �������� �ʴ°��̹Ƿ� 2���� �ִ밪�� �ּҰ��� ����� ������ �ȴ�.
		// ex)
		

		// �࿡ ���� �ּ� ��
		int row = 0;
		for (int i = 0; i < n; i += 1) {
			boolean flag = true;
			for (int j = 0; j < m; j += 1) {
				if (board[i][j] == 'X') {
					flag = false;
				}
			}
			if (flag == false) {
				continue;
			} else {
				row++;
			}
		}

		// ���� ���� �ּ� ��
		int col = 0;
		for (int i = 0; i < m; i += 1) {
			boolean flag = true;
			for (int j = 0; j < n; j += 1) {
				if (board[j][i] == 'X') {
					flag = false;
				}
			}
			if (flag == false) {
				continue;
			} else {
				col++;
			}
		}
		// 2�� �� �ִ� ������ ��� : col == 1, row == 3
		// col�������δ� 1�������� -> ����x
		// row�������� 3���̴�  -> ���� o
		System.out.println(Math.max(row, col));
	}
}
