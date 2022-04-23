package DP;

import java.io.*;
import java.util.*;
/* �࿡ ���� ����   
 * */
public class test {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); 
		int K = Integer.parseInt(st.nextToken()); // ���� ����
		/* 0 ~ N ����  ����� ���� ���ϴ� ���α׷�
		 *  ���ؼ� 0���� N������ ���� K���� ���ؼ� �� ���� N
		 * */
		
		long d[][] = new long[K + 1][N + 1]; // N+1 : 0~ N, [N]�� �ƴϴ� x
		// �ʱⰪ
		 d[0][0] = 1; // ������ ���� �ƹ��͵� ���� ���� ����
		 
		// ��ȭ��
		 for(int k1 = 1; k1<=K; k1++ ) {
			 for(int i = 0; i<=N; i++) {
				for(int j = 0; j <= i; j++ ) {
					/* i���� k1���� Ȱ���Ͽ� ��������
					 * 
					 * k1-1 ���� i���� ���� �� �̴�.
					 * �׸��� j�� i���� ������ �̿��߸� �Ѵ�. ��?
					 * 
					 * �� ���캸��
					 * i == 1�̶��
					 * d[i] : 1�� ���� �ϼ��ؾ��Ѵ�.
					 * ���� j�� 1���� Ŀ ������ 1���� ū���� ������̴�.
					 * �׷��� ���ǿ� ���� �ȴ�.
					 * 
					 * ó��
					 * ����
					 * for(int j = 0; j<=N; j++ ){
					 * 
					 * } ���� �ִٰ� ����������
					 * 
					 * i���� �ϼ��ϱ����� j�� ���Ұ��̸� i���� ū ���� ����� �ȵȴ�.
					 * 
					 * 
					 * �׷���
					 * d[i-j] :�ؼ��ϸ�
					 * i =3 �̸�
					 * 
					 * j : 0,1,2,3 �� ���� 3�� �ϼ��ϸ� �ȴ�. (= j�� 4�� ���ԵǾ��մٸ� �̹� 3�� �Ѵ´� ����  )
					 * 
					 * ������ �ؼ��ϸ�
					 * d[i][k1] = d[i-j][k1-1] : k1������ Ȱ���Ͽ� i�� �����  =  k1-1�� �������� i���� ������ ���� �����Ͽ� �����.
					 * */
					d[k1][i] += d[k1-1][i-j]; /* + ����Ǽ��� �ƴϸ�  d[i-j][k1-1] + d[i] �� ���̴�.*/ 
					// i ������ ���� �� j�� �ϳ��� ����� i�� �ϼ��ϴ� ���
					
				}
			}
			
		}
		System.out.println(d[K][N]);
		
    }
}