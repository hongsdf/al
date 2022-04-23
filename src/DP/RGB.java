package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*  1�� ���� N������ ���� ĥ�ϴ� �� �̿��� ���� ���� ������ ĥ�� �� ���� 
  
  ��ȭ��
  d[i][j] = i��° ���� j ������ �ϼ�������  �ּҺ��
  
  �׷��ٸ� i-1��° ���� j���Ҷ� �ٸ� ������ �ϼ��ؿԴ�.
  
  
  i��° ���� R�� ĥ�ߴٸ� i-1��°�� G or B = >�� �� �� �ּ� ������� �ϼ� ���� ���̴�.
  i��° ���� G�� ĥ�ߴٸ� i-1��°�� R or B
  i��° ���� B�� ĥ�ߴٸ� i-1��°�� R or G
  
  d[i-1][j] = i-1������ 
  N(2 �� N �� 1,000)�� �־�����
  1,000���� �۰ų� ���� �ڿ���
  1000000 1������
 */ 
public class RGB {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[][] = new int[N+1][3];
		int d[][] = new int[N+1][3];
		for(int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine() , " ");
			for(int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
//		for(int i = 1; i <=N; i++) {
//			for(int j = 0; j <3; j++) {
//				if( i - 1 >= 0 && j-1 >= 0) {
//					// i��° ���� j�� ĥ�ߴٸ� i-1��° ���� j�� �ٸ� ���� ĥ���� ���̴�.
//					d[i][j] += Math.min(arr[i-1][j+1],arr[i-1][j-1]); 
//					
//				}
//				
//			}
//		}
		for(int i = 1; i<=N; i++) {
			/* 0 : R , 1 : G , 2 : B
			 
			 	�� �� ���� ������ ĥ�� �� �´�
			 
			 */
			
			d[i][0] = Math.min(d[i-1][1],d[i-1][2]) + arr[i][0]; // i��° ��ġ�� 0(=R)�� �ϼ������� ������ ���
			d[i][1] = Math.min(d[i-1][0],d[i-1][2]) + arr[i][1]; 
			d[i][2] = Math.min(d[i-1][1],d[i-1][0]) + arr[i][2];
		}
		/*3���� ���� �� ���ϴ� ���*/
		// �׷��� ���� N��° ���� ��ġ����
		// N��° ��ġ�� 0(=R)�� �ϼ������� ������ ���, N��° ��ġ�� 1(=G)�� �ϼ������� ������ ��� , N��° ��ġ�� 2(=B)�� �ϼ������� ������ ���
		System.out.println(Math.min(d[N][2], Math.min(d[N][0],d[N][1]) )) ; 
		
		
			
		
	}
}
