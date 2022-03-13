package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;


// �ٽ�����
// dfs + bfs �Լ��� ���� ����Ѵ� ==> dfs + dfs2()�� �����ص� �ȴ�(�ִ� �����̾ƴϰ� ���Ḹ �ϴ� �۾��̹Ƿ�)
// �迭3��   ���� <--> ���纻 <---> ���纻�� ���纻

public class Back14502 {
	public static int N;
	public static int M;
	// 3�� ���縦 �Ұ��̴�
	public static int[][] board;
	public static int[][] map; // ���� �迭 ���纻
	
	public static int[] dx = {-1,1,0,0};
	public static int[] dy = {0,0,-1,1};
	
	public static int answer = -1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		board = new int[N][M];
		map = new int[N][M];
		
		for(int i = 0; i <N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j <M; j++) {
				map[i][j] =	board[i][j] = Integer.parseInt(st.nextToken());

			}
		}
		
		for(int i = 0; i <N; i++) {
			for(int j = 0; j <M; j++) {
				if(board[i][j] == 0) {// ���� �迭 -- > ���纻
					map[i][j] = 1; // �迭���� 0�� �ϳ��� �� ������� �ִ� �� ã��  
					dfs(1); // ������ �۾�
					map[i][j] = 0; // dfs�� Ȯ���ϰ� �ٽ� ������
				}
				
			}
		}
		
		System.out.println(answer);
		
		
	}


	private static void dfs(int cnt) {
		if(cnt == 3) { // cnt�� 3(���� 3������� bfs() : ���̷��� ������ �Լ� )
//			bfs(); // �迭�� �ϳ��� �� Ȯ�� <-dfs() <- bfs() <-- Zero()
			dfs2();
			return;
		}
		for(int i = 0; i <N; i++) {
			for(int j = 0; j <M; j++) {
				if(map[i][j] == 0) { // ���纻 �迭���� Ȯ��
					map[i][j] = 1; //  ���������� 1���� ������ ����
					dfs(cnt+1); // cnt ����
					map[i][j] = 0; // �ٽ� ������
				}
			}
		}
		
		
		
	}

	private static void dfs2() {
		int [][] arr = new int[N][M];
		for(int i = 0; i <N; i++) {
			for(int j = 0; j <M; j++) {
				arr[i][j] = map[i][j];
			}
		}
		Stack<int[]> st = new Stack<>();
		for(int i = 0; i <N; i++) {
			for(int j = 0; j <M; j++) {
				if(arr[i][j] == 2) {
					st.push(new int[] {i,j});
				}
			}
		}
		while(!st.isEmpty()) {
			int curr[] = st.pop();
			int r = curr[0];
			int c = curr[1];
			for(int i = 0; i <4; i++) {
				int nr = r + dx[i];
				int nc = c + dy[i];
				if(nr < 0 || nr > N-1 || nc < 0 || nc > M-1) continue;
				if(arr[nr][nc] == 0) {
					arr[nr][nc] = 2;
					st.push(new int[] {nr,nc});
				}
			}
		}
		Zero(arr);
	}


	// ���̷��� ������ �Լ�
	private static void bfs() {
		int[][] copy_map = new int[N][M]; // ���纻�� ���纻
		for(int i = 0; i <N; i++) {
			for(int j = 0; j <M; j++) {
				copy_map[i][j] = map[i][j];
			}
		}
		Queue<int[]> q = new LinkedList<int[]>();
		for(int i = 0; i <N; i++) {
			for(int j = 0; j <M; j++) {
				if(copy_map[i][j] == 2) { // ���̷��� ��ǥ�� ť�� ����
					q.add(new int[] {i,j});
					
				}
			}
		}
		// ���̷��� ������ ����
		while(!q.isEmpty()) {
			int[] curr = q.poll();
			int r = curr[0];
			int c = curr[1];
			
			for(int i = 0; i <4; i++) {
				int nr = r + dx[i];
				int nc = c + dy[i];
				if(nr < 0 || nr > N-1 || nc < 0 || nc> M-1) continue;
			//  ���̷����� ���� 0�̸� ������(visited[]�� �ʿ����) 
			// 	����: 0�ε��� �����Ǳ� ������ 0�� �ƴϸ� �������� �ʱ� ����
				if(copy_map[nr][nc] == 0) { 
					copy_map[nr][nc] = 2;
					q.add(new int[]{nr,nc});
				}
					
			}
		}
		Zero(copy_map); // ���̷����� ������ �׶� 0�� �ټ��� Ȯ���ϴ� �Լ�
		
	}


	private static void Zero(int[][] copy_map) {
		int cnt = 0;
		for(int i = 0 ; i <N; i++) {
			for(int j = 0; j <M; j++) {
				if(copy_map[i][j] == 0) cnt++;
			}
		}
//		System.out.println("�ܰ躰"+cnt);
		answer = Math.max(cnt,answer);
	}
}
