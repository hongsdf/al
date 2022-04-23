package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class card2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int p[] = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 1; i <=N; i++) {
			p[i] =  Integer.parseInt(st.nextToken());
		}
		
		/* ī������ �����ϱ� ���� �ּҰ� ����*/
		// (1 �� N �� 1,000) 1000 * 100000 = 100000000

		//(1 �� Pi �� 10,000)
		// �ּҰ� ������ �ʱ�ȭ�� ������Ѵ�.
		int d[] = new int[N+1];
		for(int i = 1; i<=N; i++) {
			d[i] = 100000001;
		}
		
		
		d[0] = 0; //�ϳ��� ���� ���ϸ� 0�� 
		for(int i = 1; i<=N; i++) {
			for(int j = 1; j<=i; j++) { // ����(i)���� ������ �ѵ鸸 ���ð���
				if(d[i] > d[i-j] + p[j]) {
					d[i] = d[i-j] +p[j] ;
				}
			}
		}
		System.out.println(d[N]);
		
	}
}
