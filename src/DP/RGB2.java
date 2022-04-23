package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[N+1][3];
		for(int i = 1; i<=N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j = 0; j< 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		/*3
		26 40 83
		49 60 57
		13 89 99*/
		// �ʱⰪ
		int d[][] = new int[N+1][3];
		d[1][0] = arr[1][0];
//		d[1][1] = arr[1][1];
		d[1][2] = arr[1][2];
		
		
		// ó�� ���� ������ ���� ���� �̿��� �ִٸ� ���� ���� �̴�.
		// 2~ N-1������ ����ó�� ������ �ϰ�
		// ó�� �κа� N�κ��� ó���� �־���Ѵ�.
		// Ǯ�� ����� 
		// ������, ó�� �� �ϳ��� �����ؾ��Ѵ�.
		// 2 �� N �� 1,000 , ���� ĥ�ϴ� ����� 1,000���� �۰ų� ���� �ڿ���
		int ans = 1000001;
		
		for(int k = 0; k< 3; k++) {
			/* K : 1�� ���� �ǹ� */
			for(int j = 0; j<3; j++) {
				if(j==k) {
					d[1][j] = arr[1][j];
				}else {
					d[1][j] = 1000001;
				}
			}
			
			// ��ȭ��
			for(int i = 2; i<=N; i++) {
				d[i][0] = Math.min(d[i-1][1], d[i-1][2]) + arr[i][0];
				d[i][1] = Math.min(d[i-1][0], d[i-1][2]) + arr[i][1];
				d[i][2] = Math.min(d[i-1][1], d[i-1][0]) + arr[i][2];
			}
			
			for (int j=0; j<=2; j++) {
				/* j : ������ ���� �ǹ�  ���������� 0 , 1, 2 �� �ϳ��� ĥ�ϰ� ù��° ���� �� */
				if (j == k) continue; /*ù��°���� ������ ���� ���� ������ �ǳ� �ڴ�. */
				ans = Math.min(ans, d[N][j]);
			}
			
		}
		System.out.println(ans);
		
		
		
		
		
//		// ������
//		d[N][0] = Math.min(d[N-1][1] + Math.min(d[1][2],d[1][1]) , d[N-1][2] + Math.min(d[1][2], d[1][1]));
//		d[N][1] = Math.min(d[N-1][0] + Math.min(d[1][2],d[1][0]) , d[N-1][2] + Math.min(d[1][2], d[1][0]));
//		d[N][2] = Math.min(d[N-1][0] + Math.min(d[1][1],d[1][0]) , d[N-1][1] + Math.min(d[1][1], d[1][0]));
//		
//		System.out.println( Math.min(d[N][2],Math.min(d[N][1], d[N][0])));
		
	}
}
