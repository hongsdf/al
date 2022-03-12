package djk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//����������� goal���� ������ã�� 
// �ð� ���⵵ o(n * logn)
// ��߳�忡�� �ٸ� ��� ��带 �����Ҷ� �ִܰŸ�����

// ���ͽ�Ʈ��� 1�����迭�� �̿� d[]
// d[] �� ��� ��带 �������� �ٸ� ������� ���ᰪ�� ���� �ʱ�ȭ �Ѵ�
// �׸��� d[]�� ����Ž���� �ϸ� ���� ���� ���� �����ϸ� �߰��������� �ϳ��� �����ϸ� 
// d[i] > d[�߰�����] + arr[�߰�����][i]
// (������� -> ��������) > ((������� -> �߰�����) + (�߰����� -> ��������))
 


public class pri_dijkstra3 {
	public static int N;
	public static int E;
	public static int arr[][];
	public static int d[];
	public static boolean visited[];
	public static int INF;
	public static int goal;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken()); // ��� ����
		E = Integer.parseInt(st.nextToken()); // ���� ����
		goal = Integer.parseInt(st.nextToken()); // ��ǥ����

		arr = new int[N + 1][N + 1];
		d = new int[N + 1];
		visited = new boolean[N + 1];
		INF = 1000000;

		// arr �ʱ�ȭ
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (i == j)
					arr[i][j] = 0;
				else
					arr[i][j] = INF;
			}
		}
		// ��������ŭ ����
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int v = Integer.parseInt(st.nextToken());
			int u = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			arr[v][u] = arr[u][v] = cost;

		}
		dijkstra(1, goal);
 
		// ����������� ��ǥ�������� �ִ� �Ÿ�����
		System.out.println(d[goal]);
		
	}

	private static void dijkstra(int start, int goal) {
		// <int[]>((a,b)) : int[] �迭���� �� �ΰ� int[] a, int[] b�� ��
		// �� a : int[] a , b : int b[]
		PriorityQueue<int[]> q = new PriorityQueue<int[]>((a, b) -> (a[1] - b[1]));
		// �켱���� ����
		// ���ÿ� �������� ������ �켱�������ؿ� ���� ��迭�Ѵ�(���� �����϶�)
		// �����迭�� ����Ѵ� int[]
	
		
		for (int i = 1; i <= N; i++) {
			d[i] = INF;
		}
		q.add(new int[] { start, 0 });
		d[start] = 0; //��� ���� �ڱ��ڽŰ��� �Ÿ� �ʱ�ȭ
		
		
		while (!q.isEmpty()) {
			int curr[] = q.poll();
			int idx = curr[0]; // �ش� ����
			// ��ǥ������ ã���� ����
			if (goal == idx)
				return; 
			
			
			if (visited[idx])
				continue;

			visited[idx] = true;

			for (int i = 1; i <= N; i++) {
				
					if (d[i] > d[idx] + arr[idx][i]) {
						
						// INF > INF + 3,4,5..
						
						d[i] = d[idx] + arr[idx][i];
						q.add(new int[] {i,d[i]}); //  ����������� �������� ���� ��
					}
				
			}

		}

	}
}
