package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back11003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		//�Է���
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i <N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// ����
		// �迭�� ��ȸ�ϴٰ� �������� �� ������ M�� �Ǹ� ����Ǽ� ++
		// �������� M�̸��� ���̸� ��� ����
		// ������ ���ϴٰ� M�� �ʰ� �ϸ� break;
		int sum = 0;
		int cnt = 0;
		// 10 5
		// 1 2 3 4 2 5 3 1 1 2
		for(int i = 0; i<N; i++) { // 10,000 * 10,000 := 1�ʰ� �Ѿ��
			sum = 0;
			for(int j = i; j<N; j++) {
				sum += arr[j];
				if(sum == M) {
					cnt++; //����Ǽ� ����
					break;
				}else if(sum > M) {
					break; // M�� �ʰ��Ѱ�� break
				}
				
			}
		}
		System.out.println(cnt);
	}
}
