package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solvedac1312 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int ans = A%B;
		// ���1
////		System.out.printf("%."+10+"f",(double)(A/B));
//		String str1 = String.valueOf((A/B));
//		String str = Double.toString(A/B);
//		// ��ġ�� 0 ���� ���� �������� �����ϰ� ������ �����ϱ� ������
//		//0��.�� ���ڴ� �����ϱ� ���� n+1�� ��ġ�� ���ڸ� ��� 
//
//		int ans = str1.charAt(N+1) - '0';
//		System.out.println(ans);
		
		// ���2
		// N�� ������ �ݺ�
		for(int i = 0; i <N-1; i++) {
			ans *= 10;
			ans %= B; // ���ڸ����� ����
		}
		ans *= 10;
		System.out.println(ans/B);
	}
}
