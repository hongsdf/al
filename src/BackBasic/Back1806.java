package BackBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1806 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i <N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// Two Pointer
		int FirstPointer = 0; int SecondPointer = 0;
		// FristPointer := �� ������ ���̰��� sum�̻��� ��� [SecondPointer,FirstPointer] ���� ���� ��� �󱸰� ���� 
		// SecondPointer := ù��° ������ ���� ~ �ι�° ������ ���� ���� < S ���� ������ �ι�° �����͸� �̵�
		int sum = 0;// ���� ��
		int ans = Integer.MAX_VALUE;
		while(true) {
			if(sum >= S) { // ù��° �����Ͱ� �����̴� ���:= ���� ���� S �̻� �� ���
				// ���� 
				sum -= arr[FirstPointer++]; // sum�� S���� �۾����� ����  FirstPointer �̵�
				ans = Math.min(ans, SecondPointer - FirstPointer+1 ); // SecondPointer - FirstPointer+1 := �䱸�� ����
				
				
				
				
			}else if(SecondPointer == N) { // �ι�° �����Ͱ� ������ ���� ���� ���
				break; // �迭���� ��� ��ȸ
			}else { // S���� sum�� �������
				sum += arr[SecondPointer++];
			}
			
			
		}

		if(ans == Integer.MAX_VALUE) { // �Ұ����� ���
			System.out.println(0);
		}else { // �ּ� ���� ���
			System.out.println(ans);
		}
		
		
	}
}
