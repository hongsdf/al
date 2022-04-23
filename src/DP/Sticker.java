package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* d[i][j] = 2 * i ���� �ִ� �� 
 * 
 * �ؼ� (i��) ����  j�� ��������� �ִ��� 
 * 
 * �׷���  i-1? j�� �����Ѱ��� ����� ���ƾ��Ѵ�.
 * 
 * ��ƼĿ ���� ��ƴ�(= �������� ���� ���Ʒ� ���Ǳ�)
 * 
 * n <= 100,000
 * arr[] ( 0<= arr[] <= 100)
 * 
 * 10000000
 * 
 * */
public class Sticker {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T --> 0 ) {
			int n = Integer.parseInt(br.readLine());
			int arr[][] = new int[n+1][2]; // �� ���� ��,�Ʒ� ���Ҹ� n�� �Է¹޾ƾ��Ѵ�. => ��� ���� ����� �Է¹ޱ�?
			// �ϴ� �������� 2���� ���Ұ� �ִ�.(= ��, �Ʒ�)
			// �Է� ������
//			50 30 100   �̷��� �Է� ������ [50,10] [ 30,20] �̷��� �������� 
//			10 20 70
			
			// �׷��� �̷��� ����  [  [  ,  ]
//								  [  ,  ]
//							      [  ,  ]
//							      [  ,  ]
//								  [  ,  ] ]
			
			
			// �̷��� �Է¹����� �����
//			for(int i = 0; i < 2; i++) {
//				StringTokenizer st = new StringTokenizer(br.readLine()," ");
//				for(int j = 1; j<=n; j++) {
//					arr[i][j] = Integer.parseInt(st.nextToken());
//					
//				}
//				
//			}
			
			
			// ���� ���Ҹ� ���� �Է� �ޱ�
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int i = 1; i<=n; i++ ) {
					arr[i][0] = Integer.parseInt(st.nextToken());
				
			}
			// �Ʒ� ���Ҹ� ���� �Է¹ޱ�
			st = new StringTokenizer(br.readLine()," ");
			for(int i = 1; i<=n; i++ ) {
					arr[i][1] = Integer.parseInt(st.nextToken());
				
			}
			
			
			
			
			// i��° ������ �� �� �� �� ����Ǽ�  0.�����, 1.���� �����, 2.�Ʒ��� �����
			int D[][] = new int[n+1][3]; // �ѿ��� 3���� �ൿ�� �� ���ִ�.
			// �ð������� [ 0 , 1 , 2 ] [ , , ] [ , , ] [ , , ] .. �̷����̴� �ǹ̴� [, , ] : �ϳ��� �ѿ��� �ൿ�� �ǹ��ϰ� 0,1,2�� ������ ���� �ǹ�
			
			for(int i = 1; i<=n; i++) {
				D[i][0] = Math.max(D[i-1][2], Math.max(D[i-1][0], D[i-1][1])) ;
				D[i][1] = Math.max(D[i-1][0], D[i-1][2]) + arr[i][0]; // ���� ���� ����  (�̰��� �����ϱ� �ؾ��Ѵ�.)
				D[i][2] = Math.max(D[i-1][0], D[i-1][1]) + arr[i][1]; // �Ʒ� ���� ����
				/*arr[][] =  �� , �Ʒ�
				 * 			
				 * 			[50,  10]
				 * 			[30,  20]
				 * 			[100, 70] 
				 * */
				
			}
			int ans = 0;
			ans = Math.max(D[n][2], Math.max(D[n][0], D[n][1]));
			System.out.println(ans);
			
		}
	}
}
