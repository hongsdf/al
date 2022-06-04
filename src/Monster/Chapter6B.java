package Monster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter6B {
	public static int cnt = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		hinoi(N, 1, 2, 3);
		System.out.println(cnt);
	}
						// �ᱹ ���������ġ���� --> ������������ �̵��ϴ� ��
						// �ٽ� := �Ű��������� ���ϴ��� ��ġ�� ������ ����
						// ( o, , x,) �ᱹ := o --> x�� �̵� �ϴ� ��
	static void hinoi(int N, int from, int mid, int to) {
			// ��� �ϳ��� �ű��.
			if(N == 1) {
				System.out.println(from+"->"+to);
				cnt++;
				return;
			}
		//	n-1���� ������� ->  �߰� ���
			hinoi(N-1,from,to,mid) ;
		// 1�� ������� --> ������ ���
			System.out.println(from+"->"+to);
			cnt++;
		// �߰����� -> ���� ���
			hinoi(N-1,mid,from,to);
	}
}