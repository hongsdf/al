package djk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class pri_dijkstra {
	public static int N,E,goal;
	public static int board[][];
	public static int di[];
	public static int INF = 987654321;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		goal = Integer.parseInt(st.nextToken());
		board = new int[N][N];
		di = new int[N];
		for(int i=0; i <N; i++) {
			for(int j =0; j<N; j++) {
				if(i ==j ) board[i][j] = 0;
				else board[i][j] = INF;
			}
		}
		
		// ���� ���� ���� �ʿ��� �κи� board[][]�� ������ �Ѵ�
		for(int i =0; i <E; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			board[u][v] = board[v][u] = cost;
			
		}
		// ����������� goal���� ������ã��
		dijkstra(0,goal);
		
//		for(int i=0; i <N; i++) {
//			System.out.print(di[i] + " ");
//		}
		System.out.println(di[goal]);
	}

	private static void dijkstra(int start,int goal) {
		// TODO Auto-generated method stub
		boolean visited[] = new boolean[N];
		PriorityQueue<int []> q = new PriorityQueue<int[]>((a,b) -> (a[1] - b[1]));
		// �켱���� ť ���� ����
	    //[0] : cost���
		// d[i] �ʱ�ȭ
		for(int i=0; i <N; i++) {
			di[i] = INF;
		}
		q.add(new int[] {start,0});
		di[start] = 0;
		
		while(!q.isEmpty()) {
			int[] curr = q.poll(); // q�� �������� ��ť �Ǿ����� curr[0 == cost]�� ���� ������ ���� ��ť�ȴ�.
			// �ִܰŸ��������� : �ּҺ���θ� �����ϸ� �ȴٶ�� ����
			int idx = curr[0];
			// ��ǥ������ ã���� �ٷ� ����
			if(idx == goal) return;
			if(visited[idx]) continue;
			
			visited[idx] = true;
			
			for(int j =0; j <N; j++) {
				if(di[j] > di[idx] + board[idx][j]) {    
					di[j] = di[idx] + board[idx][j];
					q.add(new int[] {j,di[j]}); // ã�������� ������ 
				}
			}
			
		}
	}
}
