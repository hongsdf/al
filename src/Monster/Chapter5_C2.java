package Monster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Chapter5_C2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken()); // �������� ��
			int M = Integer.parseInt(st.nextToken()); // ���� Ƚ��
			Queue<Player> q = new LinkedList<>();
			// Player�� ����
			List<Player> list = new ArrayList<>();
			for (int i = 0; i < N; i += 1) {
				list.add(new Player(i + 1));
			}

			// ť�� ����
			for (Player p : list) {
				q.add(p);
			}

			// �������
			List<Player> result = new ArrayList<>();

			// ����
			// �������� ����ŭ ���� �ݺ�
			for (int i = 0; i < N; i += 1) {
				// ���� ������ ������ ����
				// 1�� ���ؾ��Ѵ� 0���� �����Ƿ� 
				int jump = 1 + (M-1) % q.size(); 
				// ���� ������ �� 2���� ����
				for (int j = 0; j < jump - 1; j++) {
					// 1 �ٽ� ť�� ����(Ż�� ���� �ʴ� ����)
					Player p = q.poll();
					q.add(p);
				}

				// 2 Ż�� �� ���� ã��
				result.add(q.poll());

			}
			
			for(int i = 0; i<result.size(); i++) {
				Player p = result.get(i);
				System.out.print(p.index+" ");
			}
			System.out.println();
		}

	}
}

class Player {
	int index;

	Player(int index) {
		this.index = index;
	}
	
	
}