package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* Ʈ�� ����
 * 
 * ���� Ʈ��
 *      3
 *    2   1
 *  3  4  5  6
 * 
 *  �� �ﰢ�� Ʈ�� ���̰� n�̸� int arr[][] = new int[n][n]���� ����
 *      3           3 0 0 
 *    2   1    =>   2 1 0
 *   3  4  5        3 4 5
 * 
 *  
 * 
 * */
public class Triangle {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[][] = new int[N+1][N+1];
		for(int i = 1; i<=N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j = 1; j<=i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// �ʱⰪ
		int d[][] = new int[N+1][N+1];
		d[1][1] = arr[1][1];
		
		// ��ȭ�� : Ʈ�� ���� dp ���� �ڽ�, ������ �ڽ�
		for(int i = 2; i<=N; i++) {
			for(int j = 1; j <=i; j++) {
				d[i][j] = Math.max( d[i-1][j-1], d[i-1][j] ) + arr[i][j];
			}
		}
		
		int ans = 0;
		for(int i = 1; i<=N; i++) {
			ans = Math.max(ans , d[N][i]);
		}
		System.out.println( ans );
	}
}
