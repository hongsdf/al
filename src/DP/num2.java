package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 
	����
	� �ڿ��� N�� �׺��� �۰ų� ���� ���������� ������ ��Ÿ�� �� �ִ�.
	���� ��� 11=3^2 + 1^2 +1^2
	�� ���� �ּҰ����� ���ϴ� ���α׷� 
	�׷��� D[N]  N������ �ּ����� ������ �����Ѵ�.
	
	
	1 �� N �� 100,000
	
	1 = 1^2 1����
	
	D[N] =   O O O O + i^2 = N
		O O O O = D[N-i^2] = N-i^2���� �ּ����ǰ����� �����Ѱ�


 */
public class num2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int d[] = new int[N+1]; // N���� �� �����
		// �ʱ�ȭ ó�� �κ� ~ ������ ����

		for(int i = 1; i <=N; i++) {
			/* j ��� ������ �ϳ� �߰� 
				�׷��� 2D 
			*/
			// �ʱ�ȭ 
			d[i] = i; 
			/*
			d[1] = 1�̴�
			d[2] = 2�̴� ��? ������ 1^2 + 1^2 1�� ���� ���� ����� �յ�.
			d[3] = 3�̴� 1 + 1+ 1
				:
			d[n] = n�̴� 1�� n�� ���Ѱ�	
			*/
			for(int j = 1; j*j<=i; j++) {
				if(d[i] > d[i-j*j] + 1) { // �������� +1�ϴ� ������ �����̱� �����̴�.
					/*
					  �ռ� 1,2,3���� ���ϱ� �ϼ� ������ ���캸��
					   O O O O + 1  = N  �������� 1�� ������ �Ǿ��ִ�. �̶� 1�� ����̴�
					   O O O O + 2  = N  �������� 2�� ������ �Ǿ��ִ�. �̶� 1�� ����̴�
					   O O O O + 3  = N
					   
					   
				
					   
					 */
					d[i] = d[i-j*j] + 1;
				}
			}
		}
		System.out.println(d[N]);
		
	}
}
