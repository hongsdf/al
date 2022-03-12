package que;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

// �߿䵵�� ���� ������� ����Ͻÿ�
public class Backjoon {
	public static void main(String[] args) throws NumberFormatException, IOException {

		// 0 1 2 3
		// 4 2 3 1

		// int n = 4;
//		int m = 3 �ñ��� �ε��� int m = 2; int m = 0;
		// return 4; return 2; return 1;

		// q�� ���� �Ǵ� ������ int []

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while (T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			LinkedList<int[]> q = new LinkedList<int[]>();
//			LinkedList<List<Integer>> q = new LinkedList<>() ;
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) {
//				q.add(j, Integer.parseInt(br.readLine())); �߸��� ǥ��
				q.add(new int[] { j, Integer.parseInt(st.nextToken()) });
				// list �� ���� ������
//				q.add(Arrays.asList(Integer.parseInt(br.readLine())));
			}

//			int count = 0;
//			while (!q.isEmpty()) {	// �� ���̽��� ���� �ݺ���
//				System.out.println("======= ���� ���� =======");
//				int[] front = q.poll();	// ���� ù ����
//				boolean isMax = true;	// front ���Ұ� ���� ū ���������� �Ǵ��ϴ� ����
//				
//				// ť�� �����ִ� ���ҵ�� �߿䵵�� �� 
//				for(int i = 0; i < q.size(); i++) {
//					
//					// ó�� ���� ���Һ��� ť�� �ִ� i��° ���Ұ� �߿䵵�� Ŭ ��� 
//					if(front[1] < q.get(i)[1]) {
//						System.out.println("[i] :"+ i);
//						System.out.println("front[1] : "+front[1]);
//						System.out.println("q ��"+q.get(i)[1]);
//						
//						// ���� ���� �� i ������ ���ҵ��� �ڷ� ������.
//						q.offer(front); // �� �ڿ� ���Ұ� �� ũ��
//						for(int u = 0; u<q.size(); u++) {
//							System.out.print(q.get(u)[1]+" ");
//						}
//						System.out.println();
//						// i ���� ���ҵ��� �ڷ� ������
//						for(int j = 0; j < i; j++) {
//							q.offer(q.poll());
//						}
//						System.out.println("������");
//						for(int u = 0; u<q.size(); u++) {
//							System.out.print(q.get(u)[1]+" ");
//						}
//						System.out.println();
//						// front���Ұ� ���� ū ���Ұ� �ƴϿ����Ƿ� false�� �ϰ� Ž���� ��ħ
//						isMax = false;
//						break;
//					}
//				}
//				if(isMax == false) {
//					System.out.println("contuinu ����");
//					continue;
//				}
//				
//				// front ���Ұ� ���� ū ���ҿ����Ƿ� �ش� ���Ҵ� ����ؾ��ϴ� ������.
//				count++;
//				if(front[0] == m) {	// ã���� �ϴ� ������� �ش� �׽�Ʈ���̽� ����
//					// fornt[0] == m�� ���� ���� 
////					�������� �� �� �´�. 
//					break;
//				}
			int cnt = 0;
			while (!q.isEmpty()) {
				int temp[] = q.poll();
				boolean flag = true;

				for (int i = 0; i < q.size(); i++) {
					if (temp[1] < q.get(i)[1]) {
						q.offer(temp); // temp �� ���� temp 0 : �̷� ����
//						                                 2

						// 1 1 9 1 1 1
						// 1 < 1
						// 1 9 1 1 1
						// 1 < 9 i :1
						// 1 9 1 1 1 1
						// 9 1 1 1 1 1
						// 9 < 1 i :2
						// 1 1 1 1 1

						// 1 < 1 i :3
						// 1 1 1 1
						// 1 1 1 i :4
						// 1 1 i : 5

						// [1] 1 9 1 1 1 cnt :1
						// 1 9 1 1 1 [1]
						// 9 1 1 1 [1] 1
						// 1 1 1 [1] 1 cnt :2
						// 1 1 [1] 1 1 cnt :3
						// 1 [1] 1 1 1 cnt :4
						// [1] 1 1 1 1 cnt :5
						// �ᱹ ��ȣ ���� 1�̿��� [1] ã�� 

						// �ߺ� ���� ���� �Ǿ������� �ѱ�� ���
						// ���� ���� ���̰� ���� ���� �ȵ�

						for (int j = 0; j < i; j++) {
							q.offer(q.poll());
						}
						flag = false;
						break;
					}
					
				}
				if (flag == false) {
					continue;
				}
				cnt++;
				// temp[0] : �ᱹ temp[0]�� ���� ���� ���� ū ��
				if (temp[0] == m) { // ã�� �ε��� ��ġ == �Է��� �ε���
					// temp[0] : �ε����� ��Ÿ����
					// temp[1] : ���� ��Ÿ����
//					System.out.println("ã�� �ε���"+temp[0]); //temp[0] : ã�� �ε��� ��ġ�� ��Ÿ��
//					System.out.println("ã�� ��"+temp[1]);
					break;
				}

			}
			System.out.println(cnt);

		}
	}
}
