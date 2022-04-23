package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  �����̴� ���� N��� ���ٲ����� �ϰ� �ִ�. �����̴� ���� �� S�� �ְ�, ������ A1, A2, ..., AN�� �ִ�.

  �����̴� �ɾ �̵��� �� �� �ִ�. �������� ��ġ�� X�϶� �ȴ´ٸ� 1�� �Ŀ� X+D�� X-D�� �̵��� �� �ִ�.
  �������� ��ġ�� ������ �ִ� ��ġ�� ������, ������ ã�Ҵٰ� �Ѵ�.

  ��� ������ ã������ D�� ���� ���Ϸ��� �Ѵ�. ������ D�� �ִ��� ���غ���.
  
  
  ��� ������ ã�� ���� �ִ밪
  S = 2�����̰� ���� n1,n2,n3... �������̴�
  n1,n2,n3..�������� ���� D�� ������ �����ϱ� ���Ѵٰ� �Ǿ��մ�.
  n1�Ѹ� ���÷� ���
  2 ~ 26�����̸�  26-2 = 24    1,2,3,4,6,8,12,24������ �����ϴ�(24�� ���)
  ������ ���������� n1�� �ִ� ���̾ƴ϶� Nn �������̸� �����鰣�� �������� ã�ƾ��� �� �� �������� gcd
  
  */
public class GCD_important {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken()); // ���� ��
		int S = Integer.parseInt(st.nextToken()); // ������ġ
		st = new StringTokenizer(br.readLine()," ");
		int arr[] = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] =  Math.abs(S - Integer.parseInt(st.nextToken()));
		}
		/* 3�� �̻� �ִ� �����?
			���� ans[0] ����
			1~ N���� ���Ҹ� ���ϴ� ��ͷ� ����
		*/
		int ans = arr[0];
		for(int i = 1; i<N; i++) {
			ans = gcd(ans,arr[i]);
		}
		/* N�� �̻��� �ִ� ����� ���� */
		System.out.println(ans);
		
	}

	private static int gcd(int x, int y) {
		if( y == 0) {
			return x;
		}else {
			return gcd( y ,x%y) ;
		}
		
	}
}
