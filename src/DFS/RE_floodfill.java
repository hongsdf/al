package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// �̷� ã�� ���� : bfs�� ���� , dfs�� �� ���� ���� ������?
public class RE_floodfill {
	public static int n;
	public static int m;
	public static int color;
	public static int board [][];
	public static int size;
	public static int answer = 0;
	public static int min = 9999;
	
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
//		color = Integer.parseInt(st.nextToken());
		
//		size = n+1; // size ������ : �������� ���õ� ��ŭ + 1
		board = new int[n+1][m+1];
		for(int i =1; i <n+1; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j =1; j <m+1; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
//		1 1 0 1 1 0
//		1 1 0 1 1 0
//		1 1 1 1 1 1
//		1 1 1 1 0 1
		dfs(1,1);
		System.out.println(answer);
		for(int i =1; i <n+1; i++) {
			for(int j =1; j <m+1;  j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
//		System.out.println("1,2 :" + board[0][5]);
	}
	




	private static void dfs(int r, int c) {
		// TODO Auto-generated method stub
		// base - case
		if(r < 0 || r > n || c < 0 || c > m) return;
		if(board[r][c] != 1 || board[r][c] == 0) return; // �߿� ����Ʈ :0 �� ĥ�Ҽ� �ִ�. //0�� �ƴ϶�� ���� ĥ���� �ְų� , ���� ������.
		answer++;
		if(r == n+1 && c == m+1 ) return ; // �������� ���� ������ ���� : n�� 4��� ������ n+1 == 5
		// ����: 0,0���� ������ �ƴ� 1,1���� �����Ͽ��� ���
		
//		System.out.println("n :"+n+"m:"+m);
		
		board[r][c] =2;
		if(min > answer) {
			min = answer;
		}
		
//		System.out.println(max);
		dfs(r-1,c);
		dfs(r+1,c); //
		dfs(r,c-1);
		dfs(r,c+1); //
		
		}
		// ��Ŭ��¡ �ν��Ͻ��� �Ҵ��� �����ؾ� �մϴ�.
		// static �ٿ�����
	
}
		