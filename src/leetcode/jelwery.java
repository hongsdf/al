package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class jelwery {
	public static int N; //���� ����
	public static int E; // ���� ����
	public static int board[][]; // �������
	public static int d[]; //���ͽ�Ʈ�� �������� ���� ����
	public static int INF = 999990088;
	public static int diamond[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		E = sc.nextInt();
		
		board = new int[N+1][N+1];
		d = new int[N+1];
		diamond = new int[N+1] ; // �� ������ ���� ����
		for(int i =1; i<=N; i++) {
			for(int j =1; j <=N; j++) {
				if(i == j ) board[i][j] = 0;
				else board[i][j] = INF;
			}
		}
		
		// ���� ���� �Է�
		for(int i =0; i<E; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int cost = sc.nextInt();
			// ����� �׷���
			board[u][v] = board[v][u] = cost;
		}
		
		// ���� ���� �Է�
		for(int i =1; i<=N; i++) {
			diamond[i] = sc.nextInt();
		}
		
		dijk(1);
		
		// ����
		int answer = -1;
		int max = 0;
//		Integer ans[] = new Integer[N+1];
		for(int i=1; i<=N; i++) {
			System.out.println(diamond[i] - (2 * d[i]));
//			ans[i] = diamond[i] - (2 * d[i]);
//			answer = Math.max(diamond[i] - (2 * d[i]),answer);
			if(answer < diamond[i] - (2 * d[i])) {
				answer = diamond[i] - (2 * d[i]);
				max = i;
			}
			
			
		}
//		Arrays.sort(ans,Collections.reverseOrder());
		System.out.println("��ġ��ȣ"+max);
		System.out.println("ȿ���� ���� ��� : "+answer);
		
	}
	private static void dijk(int start) {
		// �Ÿ� �ʱ�ȭ
		for(int i=1; i<=N; i++) {
			d[i] = INF;
		}
		d[start] = 0; //���� ���� �ʱ�ȭ
		// �켱 ���� ť ���� �Ÿ��� ª�� ������� ��ť
		PriorityQueue<int[]> q = new PriorityQueue<int[]>((a,b)->(a[1]-b[1]));
		q.add(new int[] {start,0});
		while(!q.isEmpty()) {
			int curr[] = q.poll();
			int idx = curr[0];
			for(int i = 1; i<=N; i++) {
				if(d[i] > d[idx] + board[idx][i]) {
					d[i] = d[idx] + board[idx][i];
					q.add(new int[] {i,d[i]});
				}
			}
		}
		
		
	}
}
