package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* n���� ������ �̷���� ������ ������ �־�����.
  �츮�� �� �� ���ӵ� �� ���� ���� �����ؼ� ���� �� �ִ� �� �� ���� ū ���� ���Ϸ��� �Ѵ�.
   ��, ���� �� �� �̻� �����ؾ� �Ѵ�.
  ���� �� 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 �̶�� ������ �־����ٰ� ����. ���⼭ ������ 12+21�� 33�� ������ �ȴ�.
  
  ������ ���� ��ȭ���� ��������
  ���� n���� �̷���� �ְ� ���Ӱ��� �����ؾ��Ѵ�
  D[N] = N������ �ִ� ���Ӱ��̴�.
  �׷� D[N]�� �ϼ��ϱ� ���� �ܰ踦 �����ؾ��Ѵ�.
  D[N]  = D[N-1] + arr[i] 
  
   10, -4, 3, 1, 5, 6, -35, 12, 21, -1��������
  ������ ��� ���� �ִ�.
  2��° ����  2������ �ϳ��� �����Ѵ�. �ִ� ������ 
  D[2] = D[2-1] + arr[2]
  D[2] = arr[2] 
  
  �׷��� D[N] = D[N-1]������ �������� �ִ� ���� ���� ���� �������̴�.
  
  
  
  
  */
public class ContingNUM {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i <N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// d[]
		int d[] = new int[N];
		for(int i = 0; i <N; i++) {
			d[i] = arr[i]; //�ϴ� �ڱ� �ڽ��� ���� �ִ밪���� �ʱ�ȭ
		}
		for(int i = 0; i <N; i++) {
			/* 2D �� ������� ���� ������ ? 
			  �����迭�� arr[]�� ������ �������Ƿ� ������ �ٲ��� �����Ƿ� ����̴�
			*/
			if( i - 1 >= 0) {
				if(d[i] < d[i-1] + arr[i]) {
					d[i] = d[i-1] + arr[i];
				}
				
			}
		}
		int ans = d[0]; // �ʱⰪ ����
		for(int i = 0; i <N; i++) {
			if(ans < d[i]) ans = d[i];
		}
		System.out.println(ans);
		
		
		
		
		
		
	}
}
