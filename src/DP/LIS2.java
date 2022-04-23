package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* LIS + ������ ����
 * 
 * ���������������� ��ͷ� �����ϴ� ���� ���ϸ� ����� ���� ���ϴ� ���̴�.
  
 * */
public class LIS2 {
	public static int v[];
	public static int d[];
	public static int arr[];
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		arr = new int[N] ;
		for(int i = 0; i <N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// ��� �迭
		d = new int[N];
		// �������ϱ����� �迭
		v = new int[N];
		
		
		for(int i = 0; i <N; i++) {
			d[i] = 1;
			v[i] = -1; // �������� -1�� �ʱ�ȭ �ϰ� ����(�߰� �ڵ�)
		}
		
		for(int i = 1; i <N; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[j] < arr[i] && d[j] >= d[i]) {
					d[i] = d[j] + 1;
					v[i] = j; // �ٽ� �������� �ϱ� ���� (�߰� �ڵ�)
					// i��° ���� ������� ������ j��ȣ (�ٷ� ���� ��ȣ)
					// �״ϱ� i�� ����� ���� �� ��ġ
				}
			}
		}
		
		
		// int ans = -1;// ���̸� ��ȯ�ϴ� ���̾ƴ� ���� ����
		int ans = 0;
		int p = 0;// ������ ���� ���� ����
		
		
		for(int i = 0; i <N; i++) {
			if(ans < d[i]) { // ���� ������ ã�� 
				ans = d[i];
				p = i; // �׶��� ������ ��ġ�� �����Ѵ�.
			}
		} 
		/* ��� �Լ��� ���� ���� ������ ��ġ���� �������� �����Ѵ�*/
		sb.append(ans).append("\n");
		back(p);
		System.out.println();
		System.out.println(sb);                                              
		
	}
	
	private static void back(int p) {
		if(p ==  -1) return;// -1�̶�� ���� ������������ �ǵ��� �Դٴ� ��
		back(v[p]) ;
		sb.append(arr[p]).append(" "); // arr[p]�̴�
		/*v[p]�� �ƴϴ� -> �̰� ��ġ ���� �����ϻ�
			���� ������ �־���Ѵ�
		*/
		
	}
}
