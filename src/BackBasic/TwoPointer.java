package BackBasic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class TwoPointer {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		 st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i <N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// ���ӵ� �� : ���̰� ���������ʾҴ�. ������ �����̵� ��� x
		// ������ �����̵� ����� k�� ������ߵȴ�
		
		// 2���� �����͸� ����� �׻��̰��� S ���̶� ���Ѵ�.
		int FirstPointer = 0;
		int SecondPointer = 0;
		int sum = 0; // 1������
		int min = Integer.MAX_VALUE;
		while(true) {
			if(sum >= S) { // ù��° �����Ͱ� �����̴� ���
				sum -= arr[FirstPointer++];// ���̰��� S���� �۾��������� FirstPointer �̵�
				// �׶��� �� �����Ͱ� ���� ����
				min = Math.min(min, SecondPointer - FirstPointer +1);
			}
			// Ż������
			else if(SecondPointer == N) break; // �ι�° �����Ͱ� ������ �����ϸ� 
			else {
				sum += arr[SecondPointer++];
			}
		}
		bw.write(min+"\n");
		
		bw.flush();
		
		 
//		10 15
//		5 1 3 5 10 7 4 9 2 8
	}
}
