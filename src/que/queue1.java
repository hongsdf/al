package que;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
//public class queue1 {
//	public static void main(String[] args) throws NumberFormatException, IOException {
////		4 2 2��° �� ����ϴ� �� 3�� �ε��� ��� : 2
////		1 2 3 4
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
////		List<Integer> list = new ArrayList<>();
//		StringTokenizer st;
////		int arr[] = new int[101];
////		Queue<Integer> q = new LinkedList<Integer>();
//		LinkedList<int[]> q = new LinkedList<int[]>();
//		
//		while(n --> 0) {
//			st = new StringTokenizer(br.readLine()," ");
//			int N = Integer.parseInt(st.nextToken() );
//			int M = Integer.parseInt(st.nextToken() );
////			System.out.println("enter");
////			int arr[] = new int[N];
//			int count = 0;
//			st = new StringTokenizer(br.readLine()," ");
//			for(int i=0; i<N; i++) {
////				new int[] { i, Integer.parseInt(st.nextToken()) }
//				// �߿� 
////				q.offer(new int[]{ i, Integer.parseInt(st.nextToken())});
//				
//				
//				// *���� �����ϱ�
//				q.add(new int[] { i    ,   Integer.parseInt(st.nextToken())}); // int[] �迭�� ( x��ǥ, y��ǥ  ) �������� ��
////				q.offer(null);
////				System.out.println();
//			}
////			System.out.println("���� ���");
//			//2 �� �ε����� 3���� ����Ű�� 3���� �ε��� 2
//			
//			while(!q.isEmpty()) {
//				// *���� �����ϱ�
//				int front[] = q.poll();
//				boolean flag = true; // ���� ù��° ���Ұ� ���� ũ�ٶ�� ��.
//				
//				
//				
////				for(int a: front)
////				System.out.print(a+" "); // *0 1  *1 2 *2 3 *3 4 �̷��� ��µ� : *�ε��� ��ȣ�� ��Ÿ��
////				// 
//				for(int i =0; i<q.size(); i++) {
//					// *���� �����ϱ�
//					if(front[1] < q.get(i)[1]) {
//						// *���� �����ϱ�
//						q.add(front); // �ڿ� �߿䵵�� �� ū ���� �����ϸ� �տ� �ִ� �͵��� ��� �ڷ� ������ �۾�
////						System.out.println("front�� �ǹ� :"+front);
//						// *���� �����ϱ�
//						flag = false; // �ڿ� �� ū ���Ұ� �ִ�.���  ��
//					}
//				}// ����� �Ѿ� ���� �����ѹ� ������ �Ǿ���.
//				//  ����(�ڿ� �� ū �߿䵵�� ������)�� �Ǹ� flag�� true�� �ٲ۴�
//				// �׸��� ���� ã�����ϴ� M(�ε��� M��° ���Ұ� ��µǴ� ����(count)
//				
//				// *���� �����ϱ�
//				if(flag) {
//					// *���� �����ϱ�
//					count++;
//					// *���� �����ϱ�
//					if(front[0] == M) break; // �̰��� ã�Ҵ�
//				}else {              //     index
//			//       ã���� �ϴ� ���� �ƴϸ� �ٽ� while������ ���ư� ����
//					// *���� �����ϱ� 
//					q.add(front); //front :  0  1  2   �̷������� �Ǿ�����(2���� ����)
////					                      :  5  3  4
//				}
//			}
//			
//			System.out.println(count);
//		}
//		
//	}
//}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
import java.util.StringTokenizer;
import java.util.LinkedList;
 
public class queue1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());	// �׽�Ʈ ���̽� 
 
		while (T-- > 0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			LinkedList<int[]> q = new LinkedList<>();	// Queue�� Ȱ�� �� ���Ḯ��Ʈ
			st = new StringTokenizer(br.readLine());
 
			for (int i = 0; i < N; i++) {
				// {�ʱ� ��ġ, �߿䵵}
				q.offer(new int[] { i, Integer.parseInt(st.nextToken()) });
			}
 
			int count = 0;	// ��� Ƚ��
			
			while (!q.isEmpty()) {	// �� ���̽��� ���� �ݺ���
				
				int[] front = q.poll();	// ���� ù ����
				boolean isMax = true;	// front ���Ұ� ���� ū ���������� �Ǵ��ϴ� ����
				
				// ť�� �����ִ� ���ҵ�� �߿䵵�� �� 
				for(int i = 0; i < q.size(); i++) {
					
					// ó�� ���� ���Һ��� ť�� �ִ� i��° ���Ұ� �߿䵵�� Ŭ ��� 
					if(front[1] < q.get(i)[1]) {
						
						// ���� ���� �� i ������ ���ҵ��� �ڷ� ������.
						q.offer(front);
						for(int j = 0; j < i; j++) {
							q.offer(q.poll());
						}
						
						// front���Ұ� ���� ū ���Ұ� �ƴϿ����Ƿ� false�� �ϰ� Ž���� ��ħ
						isMax = false;
						break;
					}
				}
				
				// front ���Ұ� ���� ū ���Ұ� �ƴϿ����Ƿ� ���� �ݺ������� �Ѿ
				if(isMax == false) {
					continue;
				}
				
				// front ���Ұ� ���� ū ���ҿ����Ƿ� �ش� ���Ҵ� ����ؾ��ϴ� ������.
				count++;
				if(front[0] == M) {	// ã���� �ϴ� ������� �ش� �׽�Ʈ���̽� ����
					break;
				}
 
			}
 
			sb.append(count).append('\n');
 
		}
		System.out.println(sb);
	}
}



















