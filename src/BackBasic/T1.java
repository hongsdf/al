package BackBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class T1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			// �Է��� 
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			LinkedList<int []> q = new LinkedList<>();
			st = new StringTokenizer(br.readLine()," ");
			for(int i = 0; i<N; i++) {
				q.add(new int[] {i,Integer.parseInt(st.nextToken())});
			}
			int cnt = 0;
			while(!q.isEmpty()) {
				int curr[] = q.poll();
				boolean flag  = true; // ���� ���� ���� ū ��
				
				// ��� ���Ұ� ��� ���Ҷ� ��
				// 2�� for��
				for(int i = 0; i <q.size(); i++) {
					
					// Ư�� ���� ���� ���� ���� ū�� �ƴҶ� ���� �ɰ��̴�. 
					if(curr[1] < q.get(i)[1]) {
						q.add(curr); // ���� ū���� �ƴϹǷ� �ڿ� ��ť
						
						// ������ �� ���� ū�� ������ ������ �ٽ� �ڿ� ��ť
						for(int j = 0; j<i; j++) {
							q.add(q.poll()); // 0 ~ i�� ������ 
						}
						
						flag = false; // ���� ū���� �̴Ͼ���
						break; // �� ���Ұ� �񱳰� ����
						
						
						
					}
					
				}
				
				if(!flag) continue; //�׷� �ٽ� while������ ���ư��� �ٸ����Ҹ� ã�ƺ� ����
				
				// ������� �Ѿ� �Ӵٸ� ť�� ������ �Ǿ� ���� ���̴� (�߿䵵)
				
				cnt++;
				
				// �־��� �����ϸ� q�� ������� �ʰ� �� ���ѷ��� �׷��� �������� break�� �ɾ���ߵ�
				// ������ ���� ū���� �� �տ� ���̰� �Ǹ� break;
				
				
				if(curr[0] == M) {
					break;
				}
				
			}
			
			System.out.println(cnt);
			
		}
	}
}
