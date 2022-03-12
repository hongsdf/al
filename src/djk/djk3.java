package djk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class djk3{
	public static int N,E;
	public static int[][] board;
	public static int distance[];
	public static int INF = 987654321;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		board = new int[N+1][N+1];
		distance = new int[N+1];
		
		// board�ʱ�ȭ �ڱ��ڽŰ��� cost�� 0, �ڽſ� �ٸ� ���� �ִ�ġ�� �ʱ�ȭ
		for(int i =0; i<N; i++) {
			for(int j =0; j <N; j++) {
				if(i==j) board[i][j] = 0;
				else board[i][j] = INF;
			}
		}
		// 6 9
//		0 1 50
//		0 2 30
//		1 3 30
//		1 4 70
//		2 3 20
//		2 4 40
//		3 4 10
//		3 5 80
//		4 5 30
//		
		
		// �ʱ�ȭ�� board[][] �迭���� ������ �ִ� �κп��� cost��� 
		// ������� �ʴ� �κ��� ������ INF
		for(int i =0; i <E; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			board[u][v] = board[v][u] = cost;
		}
		dijkstar(0);
		for(int i =0;i<N; i++) {
			System.out.print(distance[i]+" ");
		}
	}



	private static void dijkstar(int start) {
		// [0] : cost, [1] : ��� index
		PriorityQueue<int[]> q = new PriorityQueue<>((a,b) ->( a[0] - b[0]));// ���ٽ� ǥ�� : cost�� ª�� ���� �켱������ ��ť
		q.offer(new int[] {0,start}); // start�� 0,1,2.. �̵� �ڱ��ڽſ� ���� cost : 0
		for (int i =0 ; i <N; i++ ) {
			distance[i] = INF; // ����������� ��������� �����Ͽ����� ���� �迭 �ʱ�ȭ
		}
		//[0,start] �ǹ� : start�� 0�̶�� start�������� �ڱ��ڽ� �Ÿ��� 0 
		boolean visited[] = new boolean[N+1];
		distance[start] = 0; // ���� ���� 0���� �ʱ�ȭ
		 
		while(!q.isEmpty()) {
			int[] curr = q.poll();
			int a = curr[1]; // curr[1] �� �ǹ� : 
			// ��������� ���� index ��ť
			
			if(visited[a]) continue;
			
			visited[a] = true; // �湮 ���� üũ
			
			for(int j =0; j <N; j++) {
				// distance[j] :���� ����������� �� �������� �Ÿ��� ���Ұǵ�
				// j�� ���� �ϳ��� ���Ѵ� 
				// distance[a] + board[a][j] : �̶� ������� a�� ���� �̾��� ���� �� ������ �����Ѵ�
				// distance[a] + board[a][j]
				if(distance[j] > distance[a] + board[a][j]) {
					distance[j] = distance[a] + board[a][j];
					q.offer(new int[] {distance[j], j } );
					// q�� ���̴� ���� �ش� ����� ���� ��常 ����ȴ�
					// ���� : distance[2] == INF��
					
					// ���� 1���� 
					// distance[1] == INF > distance[a] :��� ������ ���� + board[a][1] �� ����Ǿ��ִٸ�
					// ť�� ��ť
					// ����Ǿ� ���� ������
					// distance[1] == INF > distance[a] + board[a][1] == INF ��
					// �׷��Ƿ� INF > distance[a] + INF ������ �ȵȴ�
					
				}
				
			}
		}
		
		
	}
}
