package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* N��°������ �����ϴ� �ִ� ��� = N-i��° ������ ��� + i��° ���                           */
/* D[N]  = D[N-i] + p[i]*/

/* ���̳����̶�� �����ϴ� �ٰ�
 * 
 * ī�带 ��� �ൿ�� ���� �����̴�.
 * 
 * 
 * 
 * */ 
public class cardpack {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int p[] = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 1; i <=N; i++) {
			p[i] =  Integer.parseInt(st.nextToken());
		}
		/*ù° �ٿ� �α԰� �����Ϸ��� �ϴ� ī���� ���� N�� �־�����.
		 *  (1 �� N �� 1,000)

			��° �ٿ��� Pi�� P1���� PN���� ������� �־�����. (1 �� Pi �� 10,000)
		 * 
		 * 
		 * 
		 * */ 
		int D[] = new int[N+1]; // N�� ���� ��� ��

		for(int i = 1; i<=N; i++) { // ī�� ���� N�� �� �ִ�.   1 ,2 ,3 ,4,5....
			for(int j = 1; j<=i; j++) { // ���� �ϳ��� ������ ���ε� ���� ������ ���� ���� ������ �ִ�.
				// ���� ��ȣ�� ���� ������ ����
				// 3���� 3���� ==> *�׷� �� 3�常 ���� �Ҽ� �մ�.
				// p[1] = 1
				// p[2] = 5
				// p[3] = 6
				
				// i��° �ѿ��� ������ �����Ҽ� �ִ� ī�� ���� j
				// 2��° ����  1,2���� ���� �Ҽ��մ�. 2���� ������ �غ��� �ִ�
				if( D[i] < D[i - j] + p[j] ) {
					D[i] =  D[i - j] + p[j];
				}
			
			}
		}
		
		System.out.println(D[N]);
		
	}
}
