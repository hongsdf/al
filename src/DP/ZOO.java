package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ������ ���� �����ϱ�(���� �� ���θ� ����� ���)
 * 
 *  �������� 2 * n �迭�� �־�����.
 *  
 *  ��ġ�� �ʰ� ������ ��ġ�Ѵ�
 *  
 *  ������ ���� �� n�̴�(�����̹Ƿ� ����)
 *  
 *  0�� �ٿ��� [  ] [   ] ����Ǽ��� 3�����ִ�.
 *  1���� [][]
 *  2���� [o][]
 *  3���� [][o]
 * 
 * 	�׷��� 1�� ���� �����غ���
 *  0 ������ [][]���
 *  1 ������ [ ][ ]
 *  	   [o][ ]
 *          [ ][o]
 *          
 *  0 ������ [][o]���
 *  1 ������ [ ][ ]
 *          [ o][] 
 *          
 *  0 ������ [o][]���
 *  1 ������ [ ][ ]
 *          [ ][o] �̴�
 *          
 *                         
 *  �׷��� i��° ����ġ��
 *  d[i][0]  = i��° ��ġ�� 0���� ������ ��� - > i-1�� 3���� ����
 *  d[i][1] = i���� ��ġ�� 1�� ������ ��� -> i-1 2����
 *  d[i][2]  = i��° ��ġ�� 2���� ������ ��� -> i-1 2����
 *  
 *                          
 * 
 *  
 * 
 * 
 * 
 * */
public class ZOO {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int d[][] = new int[N+1][3]; // 3 : ����� ���� �ǹ�
		d[0][0] = 1; // �ʱⰪ ���� �ƹ��͵� �������� �ʾҴ�.
	
		for(int i = 1; i <=N; i++) {
			d[i][0] = (d[i-1][0] + d[i-1][1] + d[i-1][2]) % 9901; // i���� ��ġ���� 0���� �����ٸ� i-1��° ��ġ�� ��� ��������?
			d[i][1] = (d[i-1][0] + d[i-1][2]) % 9901;
			d[i][2] = (d[i-1][0] + d[i-1][1]) % 9901;
		}
		System.out.println((d[N][0] + d[N][1] + d[N][2])%9901 );
		
		
		
	}
}
