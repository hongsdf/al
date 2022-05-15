package Monster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Chapter5_B {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 1; i<=N; i++) {
			arr[i] = Integer.parseInt(st.nextToken()) ;
			
		}
		int D[] = new int[N+1]; // ��� �迭
		Stack<Integer> stack = new Stack<>();
		// �ݴ�� ��´�.
		// 6 9 5 7 4 ���� ������ �ε�����ȣ�� ��´�. 5��
		stack.push(N); 
		for(int i = N-1; i>=1; i--) {
			// 4������ 1������ ��ȸ�ϸ� ū�� ���̸� �߰��ϸ� ���� �ε��� ��ȣ�� 
			while(!stack.isEmpty() && arr[i] > arr[stack.peek()]) { // i�� ���̰� stack.peek()���̺��� ū ���
				D[stack.pop()] = i;
			}
			stack.push(i);
			
		}
		for(int i = 1; i<=N; i+=1) {
			System.out.print(D[i]+" ");
		}
	}
}
