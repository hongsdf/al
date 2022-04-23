package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Card1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int p[] = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 1; i <=N; i++) {
			p[i] =  Integer.parseInt(st.nextToken());
		}
		// ��ȭ��
		// d[N] = d[N-i] + d[i]
		// N���� �����ؾ��Ѵٸ� ������������ ��������
		//	 O + O + O..+	i���� �����ϰ� = N�� �Ǿ��� ���̴�.
	    // �׷��� i���� �����ߴٴ� ���� (=i��° ���� �����ߴٴ� ��)
	    // �׷��� �� �������� N-i�� ��� �����ؼ� �����ؿ������̴�.
	    // d[n] = d[n-i] + p[i](= i�� ����)
		// �������� ������ �����ϴ� ���̶� i���� �����ߴٴ� ���� (= i ������ �ǹ�)
		
		int d[] = new int[N+1];
		d[0] = 0;// �ϳ��� �������� ���� ���	0���� ���̴�.
		// ���� �� ���� �ִ�.
		// ī������ �����Ҷ� ����(i)��° �ѱ��� ���Ѵٴ� ���� j�� i���� ���� �����Ҽ� �ִ�.
		// ���� ���̳�?
		// 1���ѱ����� 1�Ѹ� �����Ҽ� �ִ�.
		
		// 2���ѱ����� 1,2�� 2���� ���
		// 3���ѱ����� 1,2,3 3���� ���
		// N���ѱ����� 1,2,3... n���� ���
		// �̹Ƿ� 
		// ���� �ڽ��� ���� ���� ���� ��� �ִ�.
		
		
		// ǥ�� ���
//		for(int i = 1; i<=N ; i++) { // ����
//			for(int j = 1; j<=i; j++) { // �������� ���� ǥ��
//				
//			}
//		}
		// �ð� ���⵵ N���� ã�ƾ��ϰ�  , N���� ĭ���� �� �ϴϱ� �ð����⵵ == O(N^2)
		for(int i =1; i<=N; i++) {
			for(int j =1; j<= i; j++) {
//	��ȭ��		d[i] = d[i-j] + p[j]; // �� ǥ��  (=i���������� �ѵ� ��)���� �����ؼ� �ִ밪�� ���Ѵ�
				//�ؼ�
				// 2�� ���̶�� �ϸ�
//				d[2] = d[2-1] + p[1]; ����Ǽ� 1 : 2������ 1�� ���������ʰ� �ϼ����� ��� + ������ 1������
//				d[2] = d[2-2] + p[2]; ����Ǽ� 2 : 2�ѱ��� 2�� ���������ʰ� �ϼ�������� + ������ 2�� ����
//				����� �� 1,2�� �� �غ��� �ִ밪�� ����
				
				if(d[i] < d[i-j] + p[j]) {
					d[i] = d[i-j] + p[j] ;
				}
				
						
			}
		}
		System.out.println(d[N]);
				
	}
}
