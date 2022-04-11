package BackBasic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Stack;

/* ���� ���� ����
 	 1 ~ N���� ���� ���ÿ� ��´�
 	 �񱳴�� �迭���� stack�� ���ڿ� ��ġ�ϸ� pop()
  	 �迭 �ε��� ��ĭ ����
  	 ���� �迭�� ���� ��ġ�ϸ� pop()�ƴϸ� ã���� ���� push()
  
 
 
 
 */
public class Back1874 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		// �迭 ����
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		solve(arr);
		
		

	}

	private static void solve(int[] arr) {
		Stack<Integer> stack = new Stack<Integer>();
		int idx = 0; // 1�� �ȵǴ� ���� ó��  num : 1�̸� �ٷ� else������ ������ st�� ����ִ�
		StringBuilder sb = new StringBuilder();
		for (int num : arr) {
			if (num > idx) { // �ش� ���Һ��� ���������� +
				while (num > idx) { // �ش���� �������� 1 ~ num-1���� �Է��ޱ�
					stack.push(++idx); // �� ǥ���� �ͼ��� ����
					sb.append("+\n");
				}
				stack.pop(); // num == idx�� �������� pop
				sb.append("-\n");
			} else { // idx �� num���� Ŭ��
				if (stack.peek() != num) {
					System.out.println("NO");
					return;
				} else {
					stack.pop();
					sb.append("-\n");
				}
			}
		}
		System.out.println(sb.toString());
		
	}
}
