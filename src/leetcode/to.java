package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class to {
	
	 static class pointer{
		int x;
		int y;
		int day;
		pointer(int x, int y, int day){
			this.x = x;
			this.y = y;
			this.day = day;
		}
	}
	
	
	public static int M,N;
	public static int board[][];
	public static boolean visit[][];
	public static int dx[] = {-1,1,0,0};
	public static int dy[] = {0,0,-1,1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt(); // ��
		N = sc.nextInt(); // ��
		board = new int[N][M];
		visit = new boolean[N][M];
		
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<M; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		bfs();
	
		
		
		 
	}
	private static void bfs() {
		// ���� �丶�䰡 ������ �̸� ������� �������̴�. := ���⼭�� ����� �������� ���� ����ϴ� ������ �ٽ�
		// �丶�� ������ ���ؼ� visit[][]Ȱ������ �ʾҴ� := ���ο� ������ �� ��ü�� �����ϱ� ������ board[nr][[nc] = 1;
		// visit�� Ȱ���Ҷ� := ���� ������ �����Ҷ� ���� ����Ѵ�.
		Queue<pointer> q = new LinkedList<pointer>();
		int day = 0;
		// ������� ��� q�� ��´�
		for(int i = 0; i <N; i++) {
			for(int j = 0; j<M; j++) {
				if(board[i][j] == 1) {
					q.add(new pointer(i,j,day));
				}
			}
		}
		
		while(!q.isEmpty()) {
			pointer curr = q.poll();
			int Row = curr.x;
			int Col = curr.y;
			day = curr.day;
			// ������ �丶�� Ž��
			for(int i = 0; i<4; i++) {
				int nr = Row+dx[i];
				int nc = Col+dy[i];
				// ���� ����
				if(nr < 0 || nr> N-1 || nc <0 || nc > M-1) continue;
				if(board[nr][nc] == 0) {
					board[nr][nc] = 1; //�;��� ǥ��
					q.add(new pointer(nr,nc,day+1));
				}
			}
			
		}
		//�丶�䰡 �� �־����� üũ
		boolean flag = check();
		if(flag) {
			System.out.println(day);
		}else {
			System.out.println(-1);
		}
		
		
	}
	private static boolean check() {
		for(int i = 0; i <N; i++) {
			for(int j = 0; j<M; j++) {
				if(board[i][j] == 0) { //�������� �丶�䰡 �����Ѵٸ�
					return false;
				}
			}
		}
		return true;
	}

	
	
}
