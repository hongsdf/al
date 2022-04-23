package BackBasic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

/*�迭���Ҿȿ��� �ڽź��� �����ʿ� ��ġ�� ū���� ���� ���ʼ� ã��
 	[3,5,2,7] -> [5,7,7-1]
 */

// n = 1,000,000 �̸� O(N^2) ���� Ǯ�� �ȵ�

/* ���� ���� 
 	1.���ʹ������� �迭�ȿ��� ���Ҹ� ���Ҷ� :  ������ ������ �� �� �ִ�. 0 ---> 3, 1---->3, 2---->3
 	2. �� �Ҷ� ������ ���� ���Ҽ��� ������ , �迭�� �ε����� Ȱ���Ͽ� ���� �Ҽ� �ִ�. ans[st.peek()]
 	3. ���� ������ ���غ��� ���� ���� st push�ϰ�, ū ���� �߰ߵǸ� st.peek() �ϸ� ���� ��ü�Ѵ�. �̶� �ش� ���� �ε����� �����Ѵ�.
 	
 
 */

public class ONum { // O(N^2)
	public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			int arr[] = new int[N];
			int result[] = new int[arr.length]; // ���� �迭
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int i = 0; i <N; i++) {
				arr[i] = Integer.parseInt( st.nextToken() );
			}
			// [3,5,2,7]
			// ������ ��� �����غ��� ������ �����϶��� ���� ����
			// �ڽź��� ���� ���� �ε����� ���� push()
			// ���Ҷ� <--- �ڽź��� ���� ���� �ε����� ����
			Stack<Integer> stack = new Stack<>();
			stack.push(0);
			for(int i = 1; i<N; i++) {
				
				// 3 (idx 0), 5
				// 5
				while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
					result[stack.peek()] = arr[i];
					// �ڽ� ���� ū���� �߽߰� ���� ��ü
					stack.pop();
				}
				// ��ü�� �ϰ� �Ǹ� 5�� ���� ���� �ִ� ���� �ƴ϶� 5�� idx ==1 �� �ִ´�
				stack.push(i);
			}
			// 7�� �ش��ϴ� idx 3�� �ִ´�.
			while(!stack.isEmpty()) {
				result[stack.pop()] = -1;
			}
			BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
			for(int ans : result ) {
				bw.write(ans+" ");
			}
			bw.flush();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*��ū�� ������ ����� idx�� ����Ͽ� �ذ��Ѵ�.*/
//			stack.push(0); // arr[]�迭�� ù��° ��Ҹ� ����Ű�� idx
//			
//		   
//			
//			for(int i = 1; i < N; i++) {
//				if(stack.isEmpty()) {
//					stack.push(i);
//				}
//				//   5 2 7 ��� ���忡�� 2�� ��ū���� �ƴϴ� �׷��Ƿ� 2�� �ٽ� �״´�. ���� 5��ġ ��ū���� ������ ���� ����
//				//  ������� ���������� �����ϸ� 5��ġ�� ã�´�.
//				// ����:
//				// �ڽź��� ���� ���� �ε����� stack�� �״´�.
//				// �ڽź��� ū ���� �ε����� ����� �ݿ�
//				while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) { // stack�� top�� �մ� ��Һ��� ũ�� 
//					// ����� idx��ȣ�� ���� �ְ� top�� �����.
//					result[stack.peek()] = arr[i];
//					stack.pop();
//				}
//				stack.push(i);
//				
//			}
			                                                                                    
		
		
		
		
		
		
		
		
		
		
		
		
//		int arr[] = new int[] {9,5,4,8};
//		int result[] = new int[arr.length];
//		for(int i = 0; i<arr.length; i++) {
//			boolean flag = false;
//			for(int j = i+1; j<arr.length; j++) {
//					if(arr[i] < arr[j]) {
//						result[i] = arr[j];
//						flag = true;
//						break;
//					}
//					
//				
//			}
//		}
//		// ������ �����̵� ū���� ã�� ���ϸ� ���� ���Ҹ� -1��
//		for(int i = 0; i <result.length; i++) {
//			if(result[i] == 0) {
//				result[i] = -1;
//			}
//		}
	}
}
