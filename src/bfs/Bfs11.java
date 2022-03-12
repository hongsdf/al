package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
// Ư¡ : �����(���۱���( ��� )�� ��������) ����������(���) ���� Ž�� �Ѵ�.
public class Bfs11 {
	public static int Max = 100001; // ������ �䱸 �� �´� ������ ������ �ϰ� ����.
	public static boolean visited[] = new boolean[Max]; //BFS/DFSŽ���� �ݵ�� boolean[] �迭 ���� :  ���⼱ ��带 Ž���ߴٴ� ��
	public static int board[][] = new int[Max][Max]; //2d �迭�� ����(������ ���� �̾��ֱ� ����)
	static int N; //��� ����
	static int E; //���� ����
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		E = Integer.parseInt(br.readLine());
		for(int i =0; i<E; i++) { // ������ �������ִ� �۾�
			int u = Integer.parseInt(br.readLine());
			int v = Integer.parseInt(br.readLine());
			board[u][v] = board[v][u] = 1;
		}
		bfs(0); // ���� ��� 
		
	}
	private static void bfs(int start) { //�����°��� ���� ������. queue�� ����
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		
		while(!q.isEmpty()) {
			int curr = q.poll(); //���� ��� �� ������
			if(visited[curr]) continue ; //�湮 ���� ������ üũ
			visited[curr] = true;
			System.out.println(curr+" "); // ���� ��� ���
			
			for(int i =0; i<N+1; i++ ) { // �湮���� �ʾҰ� ������� ����Ǿ������� q�� �߰��Ͽ� ����
				if(!visited[i] && board[curr][i] != 0) {
					q.add(i);
				}
			}
			// ������� ���� Ž�� ��
			
		}
	}
}
