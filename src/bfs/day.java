package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// �ִ� ���� ����
class pointer{
	int x,y,day;
	pointer(int x,int y,int day) { //day������ �߰��ϴ� ���� �ٽ� :  ���� ���庰 ���� �����ϱ� ���� ����
		this.x = x;
		this.y = y;
		this.day = day;
	}
}

public class day {
	public static int N,M,r,c;
	public static int[][] board;
	
	public static int[] dx = {-1,1,0,0};
	public static int[] dy = {0,0,-1,1};
	public static void main(String[] args) {
		// 0 0 0 0 0 
		// 0 1 1 1 0
		// 0 1 1 1 0
		// 0 1 1 1 0
		// 0 0 0 0 0
		// ������������ ������ �ɸ��°�? 
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		board = new int[N][M];
		r = sc.nextInt(); // ��������
		c = sc.nextInt(); // ��������
		
			
		
		for(int  i =0; i <N; i++) {
			for(int j =0; j <M; j++) {
				board[i][j] = sc.nextInt();
			}
			
		}
		
		bfs(0,0, r,c);
		
		for(int  i =0; i <N; i++) {
			for(int j =0; j <M; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		
	}
	private static void bfs(int i, int j, int r, int c) {
		boolean visited[][] = new boolean[N][M];
		Queue<pointer> q = new LinkedList<>();
		int day = 1;
		q.add(new pointer(i,j,day));
		board[i][j] = day; //  0,0(���������� ����
		
		while(!q.isEmpty()) {
			pointer curr = q.poll();
			day = curr.day; // ���� ���� �� day
			// ���������� �����ϸ�
			if(curr.x == r && curr.y == c) return; 
			
			if(visited[curr.x][curr.y]) continue;
			visited[curr.x][curr.y] = true;

			for(int a = 0; a< 4; a++) {
				int nr = curr.x + dx[a];
				int nc = curr.y + dy[a];
				
				if(nr < 0 || nr > N-1 || nc < 0 || nc > M-1) continue;
				if(!visited[nr][nc] && board[nr][nc] == 0) {
					board[nr][nc] = day+1; // ���� ��¥ + 1 �� ����
					q.add(new pointer(nr,nc,day+1)); // q.offer
				}
	
			}
			
		}
	}
}
