package BackBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class O {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 1,000,000
		// �������� := �迭����
		int arr[] = new int[n+1]; // 1,000,000
		// �󵵼� �迭
		int temp[] = new int[1000001];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i<=n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			temp[arr[i]]++;
		}
		
		
		// ��� �迭
		int D[] = new int[n+1];
		
		// ���1 : �ð��ʰ� 10�� x 10��
//		for(int i = 0; i<n; i++) {
//			// arr[0] ~ arr[n-1]
//			for(int j = i+1; j<n; j++) {
//				if(arr[i] < arr[j]) {
//					D[i] = arr[j];
//					break;
//				}
//			}
//		}
//		
//		for(int i = 0; i<n; i++) {
//			if(D[i] == 0) {
//				System.out.print(-1 + " ");
//			}else {
//				System.out.print(D[i]+" ");
//			}
//		}
		
		// ���2
		// stack ��� ���� : 
		// 1. ������
		// 2. ��->�ڷ� �����ϸ� ������ ��� �����Ҷ�
		// 3. ������
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		
		
		// �迭 ��ȯ
		for(int i = 2; i<=n; i++) {
			
			while(!stack.isEmpty() && temp[arr[stack.peek()]] < temp[arr[i]]) {
				D[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			D[stack.pop()] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i<=n; i++) {
			sb.append(D[i]+" ");
		}
		System.out.println(sb.toString());
		
		
		
	}
}
